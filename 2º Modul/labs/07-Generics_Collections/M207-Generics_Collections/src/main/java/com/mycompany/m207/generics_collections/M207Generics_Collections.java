package com.mycompany.m207.generics_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class M207Generics_Collections {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    
 System.out.println("\n==========uso Hash Set =======");
        Set<String> nombres = new HashSet<>();
        
        nombres.add("Ana");
        nombres.add("Pedro");
        nombres.add("Juan");
        nombres.add("Ana"); // Este elemento no se añadirá ya que es un duplicado
        
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        
        // Comprobación de existencia
        if (nombres.contains("Pedro")) {
            System.out.println("Pedro está en el set.");
        }
        
        
        System.out.println("\n==========uso Linked Hash Set =======");
        Set<String> nombres1 = new LinkedHashSet<>();
        
        nombres1.add("Ana");
        nombres1.add("Pedro");
        nombres1.add("Juan");
        nombres1.add("Ana"); // Este elemento no se añadirá ya que es un duplicado
        
        for (String nombre : nombres1) {
            System.out.println(nombre);
        }
        
         System.out.println("\n==========uso tree Set =======");
        
         Set<String> nombres2 = new TreeSet<>();
        
        nombres2.add("Ana");
        nombres2.add("Pedro");
        nombres2.add("Juan");
        nombres2.add("Ana"); // Este elemento no se añadirá ya que es un duplicado
        
        for (String nombre : nombres2) {
            System.out.println(nombre);
        }
         
         
        
    }
}
