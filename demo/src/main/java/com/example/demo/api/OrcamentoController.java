package com.example.demo.api;

import com.example.demo.model.Orcamento;
import com.example.demo.service.OrcamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class OrcamentoController {

    @Autowired
        OrcamentoService service;

    @PostMapping("/orcamento")
    public String geraOrcamento (@RequestBody Map<String, Object> json) {
        return this.service.geraOrcamento(json);
    }

    @GetMapping("/orcamentos/cliente")
    public List<Orcamento> pegaOrcamento(@RequestBody Map<String, Object> json) {
        return this.service.pegaOrcamento(json);
    }



}
