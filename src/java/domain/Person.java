/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Nigel
 */
public class Person {

    public enum Role {BOSS, EMPLOYEE, CUSTOMER};
    Role role = Role.CUSTOMER;
    private int number;
    private String name;
    private String adress;
    private String email;
    private String password;
    private String zipcode;
    private String place;
    
    public Person(int number, String name, String adress, String email, String password, String zipcode, String place) {
        this.number = number;
        this.name = name;
        this.adress = adress;
        this.email = email;
        this.password = password;
        this.zipcode = zipcode;
        this.place = place;
    }
    
    public Person(Role role, int number, String name, String adress, String email, String password, String zipcode, String place) {
        this.role = role;
        this.number = number;
        this.name = name;
        this.adress = adress;
        this.email = email;
        this.password = password;
        this.zipcode = zipcode;
        this.place = place;
    }
    
    public boolean checkPassword(String check) {
        if (check.equals(password)) {
            return true;
        }
        return false;
    }
    
    public int getNumber() {
        return number;
    }
    
    public boolean equals(Object ref) {
        if(ref instanceof Person) {
            if(((Person)ref).getNumber() == getNumber()) {
                return true;
            }
        }
        return false;
    }
    
    public String toString() {
        return name + " " + role;
    }
    
}
