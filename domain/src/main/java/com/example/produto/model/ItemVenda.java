package com.example.produto.model;

import lombok.Data;

@Data
public class ItemVenda {
    private String produtoId;
    private String nomeProduto;
    private Integer quantidade;
    private Double precoUnitario;
    private Double totalItem;

}
