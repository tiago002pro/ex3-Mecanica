package com.example.demo.model;

import java.time.LocalDate;

public class Orcamento {
    private LocalDate data;
    private String avaliacao;
    private Float valor;
    private Boolean aprovado = false;

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Float getValor() {
        return valor;
    }

    public void setAprovado(Boolean aprovado) {
        this.aprovado = aprovado;
    }

}
