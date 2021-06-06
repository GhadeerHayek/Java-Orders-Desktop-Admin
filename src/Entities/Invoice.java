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
public class Invoice {
    private Integer id , orderId;
     // orderId is supposed to be FK
    private double totalPrice ;
    private String date; 

    public Invoice() {
    }

    public Invoice(Integer id, Integer orderId, double totalPrice, String date) {
        this.id = id;
        this.orderId = orderId;
        this.totalPrice = totalPrice;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Invoice{" + "id=" + id + ", orderId=" + orderId + ", totalPrice=" + totalPrice + ", date=" + date + '}';
    }
    
    
}
