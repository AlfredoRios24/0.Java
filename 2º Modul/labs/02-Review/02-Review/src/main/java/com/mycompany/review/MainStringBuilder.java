/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.review;

/**
 *
 * @author alfre
 */
public class MainStringBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        String saludo = "Hola"; 
        saludo = saludo + " "; 
        StringBuilder sb = new StringBuilder ("Hola"); 
        sb.append (" "). append("!"); 
        
        System.out.println(sb); 
        
        
        
    }
    
}
