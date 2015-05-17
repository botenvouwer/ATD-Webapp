/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import static domain.ArticleChange.Kind.ORDER;
import static domain.ArticleChange.Kind.USED;

/**
 *
 * @author Nigel
 */
public class ArticleChange {
    private int quantity;
    private int number;
    private Article article;
    public enum Kind {ORDER, USED};
    Kind kind;
    
    public ArticleChange(int number, int quantity, Article article) {
        this.article = article;
        if(this instanceof OrderLine) {
            this.kind = kind.ORDER;
        }
        else if(this instanceof UsedArticle) {
            this.kind = kind.USED;
        }
        this.number = number;
        this.quantity = quantity;
        changeStock();
    }
    
    public boolean changeStock() {
        if(kind.equals(ORDER)) {
            return article.stockIn(quantity);
        }
        
        else if(kind.equals(USED)) {
            return article.stockOut(number);
        }
        return false;
    }
    
    public boolean equals(Object ref) {
        if(ref instanceof ArticleChange) {
            if(number == ((ArticleChange)ref).getNumber()) {
                return true;
            }
        }
        return false;
    }
    
    public int getNumber() {
        return number;
    }
    
}
