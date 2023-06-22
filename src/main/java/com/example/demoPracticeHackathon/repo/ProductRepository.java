package com.example.demoPracticeHackathon.repo;

import com.example.demoPracticeHackathon.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
