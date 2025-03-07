/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author alfre
 */
public class CheckingAccount extends Account{

    private final double overDraftLimit;


    //CONSTRUCTOR
    public CheckingAccount(double balance, double overDraftLimit) {
        super(balance);
        this.overDraftLimit = overDraftLimit;
         
    }

    @Override
    public boolean withdraw(double amount) {
       
        return false;
       
    }

    @Override
    public String getDescription() {
       return "Checking Account"; 
    }
    
    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public double getBalance() {
        return balance;
    }
    
    
    
    
}

//    @Override
//    public abstract boolean withdraw(double amount) {
//        boolean bOk = (amount < = balance + overDraftLimit); 
//        if (bOk){
//            balance -= amount; 
//                }
//        return bOk; 
//    }
//
//    @Override
//    public abstract String getDescription() {
//        return "Checking Account"; 
//    }
//    
//}
