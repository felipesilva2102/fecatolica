package com.mycompany.santo.terco.service;

import com.mycompany.santo.terco.mural.Intencao;
import com.mycompany.santo.terco.mural.IntencaoDTO;
import com.mycompany.santo.terco.repository.IntencaoJpaRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class MuralService {

    private static final int MAX_INTENCOES = 200;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    private final IntencaoJpaRepository repository;

    public MuralService(IntencaoJpaRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void adicionarIntencao(String nome, String intencao) {
        String nomeSanitizado = sanitizar(nome != null && !nome.trim().isEmpty() ? nome.trim() : "Anonimo(a)");
        String intencaoSanitizada = sanitizar(intencao.trim());

        if (intencaoSanitizada.length() > 500) intencaoSanitizada = intencaoSanitizada.substring(0, 500);
        if (nomeSanitizado.length() > 100) nomeSanitizado = nomeSanitizado.substring(0, 100);

        Intencao entity = new Intencao();
        entity.setNome(nomeSanitizado);
        entity.setTexto(intencaoSanitizada);
        entity.setCriadoEm(LocalDateTime.now());
        repository.save(entity);

        // Remove excedentes
        List<Long> excedentes = repository.findExcedentes(MAX_INTENCOES);
        if (!excedentes.isEmpty()) {
            repository.deleteByIds(excedentes);
        }
    }

    public List<IntencaoDTO> listarIntencoes() {
        return repository.findRecentes(PageRequest.of(0, MAX_INTENCOES))
                .stream()
                .map(item -> new IntencaoDTO(
                        item.getId() != null ? item.getId().toString() : null,
                        item.getNome(),
                        item.getTexto(),
                        item.getCriadoEm() != null ? item.getCriadoEm().format(FORMATTER) : ""
                ))
                .toList();
    }

    public int contarIntencoes() {
        return (int) repository.count();
    }

    private String sanitizar(String input) {
        if (input == null) return "";
        return input.replaceAll("[<>&\"']", "").replaceAll("\\s+", " ").trim();
    }
}
