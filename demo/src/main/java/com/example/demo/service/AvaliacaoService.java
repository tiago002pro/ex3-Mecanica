package com.example.demo.service;

import com.example.demo.model.Avaliacao;
import com.example.demo.model.Orcamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AvaliacaoService {

    @Autowired
            OrcamentoService orcamentoService;

    public String geraAvaliacao(Map<String, Object> json) {
        Orcamento orcamento = orcamentoService.orcamentos.get((Integer) json.get("idOrçamento"));
        List<Avaliacao> insereNoOrcamento = orcamento.getAvaliacao();
        Avaliacao avaliacao = new Avaliacao();

        avaliacao.setItem((String) json.get("Item"));
        avaliacao.setQuantidade((Integer) json.get("Quantidade"));
        avaliacao.setValorUnitario(new Float((Double) json.get("ValorUnitario")));
        avaliacao.setValorTotalItem(avaliacao.getQuantidade() * avaliacao.getValorUnitario());
        insereNoOrcamento.add(avaliacao);

        return "Avaliação gerada com sucesso!";
    }
}
