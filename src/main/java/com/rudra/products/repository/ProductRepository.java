package com.rudra.products.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rudra.products.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
