package com.example.demo.model;

import java.util.List;

public class Funcionario extends Pessoa{
    private String setor;
    private List<Orcamento> orcamentos;

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setOrcamentos(List<Orcamento> orcamentos) {
        this.orcamentos = orcamentos;
    }

    public List<Orcamento> getOrcamentos() {
        return orcamentos;
    }

    public String getNome() {
        return super.getNome();
    }

}
