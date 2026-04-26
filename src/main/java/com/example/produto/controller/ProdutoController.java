package com.example.produto.controller;

import com.example.produto.model.Produto;
import com.example.produto.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos") // todas as requisições começam com /produtos
public class ProdutoController {

    // Declaração do service como final (boa prática)
    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    } // Injeção de dependência via construtor

    @PostMapping     // Endpoint para criar um novo produto
    public Produto salvar(@RequestBody Produto produto) {
        return service.salvar(produto);
    }

    @GetMapping     // Endpoint para listar todos os produtos
    public List<Produto> listar() {
        return service.listar();
    }         // Retorna todos os registros


    @GetMapping("/{id}")     // Endpoint para buscar um produto pelo ID
    public Produto buscar(@PathVariable String id) {
        return service.buscar(id);
    }
    @PutMapping("/{id}")    // Endpoint para atualizar um produto existente
    public Produto atualizar(@PathVariable String id, @RequestBody Produto produto) {
        return service.atualizar(id, produto);         // Atualiza os dados do produto

    }

    @DeleteMapping("/{id}")     // Endpoint para deletar um produto
    public void deletar(@PathVariable String id) {
        service.deletar(id);
    }
}
