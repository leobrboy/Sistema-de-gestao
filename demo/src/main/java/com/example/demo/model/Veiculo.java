package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "veiculos")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Relacionamentos com outras entidades (aplicando conceitos de POO)
    @ManyToOne
    @JoinColumn(name = "marca_id")
    private Marca marca;

    @ManyToOne
    @JoinColumn(name = "modelo_id")
    private Modelo modelo;

    private Integer ano;
    private String cor;
    private Double preco;
    private Integer quilometragem;
    private String status; // Ex: "Disponível", "Vendido"

    // Construtor vazio exigido pelo JPA
    public Veiculo() {}

    // Getters e Setters (Encapsulamento)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Marca getMarca() { return marca; }
    public void setMarca(Marca marca) { this.marca = marca; }

    public Modelo getModelo() { return modelo; }
    public void setModelo(Modelo modelo) { this.modelo = modelo; }

    public Integer getAno() { return ano; }
    public void setAno(Integer ano) { this.ano = ano; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public Double getPreco() { return preco; }
    public void setPreco(Double preco) { this.preco = preco; }

    public Integer getQuilometragem() { return quilometragem; }
    public void setQuilometragem(Integer quilometragem) { this.quilometragem = quilometragem; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}