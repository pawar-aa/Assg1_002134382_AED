/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Employee;

import java.util.ArrayList;

/**
 *
 * @author: Aashay Pawar
 * @NUID: 002134382
 * @NUEMAIL: pawar.aa@northeastern.edu
 */
public class EmployeeRecord {
    private ArrayList<Employee> record;
    
    public EmployeeRecord(){
        this.record = new ArrayList<>();
        
    }

    public ArrayList<Employee> getRecord() {
        return record;
    }

    public void setRecord(ArrayList<Employee> record) {
        this.record = record;
    }
    
    public Employee addNewRecord(){
         Employee newEmployee = new Employee();
         record.add(newEmployee);
         return newEmployee;
    }
    
    public void deleteRecord(int selectedIndex){
        record.remove(selectedIndex);
    }
    
    public void updateRecord(int selectedIndex, Employee e){
        record.set(selectedIndex, e);
    }
}
