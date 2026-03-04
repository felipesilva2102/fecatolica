package com.mycompany.santo.terco.controller;

import com.mycompany.santo.terco.service.NovenaRegistry;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/api/novena")
public class NovenaController {

    private final NovenaRegistry novenaRegistry;

    public NovenaController(NovenaRegistry novenaRegistry) {
        this.novenaRegistry = novenaRegistry;
    }

    @GetMapping("/lista")
    public Set<String> listarNovenas() {
        return novenaRegistry.listarNovenas();
    }

    @GetMapping("/{nomeBean}")
    public ResponseEntity<Map<String, Object>> getNovena(@PathVariable String nomeBean) {
        Map<String, Object> data = novenaRegistry.getNovenaData(nomeBean);
        if (data == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(data);
    }
}
