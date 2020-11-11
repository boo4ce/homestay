/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homestay;

//import java.sql.Connection;
//import java.sql.SQLException;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import view.LoginFrame;

/**
 *
 * @author nguye
 */
public class HOMESTAY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        EmployeeTask et = new EmployeeTask();
//        et.get();
        new LoginFrame().run();
    }
    
}

//Connection conn = model.DatabaseConnection.getConnection();
//        
//        if(conn == null) {
//            System.out.println("Can't connect to database");
//            System.exit(0);
//        }
//        String cmd = "SELECT * FROM Account";
//        
//        try {
//            Statement stm = conn.createStatement();
//            
////            stm.executeUpdate("INSERT INTO Account(AccountID, Password, EmployeeID)"
////                            + "VALUES ('Hello', '12345', 1)");
//            
//            ResultSet res = stm.executeQuery(cmd);
//            while(res.next()) {
//                System.out.println(res.getString("AccountID") + " " + res.getString("Password"));
//            }
//            
//            res.close();
//            stm.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(HOMESTAY.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (NullPointerException ex) {
//            System.out.println(ex);
//        }