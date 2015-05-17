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
public class OrderLine extends ArticleChange{
    private int number;
    private Article orderArticle;
    private int quantity; 

    public OrderLine(int number, int quantity, Article article) {
        super(number, quantity, article);
    }
    
    public String toString() {
        return number + " " + orderArticle + " " + quantity;
    }
}
