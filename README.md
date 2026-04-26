#  API de Produtos e Vendas - Spring Boot + MongoDB

Este projeto consiste no desenvolvimento de uma API REST para gerenciamento de produtos e registro de vendas, utilizando **Spring Boot** e **MongoDB**.
A aplicação permite realizar operações de CRUD para produtos, além de cadastrar e consultar vendas, seguindo boas práticas de arquitetura em camadas.

---

## Objetivo

Desenvolver uma API para controle de produtos e vendas, aplicando conceitos de:

* Arquitetura em camadas (Controller, Service, Model)
* Integração com banco de dados NoSQL (MongoDB)
* Criação de endpoints RESTful
* Registro de vendas com itens e cálculo de valores

---

## Tecnologias Utilizadas

* Java 17+
* Spring Boot
* Spring Web
* Spring Data MongoDB
* Lombok
* MongoDB

---

## Estrutura do Projeto

```bash
src/main/java/com/example/produto
│
├── controller     # Responsável por receber as requisições HTTP
├── service        # Contém as regras de negócio
├── repository     # Comunicação com o MongoDB
├── model          # Representação dos dados (Produto, Venda, ItemVenda)
└── ProdutoApplication.java  # Classe principal
```

---

## Funcionalidades

✔️ Cadastro de produto
✔️ Listagem de produtos
✔️ Busca por ID
✔️ Atualização de produto
✔️ Remoção de produto
✔️ Cadastro de venda
✔️ Listagem de vendas
✔️ Busca de venda por ID
✔️ Busca de vendas por cliente

---


##  Endpoints da API

###  Criar Produto

POST /produto

```json
{
  "nome": "Notebook",
  "preco": 3500.00
}
```

<img width="896" height="672" alt="put-produto" src="https://github.com/user-attachments/assets/0d286baf-8a7f-4673-92f1-0c66479701e1" />


---

###  Buscar Produto por ID

<img width="873" height="716" alt="busca-id-produto" src="https://github.com/user-attachments/assets/00f7dbca-f0a1-4706-95f8-101a388fab1e" />


---


###  Atualizar Produto

<img width="896" height="672" alt="put-produto" src="https://github.com/user-attachments/assets/eabd0fdd-363d-4b55-b470-6fd82c045fde" />


---

###  Deletar Produto

<img width="886" height="731" alt="delete-produto" src="https://github.com/user-attachments/assets/fdf3342c-fc10-4fba-9692-ac078aedd42d" />

---

###  Venda

###  Buscar Produto por ID

<img width="911" height="777" alt="buscaporid" src="https://github.com/user-attachments/assets/574d3b18-7b9b-4dc3-b8c7-0416b7896e81" />

---

###  Post Venda

<img width="888" height="770" alt="post venda" src="https://github.com/user-attachments/assets/7e2477f9-a195-480a-a3b3-9c56027f6cc5" />


---


##  Observações

* O projeto utiliza MongoDB como banco NoSQL
* Os IDs são gerados automaticamente
* A aplicação segue padrão REST
* A classe ItemVenda representa os produtos dentro de uma venda
* O total dos itens pode ser calculado automaticamente no service

---

##  Autoras

Projeto desenvolvido por:

* **Yasmin Oliveira**
* **Letícia Borges**

---

## Contexto Acadêmico

Este projeto foi desenvolvido como **atividade avaliativa**, contemplando a construção de uma arquitetura baseada em microsserviços, dividida em diferentes módulos:

* 🧑‍💼 **Cliente** → gerenciamento de clientes
* 🔐 **Login** → autenticação de usuários
* 📦 **Produto** → controle de produtos
* 🌐 **Gateway** → centralização das requisições e roteamento entre serviços

---

## Arquitetura do Projeto

A aplicação segue o padrão de microsserviços, onde cada módulo possui sua responsabilidade específica, promovendo:

* Separação de responsabilidades
* Escalabilidade
* Organização do código
* Facilidade de manutenção

O **Gateway** atua como ponto de entrada único, direcionando as requisições para os serviços correspondentes.
