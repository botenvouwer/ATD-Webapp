/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Nigel
 */
@Entity
public class InvoiceLine implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int number;
    private double btw = 0.21;
    private String description;
    private double price;
    private double discount = 0;
    private int quantity;
    
    public InvoiceLine(String description, double price, int quantity) {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }
    
    public InvoiceLine(String description, double price, int quantity, double discount) {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }
    
    public int getNumber() {
        return number;
    }
    
    public String getDescription() {
        return description;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public double getDiscount() {
        return discount;
    }
    
    public void setPrice(double newPrice) {
        price = newPrice;
    }
    
    public void setQuantity(int newQuantitiy) {
        quantity = newQuantitiy;
    }
    
    @Override
    public boolean equals(Object ref) {
        if(ref instanceof InvoiceLine) {
            if(((InvoiceLine)ref).getNumber() == getNumber()) {
                return true;
            }
        }
        return false;
    }
    
    public String toString() {
        return description + " " + price;
    }
    
    public double getTotal() {
        return getPrice() * getQuantity() * (1 - discount / 100);
    }
    
}
