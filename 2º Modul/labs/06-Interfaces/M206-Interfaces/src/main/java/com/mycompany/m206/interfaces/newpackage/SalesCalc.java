/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.m206.interfaces.newpackage;

/**
 *
 * @author alfre
 */
public interface SalesCalc {
    
    public static final String reportTitle = "\n== Static List Report ==";
    
    
    public String getName(); 
    double calcSalesPrice(); 
    public double calcCost(); 
    public abstract double calcProfit(); 
    
    
    
}
