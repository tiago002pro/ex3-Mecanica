package com.example.demo.service;

import com.example.demo.model.Cliente;
import com.example.demo.model.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class VeiculoService {

    @Autowired
    ClienteService clienteService;

    public String cadastraveiculo (Integer idCliente, Map<String, Object> json) {
        Cliente cliente = clienteService.clientes.get(idCliente);
        List<Veiculo> vinculaVeiculoPessoa = cliente.getVeiculo();
        Veiculo veiculo = new Veiculo();

        veiculo.setNome((String) json.get("Nome"));
        veiculo.setCor((String) json.get("Cor"));
        vinculaVeiculoPessoa.add(veiculo);

        return "Veículo cadastrado com Sucesso!";
    }

}
