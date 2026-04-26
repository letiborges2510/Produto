package com.example.produto.service;

import com.example.produto.model.Produto;
import com.example.produto.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;
    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public Produto salvar (Produto produto) {
        return repository.save(produto);
    }

    public Produto atualizar (String id, Produto produtoatualizado) {
        Produto produto = buscar(id);
        produto.setNome(produtoatualizado.getNome());
        produto.setPreco(produtoatualizado.getPreco());
        return repository.save(produto);

    }

    public Produto buscar(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("O produto não foi encontrado, tente novamente!"));
    }
    public List<Produto> listar() {
        return repository.findAll();
    }

    public void deletar(String id) {
        repository.deleteById(id);
    }
}
