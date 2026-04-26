package com.example.produto.controller;

import com.example.produto.model.Venda;
import com.example.produto.service.VendaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venda")
public class VendaController {

    private final VendaService service;

    public VendaController(VendaService service) {
        this.service = service;
    }

    @PostMapping
    public Venda salvar(@RequestBody Venda venda) {
        return service.salvar(venda);
    }

    @GetMapping
    public List<Venda> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Venda buscarId(@PathVariable String id) {
        return service.buscarId(id);
    }

    @GetMapping("/cliente/{clienteId}")
    public List<Venda> buscarCliente(@PathVariable String clienteId) {
        return service.buscarCliente(clienteId);
    }

}
