package com.example.fullstack.service;
import com.example.fullstack.entity.Product;
import com.example.fullstack.exceptionHandling.ProductNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private List<Product> products = new ArrayList<>();
    private int nextId = 1;

    @Override
    public List<Product> getAllProducts() {
        return products;
    }

    @Override
    public Product getProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        throw new ProductNotFoundException("Product not found with ID: " + id);
    }

    @Override
    public Product createProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    @Override
    public Product updateProduct(int id, Product product) {
        for (int i = 0; i < products.size(); i++) {
            Product existingProduct = products.get(i);
            if (existingProduct.getId() == id) {
                product.setId(id);
                products.set(i, product);
                return product;
            }
        }
        throw new ProductNotFoundException("Product not found with ID: " + id);
    }

    @Override
    public void deleteProduct(int id) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getId() == id) {
                products.remove(i);
                return;
            }
        }
        throw new ProductNotFoundException("Product not found with ID: " + id);
    }
}
