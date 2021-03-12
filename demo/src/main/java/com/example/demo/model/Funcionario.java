package com.example.demo.model;

public class Funcionario extends Pessoa{
    private String setor;

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public String getNome() {
        return super.getNome();
    }

    public Boolean getFuncionario() {
        return super.getFuncionario();
    }
}
