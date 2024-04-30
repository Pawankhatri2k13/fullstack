package com.example.fullstack.service;

import com.example.fullstack.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();
    Product getProductById(int id);
    Product createProduct(Product product);
    Product updateProduct(int id, Product product);
    void deleteProduct(int id);
}
