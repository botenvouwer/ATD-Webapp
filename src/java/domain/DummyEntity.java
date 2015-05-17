/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import domain.Person.Role;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author william
 */
@Entity
public class DummyEntity implements Serializable{
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number;
    
    @Enumerated(EnumType.STRING)
    private Role enumVoorbeeld;
    
    @OneToOne
    private DummyEntity related;

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Role getEnumVoorbeeld() {
        return enumVoorbeeld;
    }

    public void setEnumVoorbeeld(Role enumVoorbeeld) {
        this.enumVoorbeeld = enumVoorbeeld;
    }

    public DummyEntity getRelated() {
        return related;
    }

    public void setRelated(DummyEntity related) {
        this.related = related;
    }
    
    


    
    
}
