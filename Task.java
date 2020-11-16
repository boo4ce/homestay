/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author nguye
 */
public interface Task {
    // them 1 object vao database
    public <T> void add(T object);
    
    // lay ra tat ca database
    public <T> java.util.List<T> get();
    
    // lay ra thuc the theo id tu database
    public <T> T getByID(int id);
    
    // xoa thuc the theo id
    public <T> void deleteByID(int id);
    
    // sua thuc the theo id
    public void modifyByID(int id);
}
