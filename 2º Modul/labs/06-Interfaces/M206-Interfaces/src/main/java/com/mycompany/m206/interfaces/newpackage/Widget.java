/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m206.interfaces.newpackage;

/**
 *
 * @author alfre
 */
public class Widget implements SalesCalc {

     private String name; 
    private double salesPrice; //por pounds
    private double cost; 
    private double units; // in pounds

    public Widget(String name, double salesPrice, double cost, double unit) {
        this.name = name;
        this.salesPrice = salesPrice;
        this.cost = cost;
        this.units = units;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public double getCost() {
        return cost;
    }

    public double getUnits() {
        return units;
    }
    
    
    
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calcSalesPrice() {
        return salesPrice+ units;
    }

    @Override
    public double calcCost() {
        return cost* units; 
    }

    @Override
    public double calcProfit() {
       return calcSalesPrice() - calcCost(); 
    }
    
    
    
}
