/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.review.newpackage;

/**
 *
 * @author alfre
 */
public class Employee {
    private int emId; 
    private String name;
    private String ssn; 
    private double salary; 
    
    public Employee(){
    salary =0.0;
    emId =1; 
    name = "";
    ssn = "";
    }

    public Employee(int emId, String name, String ssn, double salary) {
        this.emId = emId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    
    
    
 
    public int getEmId() {
        if (emId > 0){
        this.emId = emId; 
        System.out.println("Invalid emId");
        }
        return emId;
    }

 
    public void setEmId(int emId) {
        this.emId = emId;
    }


    public String getName() {
        return name;
    }

 
    public void setName(String name) {
        this.name = name;
    }


    public String getSsn() {
        return ssn;
    }


    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    public double getSalary() {
        return salary;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void display(){
    System.out.println("EmId: "+ emId+
                       "\nName: "+ name+
                       "\nSsn: "+ ssn+
                       "\nSalary: "+ salary
                        ); 
    }
    
    
}
