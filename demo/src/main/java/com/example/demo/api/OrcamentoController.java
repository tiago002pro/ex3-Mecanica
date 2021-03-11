package com.example.demo.api;

import com.example.demo.model.Orcamento;
import com.example.demo.model.Pessoa;
import com.example.demo.service.OrcamentoService;
import com.example.demo.service.PessoaService;
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

    @Autowired
    PessoaService pessoaService;

    @PostMapping("/orcamento")
    public String geraOrcamento (@RequestBody Map<String, Object> json) {
        return this.service.geraOrcamento(json);
    }

    //Quero retornar somente os orçamentos
    @GetMapping("/orcamentos")
    public List<Orcamento> getOrcamentos() {
        return this.service.getOrcamentos();
    }

    @PostMapping("/orcamentoAprovado")
    public String aprovaOrcamento(@RequestBody Map<String, Object> json) {
        return this.service.aprovaOrcamento(json);
    }

    @GetMapping("/orcamentosAprovados")
    public List<Orcamento> getOrcamentosAprovados() {
        return this.service.getOrcamentoAprovados();
    }
}
