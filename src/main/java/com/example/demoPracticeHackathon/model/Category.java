package com.example.demoPracticeHackathon.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Collection;
import java.util.List;

/**
 * Write @Entity on top of class name
 * Give names of fields (id, name, picture)
 * Generate empty constructor
 * Generate not empty constructor
 * Generate getter and setter
 */

@Entity
public class Category {

    @Id
    @GeneratedValue
    private Long id;
    private String categoryName;
    private String categoryPicture;

    //If using @OneToMany, always use 'Collection<entityName> name'
    //In mapped by, variable name of the other relationship goes
    @OneToMany(mappedBy = "category")
    private Collection<Product> product;

    public Category() {
    }

    public Category(String categoryName, String categoryPicture) {
        this.categoryName = categoryName;
        this.categoryPicture = categoryPicture;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryPicture() {
        return categoryPicture;
    }

    public void setCategoryPicture(String categoryPicture) {
        this.categoryPicture = categoryPicture;
    }

    public void addProduct(Product product){

    }
}
