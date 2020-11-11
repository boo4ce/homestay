/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author nguye
 */
public class Table {    

    public static enum tableName {EMPLOYEE , CUSTOMER, DEAL, ROOM, BILL, ACCOUNT, VOUCHER};
    public static int getWidth(Table.tableName name) {
        return switch (name) {
            case EMPLOYEE -> 6;
            case CUSTOMER -> 5;
            case DEAL -> 5;
            case ROOM -> 4;
            case BILL -> 5;
            case ACCOUNT -> 3;
            case VOUCHER -> 3;
            default -> -1;
        };
    }
}
