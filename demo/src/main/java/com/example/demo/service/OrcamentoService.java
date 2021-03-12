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
    @Autowired
            FuncionarioService funcionarioService;

    List<Orcamento> orcamentos = new ArrayList<>();
    float valorTotalOcamento = 0;

    public String geraOrcamento(Map<String, Object> json) {
        Funcionario funcionario = funcionarioService.funcionarios.get((Integer) json.get("idFuncionario"));
        List<Orcamento> orcamentoFeitoPeloFuncionario = funcionario.getOrcamentos();
        Cliente cliente = clienteService.clientes.get((Integer) json.get("idCliente"));
        Orcamento orcamento = new Orcamento();

        orcamento.setAprovado(false);
        orcamento.setPessoa(cliente);
        orcamento.setData(LocalDate.now());
        orcamento.setAvaliacao(new ArrayList<>());
        orcamento.setValorOrcamento(valorTotalOcamento);
        orcamentoFeitoPeloFuncionario.add(orcamento);
        orcamentos.add(orcamento);

        return "Orçamento gerado com sucesso!";
    }

    public List<Orcamento> orcamentosPorCliente(Map<String, Object> json) {
        Cliente cliente = clienteService.clientes.get((Integer) json.get("idCliente"));
        List<Orcamento> listaOrcamentosPorCliente = new ArrayList<>();


//        for (int x=0; x<orcamentos.size(); x++) {
//            Orcamento orcamento = orcamentos.get(x);
        for (Orcamento orcamento : orcamentos) {
            if (orcamento.getPessoa().equals(cliente)) {
                listaOrcamentosPorCliente.add(orcamento);
            }
        }

        return listaOrcamentosPorCliente;
    }
    
    public void calculaValorTotalOrcamento(Float totalItem) {
        valorTotalOcamento = valorTotalOcamento + totalItem;
    }

    public List<Orcamento> getOrcamentos() {
        return orcamentos;
    }
}
