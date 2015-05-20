/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Nigel
 */
@Entity
public class Invoice implements Serializable{
    @OneToMany
    private ArrayList<InvoiceLine> allLines;
    @ManyToOne
    private Customer theCustomer;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int number;
    private LocalDate date;
    private boolean paid;
    private double discount;
    private double tax = 1.21;
    
    public Invoice(Customer theCustomer, int number, LocalDate date) {
        this.theCustomer = theCustomer;
        allLines = new ArrayList<>();
        this.date = date;
        paid = false;
        discount = 0;
    }
    
    public Invoice(Customer theCustomer, int number, LocalDate date, double discount) {
        allLines = new ArrayList<>();
        this.theCustomer = theCustomer;
        this.date = date;
        this.discount = discount;
        paid = false;
    }
    
    public void addLine(InvoiceLine newLine) {
        allLines.add(newLine);
    }
    
    public void addLines(ArrayList<InvoiceLine> newLines) {
        for(InvoiceLine newLine : newLines) {
            addLine(newLine);
        }
    }
    
    public void removeLine(InvoiceLine wrongLine) {
        if(allLines.contains(wrongLine)) {
            allLines.remove(wrongLine);
        }
    }
    
    public void setPaid(boolean paid) {
        this.paid = paid;
    }
    
    public boolean getPaid() {
        return paid;
    }
    
    public double getTax() {
        return tax;
    }
    
    public double getTotal() {
    double totalPrice = 0;
    for(InvoiceLine line : allLines) {
        totalPrice += line.getTotal();
    }
    return totalPrice * tax;
    }
    
    public ArrayList<InvoiceLine> getLines() {
        return allLines;
    }
    
    public int getSize() {
        return allLines.size();
    }
    
    public int getNumber() {
        return number;
    }
    
    public String toString() {
        return getNumber() + " " + getTotal() + " " + getNumber(); 
    }
    
    
    
    
    
}
