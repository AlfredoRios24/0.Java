/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.domain;

/**
 *
 * @author alfre
 */
public class Enginer extends Employee{
    
    public Enginer(int empId, String name, String ssn, double salary) {
        super(empId, name, ssn, salary);
      
    }


       public void printEnginer(){
       System.out.println( "\n Employee ID: " +this.getEmpId() +
                           "\n Employee Name: " +this.getName() +
                           "\n Employee ssn: " +this.getSsn() +
                           "\n Employee Salary: " +this.getSalary() 
                      ); 
    
    
    
        }
}