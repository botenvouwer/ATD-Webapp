/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.time.LocalDate;

/**
 *
 * @author Nigel
 */
public class Reservation {
    private int number;
    private Parking parkinglot;
    private LocalDate arriveDate;
    private LocalDate leaveDate;
    
    public Reservation(int number, Parking parkinglot, LocalDate arriveDate, LocalDate leaveDate) {
        this.number = number;
        this.parkinglot = parkinglot;
        this.arriveDate = arriveDate;
        this.leaveDate = leaveDate;
    }
    
    public int getNumber() {
        return number;
    }
    
    public boolean equals(Object ref) {
        if(ref instanceof Reservation) {
            if(((Reservation)ref).getNumber() == getNumber()) {
                return true;
            }
        }
        return false;
    }
    
    public String toString() {
        return number + " " + arriveDate + " " + leaveDate;
    }
}
