package com.example.demo.api;

import com.example.demo.model.Cliente;
import com.example.demo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class ClienteController {

    @Autowired
    ClienteService service;

    @PostMapping("/cliente")
    public String cadastraCliente(@RequestBody Map<String, String> json) {
        return this.service.cadastraCliente(json);
    }

    @GetMapping("/clientes")
    public List<Cliente> getClientes() {
        return this.service.getClientes();
    }

    @GetMapping("/cliente/{id}")
    public Cliente getClienteId(@PathVariable Long id) {
        return this.service.getClientes().get(Math.toIntExact(id));
    }

}
