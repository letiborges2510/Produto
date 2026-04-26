package com.example.produto.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection="venda")
public class Venda {

    @Id
    private String id;

    private String clienteId;

    private List<ItemVenda> itens;

    private Double total;
}
