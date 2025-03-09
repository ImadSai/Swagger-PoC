package com.example.productservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;

    // No-args constructor
    public Product() {
    }

    // All-args constructor
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }
}
