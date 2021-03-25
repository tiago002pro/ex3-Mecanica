package com.example.demo.service;

import com.example.demo.model.Funcionario;
import com.example.demo.model.Orcamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class FuncionarioService {

    @Autowired
            OrcamentoService orcamentoService;

    List<Funcionario> funcionarios = new ArrayList<>();

    public String cadastraFuncionario(Map<String, Object> json) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome((String) json.get("Nome"));
        funcionario.setSetor((String) json.get("Setor"));
        funcionario.setOrcamentos(new ArrayList<>());
        funcionarios.add(funcionario);

        return "Funcionário cadastrado com sucesso!";
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public String aprovaOrcamento(Integer idOrcamento, Map<String, Object> json) {
        Funcionario funcionario = funcionarios.get((Integer) json.get("idFuncionario"));
        List<Orcamento> orcamentoFeitoPeloFuncionario = funcionario.getOrcamentos();
        Orcamento orcamento = orcamentoService.orcamentos.get(idOrcamento);

        orcamento.setAprovado(true);
        orcamento.setValorOrcamento(orcamentoService.valorTotalOcamento);
        orcamento.setDataAprovado(LocalDate.now());
        orcamento.setDiasTrabalhados(0);
        orcamentoFeitoPeloFuncionario.replaceAll(orcamento1 -> orcamento);

        return "Orçamento aprovado!";
    }

    public String insereDiasTrabalhados(Integer idOrcamento, Map<String, Object> json) {
        Funcionario funcionario = funcionarios.get((Integer) json.get("idFuncionario"));
        List<Orcamento> orcamentoFeitoPeloFuncionario = funcionario.getOrcamentos();
        Orcamento orcamento = orcamentoService.orcamentos.get(idOrcamento);

        orcamento.setDiasTrabalhados((Integer) json.get("DiasTrabalhados"));
        orcamentoFeitoPeloFuncionario.replaceAll(orcamento1 -> orcamento);

        return "Inserido com sucesso!";
    }
}
