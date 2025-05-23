package com.example.lambda;

import java.util.List;
import java.util.function.ToDoubleFunction;

/**
 *
 * @author oracle
 */
public class FunctionTest {
  
  public static void main(String[] args) {
    
    List<Employee> eList = Employee.createShortList();
    Employee first = eList.get(0);
    
    ToDoubleFunction<Employee> eFunc; // Write your function lambda here
    eFunc = e -> e.getSalary() * Bonus.byRole(e.getRole()); 
    
      
    System.out.println("=== First Employee Bonus");
    first.printSummary();
    System.out.println("Bonus: " +eFunc.applyAsDouble(first) ); // Print the result here
        eList.stream() 
                    .mapToDouble(eFunc)
                    .forEach(d -> System.out.println("Bonus: " +d));
  }
}
