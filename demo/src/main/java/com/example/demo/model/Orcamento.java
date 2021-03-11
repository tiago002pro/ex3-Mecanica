package com.example.demo.model;

import java.time.LocalDate;
import java.util.List;

public class Orcamento {
    private LocalDate data;
    private List<Avaliacao> avaliacao;
    private Float valor;
    private Boolean aprovado = false;

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    public void setAvaliacao(List<Avaliacao> avaliacao) {
        this.avaliacao = avaliacao;
    }

    public List<Avaliacao> getAvaliacao() {
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
