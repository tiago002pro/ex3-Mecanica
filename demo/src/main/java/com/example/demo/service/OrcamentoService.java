package com.example.demo.service;

import com.example.demo.model.Orcamento;
import com.example.demo.model.OrcamentoAprovado;
import com.example.demo.model.Pessoa;
import com.example.demo.model.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.lang.Float.parseFloat;

@Service
public class OrcamentoService {

    @Autowired
    PessoaService pessoaService;

    List<Orcamento> orcamentos = new ArrayList<>();

    public String geraOrcamento(Map<String, Object> json) {
        Pessoa pessoa = pessoaService.pessoas.get((Integer) json.get("id"));
        List<Orcamento> geraOrcamento = pessoa.getOrcamento();
        Orcamento orcamento = new Orcamento();

        orcamento.setData(LocalDate.now());
        orcamento.setAvaliacao((String) json.get("avaliacao"));
        orcamento.setValor(new Float ((Double) json.get("valor")));
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
