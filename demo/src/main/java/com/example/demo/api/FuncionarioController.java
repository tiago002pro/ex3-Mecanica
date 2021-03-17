package com.example.demo.api;

import com.example.demo.model.Funcionario;
import com.example.demo.model.Orcamento;
import com.example.demo.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class FuncionarioController {

    @Autowired
        FuncionarioService service;

    @PostMapping("/funcionarios")
    public String cadastraFuncionario(@RequestBody Map<String, Object> json) {
        return this.service.cadastraFuncionario(json);
    }

    @GetMapping("/funcionarios")
    public List<Funcionario> getFuncionarios() {
        return this.service.getFuncionarios();
    }

    @PostMapping("/funcionario/aprovar")
    public String aprovaOrcamento(@RequestBody Map<String, Object> json) {
        return this.service.aprovaOrcamento(json);
    }

    @PostMapping("/funcionario/inserir")
    public String insereDiasTrabalhados(@RequestBody Map<String, Object> json) {
        return this.service.insereDiasTrabalhados(json);
    }

}
