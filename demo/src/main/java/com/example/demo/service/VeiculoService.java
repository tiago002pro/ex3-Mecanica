package com.example.demo.service;

import com.example.demo.model.Pessoa;
import com.example.demo.model.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class VeiculoService {

    @Autowired
    PessoaService pessoaService;

    List<Veiculo> veiculos = new ArrayList<>();

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public String cadastraveiculo (Map<String, Object> json) {
        Pessoa pessoa = pessoaService.pessoas.get((Integer) json.get("id"));
        List<Veiculo> vinculaVeiculoPessoa = pessoa.getDadosVeiculo();
        Veiculo veiculo = new Veiculo();

        veiculo.setNome((String) json.get("nome"));
        veiculo.setCor((String) json.get("cor"));
        vinculaVeiculoPessoa.add(veiculo);
        veiculos.add(veiculo);

        return "Veículo cadastrado com Sucesso";
    }

}
