/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author Nigel
 */
public class Parking {
    private int number;
    private int spots;
    
    public Parking(int number, int spots) {
        this.number = number;
        this.spots = spots;
    }
    
    public int getSpots() {
        return spots;
    }
}
