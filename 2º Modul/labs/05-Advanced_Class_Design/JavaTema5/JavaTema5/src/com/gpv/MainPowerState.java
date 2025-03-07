/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.gpv;

import com.gpv.domain.PowerState;

/**
 *
 * @author pue
 */
public class MainPowerState {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PowerState psTv = PowerState.ON;
        System.out.println("psTv " + psTv);
        PowerState psTv1 = psTv;
        System.out.println("psTv " + psTv + " psTv1 " + psTv1);
        psTv1=PowerState.OFF;
        System.out.println("psTv " + psTv + " psTv1 " + psTv1);
    }
    
}
