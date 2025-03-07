package com.example.domain;

public class Employee {

    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empId, String name, String ssn, double salary) {
      //  this(empId, name, ssn, salary);
    }

    public Employee() {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    
    
    public void printEmployee(){
       System.out.println( "\n Employee ID: " +this.getEmpId() +
                           "\n Employee Name: " +this.getName() +
                           "\n Employee ssn: " +this.getSsn() +
                           "\n Employee Salary: " +this.getSalary() 
                      ); 
      
    }

}
