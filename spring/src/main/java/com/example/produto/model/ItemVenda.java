package com.example.produto.model;

import lombok.Data;

@Data
public class ItemVenda {
    private String produtoId;     // ID do produto (referência ao produto vendido)
    private String nomeProduto;
    private Integer quantidade;
    private Double precoUnitario;
    private Double totalItem;     // Valor total do item (quantidade * preçoUnitário)

}
