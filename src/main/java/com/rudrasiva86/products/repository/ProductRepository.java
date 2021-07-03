package com.rudrasiva86.products.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rudrasiva86.products.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
