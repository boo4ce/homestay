/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import entity.Room;
import model.RoomTask;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acer
 */
public class RoomAction {
    private static RoomTask rt = new RoomTask();
    
    public static void updateTable(DefaultTableModel reference) {
        List<Room> list = rt.get();
        
        for(Room r : list) {
            reference.addRow(new Object[]{
                r.getRoomID(), r.getName(), r.getKind(), r.getNumBed(), r.getPrice(), (r.isAvailable()?"Trống":"Đang sử dụng")
            });
        }
        
//        System.out.println(reference.getColumnCount());
//        return reference;
    }
    
    public static void updateTable(DefaultTableModel reference, String name, 
            String kind, String numBed, String price, String available) {
//        reference = new DefaultTableModel(new String[]{"ID", "Tên", "Loại", "Số giường", "Giá", "Trạng thái"}, 0);
        reference.setRowCount(0);
        List<Room> list = rt.getByOption(name, kind, numBed, price, available);
        
        for(Room r : list) {
            reference.addRow(new Object[]{
                r.getRoomID(), r.getName(), r.getKind(), r.getNumBed(), r.getPrice(), (r.isAvailable()?"Trống":"Đang sử dụng")
            });
        }
        
        System.out.println("Row: " + reference.getRowCount());
        
    }
    public static void getCbbox(javax.swing.JComboBox<String> cbbox, String coloumnName) {
        List<String> list = rt.getRealityName(coloumnName);
       
        for(String s : list) {
            cbbox.addItem(s);
        }
    }
}
