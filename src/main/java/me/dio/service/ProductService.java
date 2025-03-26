package me.dio.service;

import me.dio.domain.model.Product;

import java.util.List;

public interface ProductService {

    Product findById(Long id);

    Product create(Product productToCreate);

    List<Product> findAll();
}
