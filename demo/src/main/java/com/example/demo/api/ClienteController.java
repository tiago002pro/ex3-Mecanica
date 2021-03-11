package com.example.demo.api;

import com.example.demo.model.Pessoa;
import com.example.demo.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class PessoaController {

    @Autowired
    PessoaService service;

    @PostMapping("/pessoa")
    public String cadastraPessoa(@RequestBody Map<String, String> json) {
        return this.service.cadastraPessoa(json);
    }

    @GetMapping("/pessoas")
    public List<Pessoa> getPessoas() {
        return this.service.getPessoas();
    }

    @GetMapping("/pessoa/{id}")
    public Pessoa getPessoaId(@PathVariable Long id) {
        return this.service.getPessoas().get(Math.toIntExact(id));
    }

}
