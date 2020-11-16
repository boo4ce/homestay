/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author acer
 */
public class CheckEmpty {
    public static void fixEmpty(Object[] object) {
        for(int i = 0 ; i < object.length; i++) {
            if(object[i] instanceof entity.Empty) {
                object[i] = null;
            }
        }
    }
}
