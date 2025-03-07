/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m206.interfaces.newpackage;

/**
 *
 * @author alfre
 */
public class CrushedRock implements SalesCalc {
    
    private String name; 
    private double salesPrice; //por pounds
    private double cost; 
    private double weight; // in pounds

    public CrushedRock(String name, double salesPrice, double cost, double weight) {
        this.name = name;
        this.salesPrice = salesPrice;
        this.cost = cost;
        this.weight = weight;
    }

           
    public double getSalesPrice() {
        return salesPrice;
    }
    public double getCost() {
        return cost;
    }
    public double getWeight() {
        return weight;
    }
         @Override
    public String getName() {
        return name;
    }
        @Override
    public String toString() {
        return "CrushedRock: " + getName() + 
                ", salesPrice=" + getSalesPrice() + 
                ", cost=" + getCost() + 
                ", weight=" + getWeight() ;
        }

         @Override
    public double calcSalesPrice() {
        return this.getSalesPrice()*this.getWeight(); 
    }

         @Override
    public double calcCost() {
       return this.getCost()*this.getWeight();
    }

    @Override
    public double calcProfit() {
        return this.calcSalesPrice()-this.calcCost();
    }
    
    
    
    
}
