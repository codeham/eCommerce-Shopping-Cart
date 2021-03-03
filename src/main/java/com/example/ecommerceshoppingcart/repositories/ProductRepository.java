package com.example.ecommerceshoppingcart.repositories;

import com.example.ecommerceshoppingcart.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
