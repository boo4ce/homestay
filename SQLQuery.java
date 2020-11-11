/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import entity.Table;
/**
 *
 * @author nguye
 */
public class SQLQuery {
    private Connection conn;
    private Statement stm;
    
    public SQLQuery() {
        this.conn = DatabaseConnection.getConnection();
        try {
            this.stm = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(SQLQuery.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    
    public void insertExecute(String command) {
        try {
            this.stm.executeUpdate(command);
        } catch (SQLException ex) {
            Logger.getLogger(SQLQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    public List<Object[]> queryExecute(String command, Table.tableName name) {
        List<Object[]> result = new ArrayList<>();
        int n = Table.getWidth(name);
        
        try {
            ResultSet rs = this.stm.executeQuery(command);
            
            while(rs.next()) {   
                Object[] temp = new Object[20];
                for(int i = 1; i <= n; i++) {
                    if(rs.getObject(i) != null) temp[i-1] = rs.getObject(i);
                    else temp[i-1] = (short) 0;
                    
                }
                result.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SQLQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        System.out.println(result.get(0)[0] + " " + result.get(1)[0]);
        
        return result;
    }
    
    public void close() {
        try {
            this.stm.close();
            this.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Statement getStatement() {
        return this.stm;
    }
}
