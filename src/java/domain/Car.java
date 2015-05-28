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
public class Car {
    private int number;
    private String licensePlate;
    private String make;
    private String model;
    private ArrayList<Task> allTasks;
    
    public Car(int number, String licensePlate, String make, String model) {
        this.number = number;
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
    }
    
    public int getNumber() {
        return number;
    }
    
    public boolean equals(Object ref) {
        if(ref instanceof Car) {
            if(((Car)ref).getNumber() == getNumber()) {
                return true;
            }
        }
        return false;
    }
    
    public boolean addTask(Task newTask) {
        if(!(allTasks.contains(newTask))) {
            allTasks.add(newTask);
            return true;
        }
        return false;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ArrayList<Task> getAllTasks() {
        return allTasks;
    }

    public void setAllTasks(ArrayList<Task> allTasks) {
        this.allTasks = allTasks;
    }
    
}