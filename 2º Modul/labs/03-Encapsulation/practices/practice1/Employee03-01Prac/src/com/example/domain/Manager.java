/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.domain;

/**
 *
 * @author alfre
 */
public class Manager extends Employee {
    
    private String deptName; 
    
    
    public Manager(int empId, String name, String ssn, double salary) {
        super(empId, name, ssn, salary);
        this.deptName = deptName; 
           }
           
    /**
     * @return the deptName
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * @param deptName the deptName to set
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    
    
    
    
}
