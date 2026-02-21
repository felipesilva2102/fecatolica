package com.mycompany.santo.terco.mural;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import jakarta.json.bind.JsonbConfig;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import lombok.Getter;
import lombok.Setter;

@Named
@ApplicationScoped
@Getter
@Setter
public class MuralIntencoesBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final String ARQUIVO_JSON = "fecatolica-intencoes.json";
    private static final int MAX_INTENCOES = 200;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    private final transient ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    private List<IntencaoDTO> intencoes;
    private String novoNome;
    private String novaIntencao;

    @PostConstruct
    public void init() {
        intencoes = carregarDoArquivo();
    }

    /**
     * Adiciona uma nova intencao ao mural.
     */
    public void adicionarIntencao() {
        if (novaIntencao == null || novaIntencao.trim().isEmpty()) {
            return;
        }

        String nomeSanitizado = sanitizar(novoNome != null && !novoNome.trim().isEmpty() ? novoNome.trim() : "Anonimo(a)");
        String intencaoSanitizada = sanitizar(novaIntencao.trim());

        if (intencaoSanitizada.length() > 500) {
            intencaoSanitizada = intencaoSanitizada.substring(0, 500);
        }
        if (nomeSanitizado.length() > 100) {
            nomeSanitizado = nomeSanitizado.substring(0, 100);
        }

        IntencaoDTO intencao = new IntencaoDTO(
                UUID.randomUUID().toString(),
                nomeSanitizado,
                intencaoSanitizada,
                LocalDateTime.now().format(FORMATTER)
        );

        lock.writeLock().lock();
        try {
            intencoes.add(0, intencao);
            if (intencoes.size() > MAX_INTENCOES) {
                intencoes = new ArrayList<>(intencoes.subList(0, MAX_INTENCOES));
            }
            salvarNoArquivo(intencoes);
        } finally {
            lock.writeLock().unlock();
        }

        novoNome = null;
        novaIntencao = null;
    }

    /**
     * Retorna as intencoes de forma thread-safe.
     */
    public List<IntencaoDTO> getIntencoes() {
        lock.readLock().lock();
        try {
            return Collections.unmodifiableList(intencoes != null ? intencoes : new ArrayList<>());
        } finally {
            lock.readLock().unlock();
        }
    }

    public int getTotalIntencoes() {
        lock.readLock().lock();
        try {
            return intencoes != null ? intencoes.size() : 0;
        } finally {
            lock.readLock().unlock();
        }
    }

    private List<IntencaoDTO> carregarDoArquivo() {
        try {
            Path path = getArquivoPath();
            if (Files.exists(path)) {
                String json = Files.readString(path, StandardCharsets.UTF_8);
                Jsonb jsonb = JsonbBuilder.create();
                Type listType = new ArrayList<IntencaoDTO>() {}.getClass().getGenericSuperclass();
                List<IntencaoDTO> lista = jsonb.fromJson(json, listType);
                return lista != null ? new ArrayList<>(lista) : new ArrayList<>();
            }
        } catch (Exception e) {
            System.err.println("Erro ao carregar intencoes: " + e.getMessage());
        }
        return new ArrayList<>();
    }

    private void salvarNoArquivo(List<IntencaoDTO> lista) {
        try {
            Path path = getArquivoPath();
            JsonbConfig config = new JsonbConfig().withFormatting(true);
            Jsonb jsonb = JsonbBuilder.create(config);
            String json = jsonb.toJson(lista);
            Files.writeString(path, json, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.err.println("Erro ao salvar intencoes: " + e.getMessage());
        }
    }

    private Path getArquivoPath() {
        String userHome = System.getProperty("user.home");
        Path dir = Paths.get(userHome, ".fecatolica");
        try {
            if (!Files.exists(dir)) {
                Files.createDirectories(dir);
            }
        } catch (IOException e) {
            System.err.println("Erro ao criar diretorio: " + e.getMessage());
        }
        return dir.resolve(ARQUIVO_JSON);
    }

    private String sanitizar(String input) {
        if (input == null) return "";
        return input.replaceAll("[<>&\"']", "")
                    .replaceAll("\\s+", " ")
                    .trim();
    }
}
