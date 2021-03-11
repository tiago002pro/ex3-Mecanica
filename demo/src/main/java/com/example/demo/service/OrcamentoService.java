package com.example.demo.service;

import com.example.demo.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class OrcamentoService {

    @Autowired
    ClienteService clienteService;

    List<Orcamento> orcamentos = new ArrayList<>();

    public String geraOrcamento(Map<String, Object> json) {
        Cliente cliente = clienteService.clientes.get((Integer) json.get("idCliente"));
        List<Orcamento> geraOrcamento = cliente.getOrcamento();
        Orcamento orcamento = new Orcamento();

        orcamento.setData(LocalDate.now());
        orcamento.setAvaliacao(new ArrayList<>());
        //orcamento.setValor(new Float ((Double) json.get("valor")));
        geraOrcamento.add(orcamento);
        orcamentos.add(orcamento);

        return "Orçamento gerado com sucesso!";
    }

    public List<Orcamento> getOrcamentos() {
        return orcamentos;
    }

    List<Orcamento> orcamentosAprovados = new ArrayList<>();

    public String aprovaOrcamento(Map<String, Object> json) {
        Orcamento orcamento = orcamentos.get((Integer) json.get("id"));
        OrcamentoAprovado orcamentoAprovado = new OrcamentoAprovado();

        orcamentoAprovado.setData(orcamento.getData());
        orcamentoAprovado.setAvaliacao(orcamento.getAvaliacao());
        orcamentoAprovado.setValor(orcamento.getValor());
        orcamentoAprovado.setAprovado(true);
        orcamentoAprovado.setDataOrcamentoAprovado(LocalDate.now());
        orcamentoAprovado.setDiasTrabalhados(5);

        orcamentosAprovados.add(orcamentoAprovado);
        orcamentos.add(orcamentoAprovado);
        return "Orçamento aprovado";
    }

    public List<Orcamento> getOrcamentoAprovados() {
        return orcamentosAprovados;
    }

}
