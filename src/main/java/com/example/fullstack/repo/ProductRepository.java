package com.example.fullstack.repo;

import com.example.fullstack.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String> {
}
