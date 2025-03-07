/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m206.interfaces.newpackage;

/**
 *
 * @author alfre
 */
public class ItemReport {
    
        public static void printItemData (SalesCalc sc){
          System.out.println(" Name: " +sc.getName() +
                         "\n SalesPrice: " +sc.calcSalesPrice() +
                         "\n Cost: " + sc.calcCost() + 
                         "\n Profit: " +sc.calcProfit()
                            );
            }
    
    
}
