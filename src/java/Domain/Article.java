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
public class Article implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int number;
    private String name;
    private double price;
    private int stock;
    
    public Article(int number, String name, double price) {
        this.name = name;
        this.price = price;
        this.stock = 0;
    }
    
    public Article(int number, String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    
    public int getStock() {
        return stock;
    }
    
    public boolean controlNumber(int check) {
        if(check > 0) {
            return true;
        }
        return false;
    }
    
    public boolean setStock(int newStock) {
        if(controlNumber(newStock)) {
            this.stock = newStock;
            return true;
        }
        return false;
    }
    
    public boolean stockIn(int addStock) {
        if(controlNumber(addStock)) {
            this.stock += addStock;
            return true;
        }        
        return false;
    }
    
    public boolean stockOut(int removeStock) {
        if(controlNumber(removeStock)) {
            if(removeStock <= this.stock) {
                this.stock -= removeStock;
                return true;
            }
        }
        return false;
    }
    
    public boolean equals(Object ref) {
        if(ref instanceof Article) {
            if(((Article)ref).getNumber() == getNumber()) {
            return true;
        }
        }
        return false;
    }
    
    public int getNumber() {
        return number;
    }
    
}
