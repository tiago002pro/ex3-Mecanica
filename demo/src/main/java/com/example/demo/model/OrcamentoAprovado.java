package com.example.demo.model;

import java.time.LocalDate;

public class OrcamentoAprovado extends Orcamento{
    private LocalDate dataOrcamentoAprovado;
    private Integer diasTrabalhados;

    public void setDataOrcamentoAprovado(LocalDate dataOrcamentoAprovado) {
        this.dataOrcamentoAprovado = dataOrcamentoAprovado;
    }

    public LocalDate getDataOrcamentoAprovado() {
        return dataOrcamentoAprovado;
    }

    public void setDiasTrabalhados(Integer diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    public Integer getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public LocalDate getData() {
        return super.getData();
    }

    public String getAvaliacao() {
        return super.getAvaliacao();
    }

    public Float getValor() {
        return super.getValor();
    }

}
