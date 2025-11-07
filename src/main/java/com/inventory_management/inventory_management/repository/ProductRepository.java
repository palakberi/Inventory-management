package com.inventory_management.inventory_management.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.inventory_management.inventory_management.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
    
}
