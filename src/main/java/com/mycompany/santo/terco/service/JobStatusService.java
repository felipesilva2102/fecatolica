package com.mycompany.santo.terco.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Registra o resultado da última execução de cada job agendado.
 * Permite consultar via endpoint /api/jobs/status.
 */
@Service
public class JobStatusService {

    private final Map<String, JobExecution> lastExecutions = new ConcurrentHashMap<>();

    public void registrar(String jobName, boolean sucesso, String detalhe) {
        lastExecutions.put(jobName, new JobExecution(
                LocalDateTime.now(), sucesso, detalhe));
    }

    public Map<String, Object> getStatus() {
        Map<String, Object> result = new LinkedHashMap<>();
        lastExecutions.forEach((name, exec) -> {
            Map<String, Object> entry = new LinkedHashMap<>();
            entry.put("ultimaExecucao", exec.timestamp().toString());
            entry.put("sucesso", exec.sucesso());
            entry.put("detalhe", exec.detalhe());
            result.put(name, entry);
        });
        return result;
    }

    public record JobExecution(LocalDateTime timestamp, boolean sucesso, String detalhe) {
    }
}
