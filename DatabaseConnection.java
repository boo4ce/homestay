/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.*;

/**
 *
 * @author nguye
 */
public class DatabaseConnection {
    private static String database_URL = "jdbc:sqlserver://localhost:1433;" + 
            "databaseName=HOMESTAY;";
    private static String username = "homestay2";
    private static String password = "homestay";
     
    public static Connection getConnection() {
        System.out.println("jfjlsk");
        Connection conn = null;         
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                conn = DriverManager.getConnection(database_URL, username, password);                
            }
            catch (Exception ex) {
                System.out.println(ex);
            }
        
        return conn;
    }
    
    public static boolean verify(String username, String password) {
        return (DatabaseConnection.username.equals(username) && DatabaseConnection.password.equals(password));
    }
}
