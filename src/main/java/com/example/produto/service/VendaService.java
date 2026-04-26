package com.example.produto.service;

import com.example.produto.model.ItemVenda;
import com.example.produto.model.Produto;
import com.example.produto.model.Venda;
import com.example.produto.repository.ProdutoRepository;
import com.example.produto.repository.VendaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendaService {

    private final VendaRepository vendaRepository;
    private final ProdutoRepository produtoRepository;
    public VendaService(VendaRepository vendaRepository,  ProdutoRepository produtoRepository) {
        this.vendaRepository = vendaRepository;
        this.produtoRepository = produtoRepository;
    }

    public List<Venda> listar() {
        return vendaRepository.findAll();
    }

    public Venda salvar(Venda venda) {
        if (venda.getItens().size() < 1 || venda.getItens().size() > 10) {
            throw new RuntimeException("É necessário que a venda tenha entre 1 a 10 produtos");
        }
        double total = 0;

        for (ItemVenda item : venda.getItens()) {
            Produto produto = produtoRepository.findById(item.getProdutoId())
                    .orElseThrow(() -> new RuntimeException("Esse produto não foi encontrado, tente novamente!"));

            item.setNomeProduto(produto.getNome());
            item.setPrecoUnitario(produto.getPreco());

            double totalitem = produto.getPreco() * item.getQuantidade();
            item.setTotalItem(totalitem);

           total += totalitem;
        }

        venda.setTotal(total);

        return vendaRepository.save(venda);
    }

    public Venda buscarId (String id) {
        return vendaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Essa venda não foi encontrada, tente novamente!"));
    }

    public List<Venda> buscarCliente(String clienteId) {
        return vendaRepository.findByClienteId(clienteId);
    }
}
