package com.mycompany.santo.terco.service;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.ByteArrayInputStream;
import java.time.LocalDate;
import java.util.*;
import java.util.regex.*;

/**
 * Serviço que busca automaticamente as intenções mensais de oração do Papa
 * a partir do site oficial popesprayer.va.
 *
 * Fluxo:
 *  1. Consulta a API WordPress do popesprayer.va para descobrir o ID do
 *     termo de taxonomia "sjd_intention_year" correspondente ao ano atual.
 *  2. Localiza o post do tipo "sjd_intention" com slug "pt-brazil" para o ano.
 *  3. Obtém a URL do arquivo PDF em português via endpoint de mídia do WordPress.
 *  4. Faz download do PDF e extrai o texto com Apache PDFBox.
 *  5. Divide o texto por nome de mês para produzir 12 registros de intenção.
 *  6. Armazena o resultado em cache por 24 horas.
 */
@Service
public class IntencoesPapaService {

    private static final Logger log = LoggerFactory.getLogger(IntencoesPapaService.class);

    private static final String API_BASE = "https://www.popesprayer.va/wp-json/wp/v2";

    // Nomes normalizados (sem acentos) para busca no texto do PDF
    private static final String[] MESES_UPPER_NORM = {
        "JANEIRO", "FEVEREIRO", "MARCO", "ABRIL", "MAIO", "JUNHO",
        "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO"
    };

    // Nomes corretos com acentuação para exibição
    private static final String[] MESES_NOMES = {
        "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
        "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
    };

    private final RestTemplate restTemplate;

    // Cache simples: reset a cada nova renderização caso ano mude ou TTL expire
    private Map<String, Object> cachedResponse = null;
    private long cacheTime = 0;
    private int cachedYear = -1;
    private static final long CACHE_TTL_MS = 24L * 60 * 60 * 1000; // 24 horas

    public IntencoesPapaService() {
        this.restTemplate = new RestTemplate();
    }

    /**
     * Retorna um mapa com:
     *  - "ano"       : int — ano das intenções
     *  - "status"    : "ok" | "error"
     *  - "pdfUrl"    : String — URL do PDF oficial (quando disponível)
     *  - "intencoes" : List<Map> — lista com 12 intenções mensais
     *  - "erro"      : String — mensagem de erro (quando status = "error")
     */
    public Map<String, Object> getIntencoesDoPapa() {
        int ano = LocalDate.now().getYear();
        long now = System.currentTimeMillis();

        // Retorna cache se ainda válido
        if (cachedResponse != null && cachedYear == ano && (now - cacheTime) < CACHE_TTL_MS) {
            return cachedResponse;
        }

        try {
            // ── Passo 1: buscar o ID da taxonomia sjd_intention_year para o ano ──
            Map[] yearTerms = restTemplate.getForObject(
                    API_BASE + "/sjd_intention_year?_fields=id,name&per_page=50", Map[].class);

            Integer yearTaxId = null;
            int anoConsultado = ano;

            if (yearTerms != null) {
                for (Map term : yearTerms) {
                    if (String.valueOf(ano).equals(String.valueOf(term.get("name")))) {
                        yearTaxId = toInt(term.get("id"));
                        break;
                    }
                }
                // Se não encontrou o ano atual, tenta o ano anterior
                if (yearTaxId == null) {
                    for (Map term : yearTerms) {
                        if (String.valueOf(ano - 1).equals(String.valueOf(term.get("name")))) {
                            yearTaxId = toInt(term.get("id"));
                            anoConsultado = ano - 1;
                            break;
                        }
                    }
                }
            }

            if (yearTaxId == null) {
                return errorResponse(ano, "Intenções não encontradas para " + ano + " nem " + (ano - 1) + ".");
            }

            // ── Passo 2: localizar post PT-Brazil para o ano ──
            Map[] posts = restTemplate.getForObject(
                    API_BASE + "/sjd_intention?sjd_intention_year=" + yearTaxId
                            + "&per_page=100&_fields=id,slug", Map[].class);

            Integer postId = null;
            if (posts != null) {
                for (Map post : posts) {
                    String slug = String.valueOf(post.get("slug")).toLowerCase();
                    if (slug.contains("pt-brazil") || slug.contains("pt-brasil")
                            || slug.contains("pt-bra")) {
                        postId = toInt(post.get("id"));
                        break;
                    }
                }
            }

            if (postId == null) {
                return errorResponse(anoConsultado, "Arquivo de intenções em português do Brasil não encontrado para " + anoConsultado + ".");
            }

            // ── Passo 3: obter URL do PDF via endpoint de mídia ──
            Map[] mediaItems = restTemplate.getForObject(
                    API_BASE + "/media?parent=" + postId + "&_fields=source_url,mime_type", Map[].class);

            String pdfUrl = null;
            if (mediaItems != null) {
                for (Map media : mediaItems) {
                    if ("application/pdf".equals(media.get("mime_type"))) {
                        pdfUrl = String.valueOf(media.get("source_url"));
                        break;
                    }
                }
            }

            if (pdfUrl == null) {
                return errorResponse(anoConsultado, "PDF não encontrado para o post " + postId + ".");
            }

            // ── Passo 4: download do PDF ──
            HttpHeaders headers = new HttpHeaders();
            headers.set("User-Agent", "Mozilla/5.0 (compatible; FeCatolica/1.0)");
            HttpEntity<Void> entity = new HttpEntity<>(headers);
            ResponseEntity<byte[]> pdfResp = restTemplate.exchange(
                    pdfUrl, HttpMethod.GET, entity, byte[].class);
            byte[] pdfBytes = pdfResp.getBody();

            if (pdfBytes == null || pdfBytes.length == 0) {
                return errorResponse(anoConsultado, "PDF vazio ou inválido.");
            }

            // ── Passo 5: parsear PDF ──
            List<Map<String, Object>> intencoes = parsePdf(pdfBytes);

            Map<String, Object> result = new LinkedHashMap<>();
            result.put("ano", anoConsultado);
            result.put("status", "ok");
            result.put("pdfUrl", pdfUrl);
            result.put("intencoes", intencoes);

            cachedResponse = result;
            cacheTime = now;
            cachedYear = anoConsultado;
            return result;

        } catch (Exception e) {
            log.error("Erro ao carregar intenções do Papa: {}", e.getMessage(), e);
            return errorResponse(ano, "Erro inesperado ao carregar intenções. Tente novamente mais tarde.");
        }
    }

    // ── Parsing do PDF ─────────────────────────────────────────────────────────

    private List<Map<String, Object>> parsePdf(byte[] pdfBytes) throws Exception {
        String rawText;
        try (PDDocument doc = PDDocument.load(new ByteArrayInputStream(pdfBytes))) {
            PDFTextStripper stripper = new PDFTextStripper();
            rawText = stripper.getText(doc);
        }

        // Versão normalizada para busca (mantém tamanho igual ao original — substituições 1-para-1)
        String normUpper = normalizeForSearch(rawText).toUpperCase(Locale.ROOT);

        // Regex para detectar início de mês
        String monthAlt = String.join("|", MESES_UPPER_NORM);
        Pattern monthPat = Pattern.compile("(?<=\\n|^)(" + monthAlt + ")(?=\\s|\\r?\\n|$)",
                Pattern.CASE_INSENSITIVE);
        Matcher matcher = monthPat.matcher(normUpper);

        List<int[]> positions = new ArrayList<>();
        List<String> foundMonths = new ArrayList<>();

        while (matcher.find()) {
            positions.add(new int[]{matcher.start(), matcher.end()});
            foundMonths.add(matcher.group().toUpperCase(Locale.ROOT));
        }

        if (positions.isEmpty()) {
            // Fallback: tenta encontrar meses em qualquer posição do texto
            Pattern relaxed = Pattern.compile("\\b(" + monthAlt + ")\\b", Pattern.CASE_INSENSITIVE);
            Matcher rm = relaxed.matcher(normUpper);
            while (rm.find()) {
                positions.add(new int[]{rm.start(), rm.end()});
                foundMonths.add(rm.group().toUpperCase(Locale.ROOT));
            }
        }

        if (positions.isEmpty()) {
            // PDF com estrutura não reconhecida: retorna 12 placeholders com link ao PDF
            return buildPlaceholderList();
        }

        List<Map<String, Object>> intencoes = new ArrayList<>();
        for (int i = 0; i < foundMonths.size(); i++) {
            String mesNorm = foundMonths.get(i); // ex: "MARCO"
            int segStart = positions.get(i)[0];
            int segEnd = (i + 1 < positions.size()) ? positions.get(i + 1)[0] : rawText.length();
            String segmento = rawText.substring(segStart, Math.min(segEnd, rawText.length())).trim();

            int mesIdx = indexOfMonth(mesNorm);
            String mesNome = (mesIdx >= 0) ? MESES_NOMES[mesIdx] : capitalizar(mesNorm);

            String[] linhas = segmento.split("\\r?\\n");
            String titulo = "";
            StringBuilder textoSb = new StringBuilder();

            for (String linha : linhas) {
                String t = linha.trim();
                if (t.isEmpty()) continue;

                // Ignora: nome do mês, números de ano (4 dígitos), números de página
                String tNorm = normalizeForSearch(t).toUpperCase(Locale.ROOT);
                if (tNorm.equals(mesNorm) || t.matches("\\d{4}") || t.matches("\\d{1,2}")) {
                    continue;
                }

                if (titulo.isEmpty()) {
                    titulo = t;
                } else {
                    if (textoSb.length() > 0) textoSb.append(" ");
                    textoSb.append(t);
                }
            }

            Map<String, Object> entry = new LinkedHashMap<>();
            entry.put("mes", mesNome);
            entry.put("num", (mesIdx >= 0) ? mesIdx + 1 : i + 1);
            entry.put("titulo", titulo.isEmpty() ? "Intenção de " + mesNome : titulo);
            entry.put("texto", textoSb.toString().trim());
            entry.put("tema", "");
            intencoes.add(entry);
        }

        return intencoes;
    }

    private List<Map<String, Object>> buildPlaceholderList() {
        List<Map<String, Object>> list = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            Map<String, Object> entry = new LinkedHashMap<>();
            entry.put("mes", MESES_NOMES[i]);
            entry.put("num", i + 1);
            entry.put("titulo", "Intenção de " + MESES_NOMES[i]);
            entry.put("texto", "Texto não pôde ser extraído automaticamente. Acesse o PDF oficial para conferir.");
            entry.put("tema", "");
            list.add(entry);
        }
        return list;
    }

    // ── Utilitários ───────────────────────────────────────────────────────────

    /**
     * Remove acentos e cedilha para facilitar o matching de nomes de mês.
     * Mantém o comprimento da string intacto (substituições 1-para-1),
     * de modo que índices de posição continuam válidos sobre o texto original.
     */
    private String normalizeForSearch(String text) {
        return text
                .replace('Ç', 'C').replace('ç', 'c')
                .replace('Ã', 'A').replace('ã', 'a')
                .replace('Á', 'A').replace('á', 'a')
                .replace('À', 'A').replace('à', 'a')
                .replace('Â', 'A').replace('â', 'a')
                .replace('É', 'E').replace('é', 'e')
                .replace('Ê', 'E').replace('ê', 'e')
                .replace('Í', 'I').replace('í', 'i')
                .replace('Ó', 'O').replace('ó', 'o')
                .replace('Õ', 'O').replace('õ', 'o')
                .replace('Ú', 'U').replace('ú', 'u')
                .replace('Ü', 'U').replace('ü', 'u');
    }

    private int indexOfMonth(String normUpper) {
        for (int i = 0; i < MESES_UPPER_NORM.length; i++) {
            if (MESES_UPPER_NORM[i].equals(normUpper)) return i;
        }
        return -1;
    }

    private String capitalizar(String s) {
        if (s == null || s.isEmpty()) return s;
        return s.charAt(0) + s.substring(1).toLowerCase(Locale.ROOT);
    }

    private Integer toInt(Object val) {
        if (val == null) return null;
        if (val instanceof Number) return ((Number) val).intValue();
        try { return Integer.parseInt(val.toString()); } catch (NumberFormatException e) { return null; }
    }

    private Map<String, Object> errorResponse(int ano, String mensagem) {
        Map<String, Object> r = new LinkedHashMap<>();
        r.put("ano", ano);
        r.put("status", "error");
        r.put("erro", mensagem);
        r.put("intencoes", Collections.emptyList());
        return r;
    }
}
