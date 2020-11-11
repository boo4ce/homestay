/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import entity.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 *
 * @author nguye
 */
public class EmployeeTask implements Task {
    private SQLQuery sqlQ;
    private List<Employee> list;
    
    public EmployeeTask() {
        this.sqlQ = new SQLQuery();
        this.list = new ArrayList<>();
    }
    
    @Override
    public <T> void add(T employee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void get() {        
        List<Object[]> component = sqlQ.queryExecute("SELECT * FROM Employee", 
                entity.Table.tableName.EMPLOYEE); 
        
        for(Object[] x : component) {
            Employee e = new Employee((short) x[0],(String) x[1],(Date) x[2],
                    (String) x[3],(Date) x[4],(short) x[5]);
            
            list.add(e);
        }
        for(Employee e : list) {
            System.out.println(e.getID() + " " + e.getName() + " " + e.getBirth()); 
        }
    }
     
    @Override
    public Employee getByID(int id) { 
        List<Object[]> component = sqlQ.queryExecute("SELECT * FROM Employee" 
                + " WHERE EmployeeId='" + id + "';", 
                entity.Table.tableName.EMPLOYEE); 
        
        Object[] x = component.get(0);
        
        Employee e = new Employee((short) x[0],(String) x[1],(Date) x[2],
                    (String) x[3], (Date) x[4],(short) x[5]);
        
        return e;
    }

    @Override
    public <T> void deleteByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> void modifyByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getNameByID(int id) {
        Employee e = this.getByID(id);
        return e.getName();
    }
}
