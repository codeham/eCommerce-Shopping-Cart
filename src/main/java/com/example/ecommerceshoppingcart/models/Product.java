package com.example.ecommerceshoppingcart.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "product")
public class Product {
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

    public String getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Product name is required")
    private String name;

    private Double price;

    private String pictureURL;

    public Product(Long id, @NotNull(message = "Product name is required") String name, Double price, String pictureURL) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.pictureURL = pictureURL;
    }
}
