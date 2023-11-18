package com.example.springbootmongodbatlas.repo;

import com.example.springbootmongodbatlas.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepo extends MongoRepository<Product,Integer> {
    @Query("{id:?0}")
    Optional<Product> findById(Integer id);
}
