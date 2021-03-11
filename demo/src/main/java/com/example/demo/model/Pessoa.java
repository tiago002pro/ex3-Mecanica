package com.example.demo.model;

import java.util.List;

public class Pessoa {
    private String nome;
    private List<Veiculo> dadosVeiculo;
    private List<Orcamento> orcamento;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDadosVeiculo(List<Veiculo> dadosVeiculo) {
        this.dadosVeiculo = dadosVeiculo;
    }

    public List<Veiculo> getDadosVeiculo() {
        return dadosVeiculo;
    }

    public void setOrcamento(List<Orcamento> orcamento) {
        this.orcamento = orcamento;
    }

    public List<Orcamento> getOrcamento() {
        return orcamento;
    }
}
