package com.inventory_management.inventory_management.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory_management.inventory_management.model.Product;
import com.inventory_management.inventory_management.repository.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(String id){
        return productRepository.findById(id);
    }

    public Product addProduct(Product product){
        return productRepository.save(product);
    }

    public boolean deleteProductById(String id){
        try{
            if(productRepository.existsById(id)){
                productRepository.deleteById(id);
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

}
