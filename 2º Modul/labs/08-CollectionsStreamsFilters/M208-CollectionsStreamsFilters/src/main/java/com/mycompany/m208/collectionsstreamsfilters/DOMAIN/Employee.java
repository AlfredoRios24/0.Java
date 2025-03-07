
package com.mycompany.m208.collectionsstreamsfilters.DOMAIN;

import java.time.LocalDate;


public class Employee {
    private final  int id; 
    private final String name;
    private final LocalDate hireDate;
    private final int age;
    private final double salary;
    private final  Gender gender;
    
    private Employee(Builder b){
        id = b.id;
        name = b.name; 
        hireDate = b.hireDate; 
        age = b.age; 
        salary = b.salary; 
        gender = b.gender;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", hireDate=" + hireDate + ", age=" + age + ", salary=" + salary + ", gender=" + gender + '}';
    }

    
    
    
    
    
    
    
    
    
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public Gender getGender() {
        return gender;
    }
    
    public static class Builder {
    
    private   int id = 1; 
    private  String name = "No Name";
    private  LocalDate hireDate = LocalDate.now();
    private  int age = 18;
    private  double salary = 1200.00;
    private   Gender gender = Gender.Female;
    
            public Builder id(int id){
             this.id =id;
             return this;
                }
            
            public Builder name(String name){
             this.name =name;
             return this;
                }
            
             public Builder hireDate(LocalDate hireDate){
             this.hireDate =hireDate;
             return this;
                }
             
             
              public Builder age(int age){
             this.age =age;
             return this;
                }
              
               public Builder salary (double salary){
             this.salary =salary;
             return this;
                }
               
                  public Builder gender (Gender gender){
             this.gender =gender;
             return this;
                }
                  
                  public Employee build(){
                      return new Employee(this);
                  }
                  
    
    }
    
    
    
    
    public enum Gender {
    Male, Female;
       
    }
    
    
    
}
