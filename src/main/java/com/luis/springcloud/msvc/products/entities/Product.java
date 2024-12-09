package com.luis.springcloud.msvc.products.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //para darse un valor autoincremental
    private Long id;

    private String name;

    private Double price;

     //Tomando en cuenta si en la tabla tiene un nombre diferente
     @Column(name = "create_at")
    private LocalDate createAT;

    @Transient
    private int port;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getCreateAT() {
        return createAT;
    }

    public void setCreateAT(LocalDate createAT) {
        this.createAT = createAT;
    }

    
}
