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
public class Order {
    private Integer Id ,productId ,userId,quantity;
    // both productId and userId are supposed to be FK
    private String date ;

    public Order() {
    }

    public Order(Integer Id, Integer productId, Integer userId, Integer quantity, String date) {
        this.Id = Id;
        this.productId = productId;
        this.userId = userId;
        this.quantity = quantity;
        this.date = date;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" + "Id=" + Id + ", productId=" + productId + ", userId=" + userId + ", quantity=" + quantity + ", date=" + date + '}';
    }
    
    
}
