package com.example.demo.api;

import com.example.demo.model.Veiculo;
import com.example.demo.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class VeiculoController {

    @Autowired
    VeiculoService service;

    @PostMapping("/veiculo")
    public String cadastraveiculo(@RequestBody Map<String, Object> json) {
        return this.service.cadastraveiculo(json);
    }

    @GetMapping("/veiculos")
    public List<Veiculo> getVeiculos() {
        return this.service.getVeiculos();
    }
}
