/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.gpv;

import com.gpv.domain.BankEMICalculator;

/**
 *
 * @author pue
 */
public class MainBankEMICalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankEMICalculator bEmi = new BankEMICalculator("Guillermo", "123-345", 100_000.00);
        bEmi.display();
    }
    
}
