package com.example.demo.model;

import java.time.LocalDate;
import java.util.List;

public class Orcamento {
    private Boolean aprovado;
    private Pessoa pessoa;
    private LocalDate data;
    private List<Avaliacao> avaliacao;
    private Float valorOrcamento;
    private LocalDate dataAprovado;
    private Integer diasTrabalhados;

    public void setAprovado(Boolean aprovado) {
        this.aprovado = aprovado;
    }

    public Boolean getAprovado() {
        return aprovado;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

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

    public void setValorOrcamento(Float valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    public Float getValorOrcamento() {
        return valorOrcamento;
    }

    public void setDataAprovado(LocalDate dataAprovado) {
        this.dataAprovado = dataAprovado;
    }

    public LocalDate getDataAprovado() {
        return dataAprovado;
    }

    public void setDiasTrabalhados(Integer diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    public Integer getDiasTrabalhados() {
        return diasTrabalhados;
    }
}
