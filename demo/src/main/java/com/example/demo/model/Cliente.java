package com.example.demo.model;

import java.util.List;

public class Cliente {
    private String nome;
    private List<Veiculo> veiculo;
    private List<Orcamento> orcamento;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setVeiculo(List<Veiculo> dadosVeiculo) {
        this.veiculo = dadosVeiculo;
    }

    public List<Veiculo> getVeiculo() {
        return veiculo;
    }

    public void setOrcamento(List<Orcamento> orcamento) {
        this.orcamento = orcamento;
    }

    public List<Orcamento> getOrcamento() {
        return orcamento;
    }
}
