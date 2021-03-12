package com.example.demo.model;

import java.util.List;

public class Cliente extends Pessoa{
    private List<Veiculo> veiculo;

    public void setVeiculo(List<Veiculo> dadosVeiculo) {
        this.veiculo = dadosVeiculo;
    }

    public List<Veiculo> getVeiculo() {
        return veiculo;
    }

    public String getNome() {
        return super.getNome();
    }

    public Boolean getFuncionario() {
        return super.getFuncionario();
    }

}
