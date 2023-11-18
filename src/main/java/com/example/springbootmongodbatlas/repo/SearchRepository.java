package com.example.springbootmongodbatlas.repo;

import java.util.List;

import com.example.springbootmongodbatlas.entity.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchRepository {
	List<Product> findByText(String text);

}
