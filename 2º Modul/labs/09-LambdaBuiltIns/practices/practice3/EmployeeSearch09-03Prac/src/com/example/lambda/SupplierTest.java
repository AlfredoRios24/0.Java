package com.example.lambda;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Supplier;

/**
 *
 * @author oracle
 */
public class SupplierTest {
  
  public static void main(String[] args) {
    
    List<Employee> eList = Employee.createShortList();
    Employee first = eList.get(0);
    
    Supplier<Employee> eSupp; // Write your Supplier lambda here
    
    eSupp = () -> new Employee.Builder()
                .givenName("Jil").surName("Doe")
                .age(26).gender(Gender.FEMALE)
                .role(Role.STAFF).dept("Sales")
                .startDate(LocalDate.of(2012,7,14))
                .salary(45_1000.00)
                .email("jil.doe@example.com")
                .phoneNumber("123456")
                .address("Smallville")
                 . state("KS")
                        .code("12333")
                        .build(); 
                        
                        
                        System.out.println("=== Print employee list before");
    eList.stream().forEach(Employee::printSummary);
    
    // Add new employee here
    eList.add(eSupp.get());
    
    
    
    System.out.println("\n=== Print employee list after");
    eList.stream().forEach(Employee::printSummary);
    
        
  }
}
