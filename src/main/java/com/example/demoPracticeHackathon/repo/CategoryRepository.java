package com.example.demoPracticeHackathon.repo;

import com.example.demoPracticeHackathon.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
