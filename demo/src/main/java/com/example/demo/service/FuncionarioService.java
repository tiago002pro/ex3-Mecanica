package com.example.demo.service;

import com.example.demo.model.Funcionario;
import com.example.demo.model.Orcamento;
import com.example.demo.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.support.NullValue;
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

        funcionario.setNome((String) json.get("nome"));
        funcionario.setFuncionario(true);
        funcionario.setSetor((String) json.get("setor"));
        funcionarios.add(funcionario);

        return "Funcionário cadastrado com sucesso!";
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public String aprovaOrcamento(Map<String, Object> json) {
        //Funcionario funcionario = funcionarios.get((Integer) json.get("idFuncionario"));
        Orcamento orcamento = orcamentoService.orcamentos.get((Integer) json.get("idOrçamento"));

        //if (funcionario.getFuncionario()) {
            orcamento.setAprovado(true);
            orcamento.setValorOrcamento(orcamentoService.valorTotalOcamento);
            orcamento.setDataAprovado(LocalDate.now());
            orcamento.setDiasTrabalhados(0);

            return "Orçamento aprovado!";
        //} else {
           // return "Você não tem permissão para executar essa tarefa.";
        //}
    }
}
