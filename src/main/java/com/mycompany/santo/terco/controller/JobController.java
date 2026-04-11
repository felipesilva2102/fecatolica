package com.mycompany.santo.terco.controller;

import com.mycompany.santo.terco.scheduler.DailyUpdateScheduler;
import com.mycompany.santo.terco.service.JobStatusService;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    private final JobStatusService jobStatusService;
    private final DailyUpdateScheduler scheduler;

    public JobController(JobStatusService jobStatusService, DailyUpdateScheduler scheduler) {
        this.jobStatusService = jobStatusService;
        this.scheduler = scheduler;
    }

    /**
     * Retorna o status da última execução de cada job agendado.
     */
    @GetMapping("/status")
    public Map<String, Object> getStatus() {
        return jobStatusService.getStatus();
    }

    /**
     * Força a execução manual de um job específico.
     * Parâmetro: nome do job (intencoes-papa, liturgia, tempo-liturgico, health-check)
     */
    @PostMapping("/executar/{jobName}")
    public Map<String, Object> executarJob(@PathVariable String jobName) {
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("job", jobName);

        switch (jobName) {
            case "intencoes-papa" -> {
                scheduler.atualizarIntencoesPapa();
                response.put("executado", true);
            }
            case "liturgia" -> {
                scheduler.atualizarLiturgiaDoDia();
                response.put("executado", true);
            }
            case "tempo-liturgico" -> {
                scheduler.atualizarTempoLiturgico();
                response.put("executado", true);
            }
            case "health-check" -> {
                scheduler.healthCheckApisExternas();
                response.put("executado", true);
            }
            default -> {
                response.put("executado", false);
                response.put("erro", "Job não encontrado. Opções: intencoes-papa, liturgia, tempo-liturgico, health-check");
            }
        }
        return response;
    }
}
