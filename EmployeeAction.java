/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.EmployeeTask;

/**
 *
 * @author nguye
 */
public class EmployeeAction {
    private static EmployeeTask et = new EmployeeTask();
    
    public static String getNameByID(short id) {
        return et.getNameByID(id);
    }
}
