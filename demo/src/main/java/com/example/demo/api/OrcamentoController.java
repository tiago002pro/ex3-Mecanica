package com.example.demo.api;

import com.example.demo.model.Orcamento;
import com.example.demo.service.OrcamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class OrcamentoController {

    @Autowired
        OrcamentoService service;

    @PostMapping("/orcamentos/funcionario/{id}/gera")
    public String geraOrcamento (@PathVariable Integer id, @RequestBody Map<String, Object> json) {
        return this.service.geraOrcamento(id, json);
    }

    @GetMapping("/orcamentos/cliente/{id}")
    public List<Orcamento> pegaOrcamento(@PathVariable Integer id) {
        return this.service.orcamentosPorCliente(id);
    }

    @GetMapping("/orcamentos")
    public List<Orcamento> getOcamentos () {
        return this.service.getOrcamentos();
    }


}
