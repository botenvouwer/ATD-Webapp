/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Nigel
 */
public class Order {
    private ArrayList<OrderLine> orderLines;
    private int number;
    private LocalDate date;
    
   public Order(int number, LocalDate date) {
       this.number = number;
       this.date = date;
       orderLines = new ArrayList<OrderLine>();
   } 
   
   public void addLine(OrderLine newLine) {
       orderLines.add(newLine);
   }
   
   public void addLines(ArrayList<OrderLine> newLines) {
       for(OrderLine newLine : newLines) {
           orderLines.add(newLine);
       }
   }
}
