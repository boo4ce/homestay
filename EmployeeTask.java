/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import entity.Employee;
import entity.Table;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 *
 * @author nguye
 */
public class EmployeeTask implements Task {
    private SQLQuery sqlQ;
    
    public EmployeeTask() {
        this.sqlQ = new SQLQuery();
    }
    
    @Override
    public <T> void add(T employee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<Employee> get() {        
        List<Object[]> component = sqlQ.queryExecute("SELECT * FROM Employee", 
                entity.Table.getWidth(Table.tableName.EMPLOYEE)); 
        
        List<Employee> list = new ArrayList<>();
        for(Object[] x : component) {
            CheckEmpty.fixEmpty(x);
            
            Employee e = new Employee((short) x[0],(String) x[1],(Date) x[2],
                    (String) x[3],(Date) x[4],(short) x[5]);
            
            list.add(e);
        }
        
        return list;
    }
     
    @Override
    public Employee getByID(int id) { 
        List<Object[]> component = sqlQ.queryExecute("SELECT * FROM Employee" 
                + " WHERE EmployeeId='" + id + "';", 
                entity.Table.getWidth(Table.tableName.EMPLOYEE)); 
        
        Object[] x = component.get(0);
        CheckEmpty.fixEmpty(x);
        
        Employee e = new Employee((short) x[0],(String) x[1],(Date) x[2],
                    (String) x[3], (Date) x[4],(short) x[5]);
        
        return e;
    }

    @Override
    public <T> void deleteByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modifyByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getNameByID(int id) {
        Employee e = this.getByID(id);
        return e.getName();
    }
}
