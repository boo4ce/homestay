/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
import java.util.Date;

/**
 *
 * @author nguye
 */
public class Person {
    private int ID;
    private String name;
    private Date birth;
    
    public Person(int ID, String name, Date birth) {
        this.ID = ID;
        this.name = name;
        this.birth = birth;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
       
}
