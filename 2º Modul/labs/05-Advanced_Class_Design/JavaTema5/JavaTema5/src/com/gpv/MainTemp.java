/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.gpv;

import com.gpv.domain.Temperatua;

/**
 *
 * @author pue
 */
public class MainTemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Temperatua t1 = Temperatua.CALOR;
        System.out.println(t1.getGradosMin() + " "  + t1.getGradosMax());
    }
    
}
