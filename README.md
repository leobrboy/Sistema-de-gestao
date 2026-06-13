# 🚗 Sistema de Gestão de Estoque de Veículos

## 📖 Sobre o Projeto
Este projeto é um sistema Full-Stack desenvolvido como requisito prático para a disciplina de Programação Orientada a Objetos (POO). O objetivo é gerenciar o estoque de uma concessionária, substituindo controles manuais por uma aplicação web rápida e eficiente. 

O sistema foi construído sob a arquitetura RESTful, aplicando os pilares de POO (Encapsulamento, Classes, Objetos) e Mapeamento Objeto-Relacional (ORM) para interagir com o banco de dados.

## ⚙️ Funcionalidades (CRUD)
* **Create:** Cadastro de novos veículos vinculados a Marcas e Modelos.
* **Read:** Listagem de todos os veículos no estoque e sistema de filtros dinâmicos (ex: listar apenas "Disponíveis").
* **Update:** Edição de informações vitais do veículo (Preço, Quilometragem e Status da venda).
* **Delete:** Remoção segura de veículos do banco de dados.
* **Interface Visual:** Painel interativo integrado via navegador para consumo direto da API.

## 🛠️ Tecnologias Utilizadas
* **Backend:** Java, Spring Boot (Web, Data JPA)
* **Banco de Dados:** MySQL
* **Frontend:** HTML5, JavaScript (Fetch API) e CSS (Bootstrap 5)
* **Testes de API:** Postman / Insomnia
* **IDE:** IntelliJ IDEA

## 🚀 Como executar o projeto na sua máquina
1. Clone este repositório: `git clone https://github.com/leobrboy/Sistema-de-gestao.git`
2. Abra o MySQL e crie o banco de dados.
3. Abra o projeto no IntelliJ IDEA.
4. No arquivo `application.properties`, ajuste a senha do banco de dados para a da sua máquina local.
5. Execute o arquivo `DemoApplication.java`.
6. Acesse no navegador: `http://localhost:8080`
