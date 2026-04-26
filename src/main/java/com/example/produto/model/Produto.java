package com.example.produto.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "produtos")
public class Produto {
    @Id // Identificador único do produto no banco
    // É gerado automaticamente pelo MongoDB
    private String id;
    private String nome;
    private double preco;
}
