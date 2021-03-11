package com.example.demo.api;

import com.example.demo.model.Avaliacao;
import com.example.demo.service.AvaliacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class AvaliacaoController {

    @Autowired
    AvaliacaoService service;

    @PostMapping("avaliacao")
    public String geraAvaliacao(@RequestBody Map<String, Object> json) {
        return this.service.geraAvaliacao(json);
    }
}
