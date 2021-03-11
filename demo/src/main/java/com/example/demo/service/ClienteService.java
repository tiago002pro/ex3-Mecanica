package com.example.demo.service;

import com.example.demo.model.Orcamento;
import com.example.demo.model.Pessoa;
import com.example.demo.model.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class PessoaService {

    List<Pessoa> pessoas = new ArrayList<>();

    public String cadastraPessoa(Map<String, String> json) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(json.get("nome"));
        pessoa.setVeiculo(new ArrayList<>());
        pessoa.setOrcamento(new ArrayList<>());
        pessoas.add(pessoa);

        return "Cadastro efetuado com sucesso!";
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

}
