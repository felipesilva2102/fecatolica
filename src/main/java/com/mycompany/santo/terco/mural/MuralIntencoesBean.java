package com.mycompany.santo.terco.mural;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import jakarta.inject.Inject;
import lombok.Getter;
import lombok.Setter;

@Named
@RequestScoped
@Getter
@Setter
public class MuralIntencoesBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final int MAX_INTENCOES = 200;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    @Inject
    private IntencaoRepository intencaoRepository;

    private String novoNome;
    private String novaIntencao;

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

        try {
            intencaoRepository.salvar(nomeSanitizado, intencaoSanitizada, LocalDateTime.now());
            intencaoRepository.removerExcedentes(MAX_INTENCOES);
            novoNome = null;
            novaIntencao = null;
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Não foi possível salvar a intenção."));
        }
    }

    /**
     * Retorna as intencoes de forma thread-safe.
     */
    public List<IntencaoDTO> getIntencoes() {
        return intencaoRepository
                .listarRecentes(MAX_INTENCOES)
                .stream()
                .map(item -> new IntencaoDTO(
                item.getId() != null ? item.getId().toString() : null,
                item.getNome(),
                item.getTexto(),
                item.getCriadoEm() != null ? item.getCriadoEm().format(FORMATTER) : ""
        ))
                .toList();
    }

    public int getTotalIntencoes() {
        return intencaoRepository.contar();
    }

    private String sanitizar(String input) {
        if (input == null) {
            return "";
        }
        return input.replaceAll("[<>&\"']", "")
                    .replaceAll("\\s+", " ")
                    .trim();
    }
}
