package com.example.produto.controller;

import com.example.produto.model.Venda;
import com.example.produto.service.VendaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venda")
public class VendaController {

    // Service responsável pelas operações de venda
    private final VendaService service;

    // Injeção de dependência via construtor
    public VendaController(VendaService service) {
        this.service = service;
    }

    @PostMapping     // Endpoint para registrar uma nova venda
    public Venda salvar(@RequestBody Venda venda) {
        return service.salvar(venda);
    }

    @GetMapping     // Endpoint para listar todas as vendas
    public List<Venda> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")     // Endpoint para buscar uma venda pelo ID
    public Venda buscarId(@PathVariable String id) {
        return service.buscarId(id);
    }

    @GetMapping("/cliente/{clienteId}")     // Endpoint para buscar vendas por cliente
    public List<Venda> buscarCliente(@PathVariable String clienteId) {
        return service.buscarCliente(clienteId);
    }

}
