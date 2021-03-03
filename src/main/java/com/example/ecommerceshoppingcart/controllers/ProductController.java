package com.example.ecommerceshoppingcart.controllers;

import com.example.ecommerceshoppingcart.models.Product;
import com.example.ecommerceshoppingcart.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;

public class ProductController {
    @Autowired
    private final ProductRepository productRepo;

    public ProductController(ProductRepository productRepo){

        this.productRepo = productRepo;
    }

    @GetMapping("/products")
    @ResponseBody
    Iterable<Product> getAllProducts(){
        return productRepo.findAll();
    }

    @GetMapping("/products/{id}")
    ResponseEntity getProductById(@PathVariable @Min(1) Long id){
        Product foundProduct = productRepo.findById(id).get();
        return ResponseEntity.ok().body(foundProduct);
    }



}
