package com.mycompany.santo.terco.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

/**
 * Configura um pool de threads dedicado aos jobs agendados,
 * evitando que um job bloqueie a execução de outro.
 */
@Configuration
public class SchedulingConfig {

    @Bean
    public ThreadPoolTaskScheduler taskScheduler() {
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.setPoolSize(3);
        scheduler.setThreadNamePrefix("job-");
        scheduler.setErrorHandler(t ->
                System.err.println("[JOB-ERROR] " + t.getMessage()));
        return scheduler;
    }
}
