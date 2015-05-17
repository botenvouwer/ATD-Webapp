/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Nigel
 */
public class Task {
    private int number;
    public enum Repairtype {APK, REPAIR};
    Repairtype repairtype;
    private LocalDate date;
    private double hours; // half an hour is 0.5
    private boolean finished;
    private String customerNote;
    private String mechanicNote;
    private Customer theCustomer;
    private Mechanic theMechanic;
    private ArrayList<UsedArticle> usedArticles;
    
    public Task(int number, Repairtype repairtype, LocalDate date, Customer theCustomer, Mechanic theMechanic, String customerNote) {
        this.number = number;
        this.repairtype = repairtype;
        this.date = date;
        this.theCustomer = theCustomer;
        this.theMechanic = theMechanic;
        this.customerNote = customerNote;
        finished = false;
        usedArticles = new ArrayList<UsedArticle>();
    }
    
    public boolean setFinished(double hours) {
        if(finished) {
            return false;
        }
        this.hours = hours;
        return true;
    }
    
    public boolean setFinished(double hours, ArrayList<UsedArticle> usedArticles) {
        if(finished) {
            return false;
        }
        this.hours = hours;
        this.usedArticles = usedArticles;
        return true;
    }
    
    public void setMechancNote(String note) {
        mechanicNote = note;
    }
}
