package com.example.ecommerceshoppingcart.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateCreated;

    private String status;

    private List<Product> products = new ArrayList<>();

    @Transient
    public Double getTotalPrice(){
//        double totalSum = products.stream().mapToDouble(Product::getPrice).sum();
        double totalSum = 0.0;
        for(Product prod: products){
            totalSum += prod.getPrice();
        }

        return totalSum;
    }

    @Transient
    public int getTotalProducts(){
        return this.products.size();
    }
}
