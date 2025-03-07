
package com.gpv;

public class Employee {
    public int empId;
    public String name;
    public String ssn;
    public double salary;
    
    
    public Employee(){
        salary=0.0;
        empId=1;
        name="";
        ssn="";
    }
    public Employee(int empId, String name, String ssn, double salary){
        this.empId=empId;
        this.name=name;
        this.salary=salary;
        this.ssn=ssn;
    }

    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId){
        if(empId > 0 ){
            this.empId = empId;
        }
        System.out.println("Invalid empid");
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        if(name!=null && !name.isBlank())
            this.name=name;
        System.out.println("Invalid name");
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }
    
    public void display(){
        System.out.println("EmpId: " + empId + " Name: " + name + " ssn: "
            + ssn + " Salary: " + salary);
    }
}
