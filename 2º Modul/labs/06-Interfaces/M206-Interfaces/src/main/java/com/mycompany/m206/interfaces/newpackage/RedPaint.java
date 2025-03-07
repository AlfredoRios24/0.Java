/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m206.interfaces.newpackage;

/**
 *
 * @author alfre
 */
public class RedPaint implements SalesCalc {

    private double salesPrice; //por gallons
    private double cost; 
    private double volume; // in gallons

    public RedPaint(double salesPrice, double cost, double volume) {
        this.salesPrice = salesPrice;
        this.cost = cost;
        this.volume = volume;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public double getCost() {
        return cost;
    }

    public double getVolume() {
        return volume;
    }
    
    
    
    @Override
    public String getName() {
       return "Red Paint"; 
    }

    @Override
    public double calcSalesPrice() {
       return this.salesPrice*this.volume;
    }

    @Override
    public double calcCost() {
         return this.cost*this.volume;
    }
    @Override
    public double calcProfit() {
       return this.cost*this.volume;
    
    
    
}
    
}
