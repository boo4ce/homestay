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
    public <T> void add(T object);
    public void get();
    public <T> T getByID(int id);
    public <T> void deleteByID(int id);
    public <T> void modifyByID(int id);
}
