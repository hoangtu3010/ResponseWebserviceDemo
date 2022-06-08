package com.example.Demo3.repository;

import com.example.Demo3.entity.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();
    Product save(Product product);
    Boolean update(Integer id, Product product);
    Boolean delete(Integer id);
    Product findById(Integer id);
}
