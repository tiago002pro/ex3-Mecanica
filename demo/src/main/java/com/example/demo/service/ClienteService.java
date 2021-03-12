package com.example.demo.service;

import com.example.demo.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ClienteService {

    List<Cliente> clientes = new ArrayList<>();

    public String cadastraCliente(Map<String, String> json) {
        Cliente cliente = new Cliente();
        cliente.setNome(json.get("nome"));
        cliente.setFuncionario(false);
        cliente.setVeiculo(new ArrayList<>());
        //cliente.setOrcamento(new ArrayList<>());
        clientes.add(cliente);

        return "Cliente cadastrado com sucesso!";
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}
