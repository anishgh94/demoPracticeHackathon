package com.example.demoPracticeHackathon;

import com.example.demoPracticeHackathon.model.Category;
import com.example.demoPracticeHackathon.model.Product;
import com.example.demoPracticeHackathon.repo.CategoryRepository;
import com.example.demoPracticeHackathon.repo.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {

    //Import all of the repositories and create their constructor
    //No need to create empty constructor in populator
    private CategoryRepository categoryRepo;
    private ProductRepository productRepo;

    public Populator(CategoryRepository categoryRepo, ProductRepository productRepo) {
        this.categoryRepo = categoryRepo;
        this.productRepo = productRepo;
    }
    @Override
    public void run(String... args) throws Exception {

        Category toys = new Category("Toys", "picture.com");
        categoryRepo.save(toys);

        Category fruits = new Category("Fruits", "fruits.com");
        categoryRepo.save(fruits);

        Category cloths = new Category("Cloths", "cloths.com");
        categoryRepo.save(cloths);


        Product banana = new Product("banana","http:banana.com",fruits);
        productRepo.save(banana);

        Product teddyBear = new Product("TeddyBear","http:teddyBear.com",toys);
        productRepo.save(teddyBear);

        Product mango = new Product("Mango","http:mango.com",fruits);
        productRepo.save(mango);

        Product shirt = new Product("Shirt","http:shirt.com",cloths);
        productRepo.save(shirt);


    }
}
