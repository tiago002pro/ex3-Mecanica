package com.example.demo.api;

import com.example.demo.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class VeiculoController {

    @Autowired
    VeiculoService service;

    @PostMapping("/veiculo/cadastro/cliente/{id}")
    public String cadastraveiculo(@PathVariable Integer id, @RequestBody Map<String, Object> json) {
        return this.service.cadastraveiculo(id, json);
    }
}
