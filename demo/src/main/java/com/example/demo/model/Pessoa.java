package com.example.demo.model;

public class Pessoa {
    private String nome;
    private Boolean funcionario;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setFuncionario(Boolean funcionario) {
        this.funcionario = funcionario;
    }

    public Boolean getFuncionario() {
        return funcionario;
    }
}
