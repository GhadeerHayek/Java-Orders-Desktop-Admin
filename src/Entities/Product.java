/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author ghadi
 */
public class Product {
    private Integer Id , quantity ; 
    private String name , category ,description;
    private Double price ;

    public Product(Integer Id, Integer quantity, String name, String category, String description, Double price) {
        this.Id = Id;
        this.quantity = quantity;
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
    }

    public Product() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "Id=" + Id + ", quantity=" + quantity + ", name=" + name + ", category=" + category + ", description=" + description + ", price=" + price + '}';
    }
    
    
}
