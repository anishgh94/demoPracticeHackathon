package com.example.demoPracticeHackathon.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

/**
 * Write @Entity on top of class name
 * Give names of fields (id, name, picture)
 * Generate empty constructor
 * Generate not empty constructor
 * Generate getter and setter
 */

@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    private String productName;
    private String productPicture;

    //If using @ManyToOne, always write single entity name
    @ManyToOne
    private Category category;

    public Product() {
    }

    //When using @ManyToOne, always put the name of that
    public Product(String productName, String productPicture, Category category) {
        this.productName = productName;
        this.productPicture = productPicture;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPicture() {
        return productPicture;
    }

    public void setProductPicture(String productPicture) {
        this.productPicture = productPicture;
    }
}
