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
public class Mechanic extends Person{
    private ArrayList<Task> allTasks;
    
    public Mechanic(int number, String name, String adress, String email, String password, String zipcode, String place) {
        super(number, name, adress, email, password, zipcode, place);
        allTasks = new ArrayList<Task>();
    }
    
    public boolean addTask(Task newTask) {
        if(!(allTasks.contains(newTask))) {
            allTasks.add(newTask);
            return true;
        }
        return false;
    }
    
    public ArrayList<Task> getTasks() {
        return allTasks;
    }
        
    
}
