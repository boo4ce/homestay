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
public class Employee extends Person {
    private String position;
    private Date startDay;
    private int managerID;

    public Employee(int ID, String name, Date birth, String position, Date startDay, int managerID) {
        super(ID, name, birth);
        this.position = position;
        this.startDay = startDay;
        this.managerID = managerID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }
    
}
