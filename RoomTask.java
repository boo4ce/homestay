/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import entity.Room;
import entity.Table;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acer
 */
public class RoomTask implements Task {
    private SQLQuery sqlQ;
    
    public RoomTask() {
        sqlQ = new SQLQuery();
    }
    
    @Override
    public <T> void add(T object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Room> get() {
        List<Object[]> component = sqlQ.queryExecute("SELECT * FROM Room", 
                entity.Table.getWidth(Table.tableName.ROOM)); 
        List<Room> list = new ArrayList<>();
             
        for(Object[] x : component) {
            CheckEmpty.fixEmpty(x);
            Room r = new Room((short) x[0],(String) x[1],(String) x[2],
                (short) x[3],(boolean) x[4],(int) x[5]);
            list.add(r);
        }
        
//        System.out.println("so phong " + list.size());   
        return list;
    }

    @Override
    public <T> T getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> void deleteByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modifyByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Room> getByOption(String name, String kind, String numBed, 
            String price, String available) {
        String cmd = "";
//        System.out.println(name + "\n" + kind + "\n " + numBed + "\n " + price + "\n " + available);
        if(!"<None>".equals(name)) {
            cmd += "Name='" + name + "' AND ";
        }
        if(!"<None>".equals(kind)) {
            cmd += "Kind='" + kind +"' AND ";
        }
        if(!"<None>".equals(numBed)) {
            cmd += "NumBed='" + numBed + "' AND ";
        }
        if(!"<None>".equals(price)) {
            cmd += "Price='" + price + "' AND ";
        }
        if(!"<None>".equals(available)) {
            if(available.equals("Trống")) {
               cmd += "Available='1' AND ";
            }
            else cmd += "Available='0' AND ";
        }
        
        if(cmd.equals("")) {
            cmd = "SELECT * FROM Room";
        }
        else cmd = "SELECT * FROM Room WHERE " + cmd.substring(0, cmd.length()-4);
        
        List<Object[]> component = sqlQ.queryExecute(cmd, 
                entity.Table.getWidth(Table.tableName.ROOM)); 
        List<Room> list = new ArrayList<>();
             
        for(Object[] x : component) {
            CheckEmpty.fixEmpty(x);
            Room r = new Room((short) x[0],(String) x[1],(String) x[2],
                (short) x[3],(boolean) x[4],(int) x[5]);
            list.add(r);
        }
        
//        System.out.println("so phong " + list.size());   
        return list;
    }
    
    public List<String> getRealityName(String coloumnName) {
        String cmd = "SELECT DISTINCT " + coloumnName + " FROM Room";
        List<Object[]> component = sqlQ.queryExecute(cmd, 1);
        List<String> list = new ArrayList<>();
       
        for(Object[] x : component) {
            list.add(x[0].toString());
//            System.out.println(x[0].toString());
        }
        
        return list;
    }
}
