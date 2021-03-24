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
public class EmployeeLogin {
    public static short login(String AccountID, String Password) {
        Connection conn = DatabaseConnection.getConnection();
        boolean res = false;
          
        try {
            Statement stm = conn.createStatement();
            
            ResultSet rs;
            rs = stm.executeQuery("SELECT * FROM Account" + " WHERE " 
                            + "AccountId='" + AccountID + "'"
                            + " AND Password='" + Password + "';");
                                        // j'or'1'='1
            if(rs.next()) res = true;
            
            if(res == true) {
                return rs.getShort("EmployeeId");
            } 
        } catch(SQLException ex) {
            System.out.println(ex);
        }
        
        return -2;
    } 
}
