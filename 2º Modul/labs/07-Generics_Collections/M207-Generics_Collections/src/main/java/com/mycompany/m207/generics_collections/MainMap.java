/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.m207.generics_collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author alfre
 */
public class MainMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, String> partList = new TreeMap<>(); 
        partList.put("S0001", "Blue Polo Shirt"); 
        partList.put("S0003", "Black Polo Shirt"); 
        partList.put("S0002", "Red Polo Shirt"); 
        partList.put("H0001", "Duke Hat"); 
        System.out.println(" map: " +partList);
        
            partList.put("S0002", "Yellow Polo Shirt"); 
            System.out.println(" map: " +partList);
        
            
            String value = partList.get("H0001");  
            System.out.println(" value: " +value);
        
        System.out.println(" containsKey : " +partList.containsKey("S0003"));
        System.out.println(" containsValue : " +partList.containsValue("Black Polo Shirt"));
        
          Set<String> keys = partList.keySet(); 
            for (String k : keys){
            String v = partList.get(k);
                System.out.println("k: " + k + " v: " + v);
                
                System.out.println("");
                
                
                
                
            }
        
        
    }
    
}
