package com.example.demo.model;

public class Avaliacao {
    //private Pessoa pessoa;
    private String item;
    private Integer quantidade;
    private Float valorUnitario;
    private Float valorTotalItem;

//    public void setPessoa(Pessoa pessoa) {
//        this.pessoa = pessoa;
//    }
//
//    public Pessoa getPessoa() {
//        return pessoa;
//    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setValorUnitario(Float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorTotalItem(Float valorTotalItem) {
        this.valorTotalItem = valorTotalItem;
    }

    public Float getValorTotalItem() {
        return valorTotalItem;
    }
}
