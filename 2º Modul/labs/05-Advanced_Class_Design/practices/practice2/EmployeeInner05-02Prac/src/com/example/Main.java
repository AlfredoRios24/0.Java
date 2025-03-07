/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.example;

/**
 *
 * @author alfre
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Employee jane = new Employee("Jane Doe", "Manager", "HR", 65000);
        Employee john = new Employee("John Doe", "Staff", "HR", 55000);

        System.out.println("Jane's withholding: " + jane.getWithholding());
        System.out.println("John's bonus " + john.getBonus());

        
    }
    
}
