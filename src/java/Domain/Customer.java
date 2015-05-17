/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;

/**
 *
 * @author Nigel
 */
public class Customer extends Person{
    private ArrayList<Reservation> reservations;
    private ArrayList<Task> tasks;
    private ArrayList<Invoice> invoices;
    private ArrayList<Car> cars;
    
    public Customer(int number, String name, String adress, String email, String password, String zipcode, String place) {
        super(number, name, adress, email, password, zipcode, place);
        reservations = new ArrayList<Reservation>();
        tasks = new ArrayList<Task>();
        invoices = new ArrayList<Invoice>();
        cars = new ArrayList<Car>();
    }
    
    public boolean addReservation(Reservation newReservation) {
        if(!(reservations.contains(newReservation))) {
            reservations.add(newReservation);
            return true;
        }
        return false;
    }
    public boolean addTask(Task newTask) {
        if(!(tasks.contains(newTask))) {
            tasks.add(newTask);
            return true;
        }
        return false;
    }
    public boolean addInvoice(Invoice newInvoice) {
        if(!(invoices.contains(newInvoice))) {
            invoices.add(newInvoice);
            return true;
        }
        return false;
    }
    public boolean addCar(Car newCar) {
        if(!(cars.contains(newCar))) {
            cars.add(newCar);
            return true;
        }
        return false;
    }
    
    
    
}
