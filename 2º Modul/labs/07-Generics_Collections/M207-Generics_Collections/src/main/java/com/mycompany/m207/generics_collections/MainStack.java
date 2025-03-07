/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.m207.generics_collections;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author alfre
 */
public class MainStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Deque <String> stack = new ArrayDeque<>(); 
        
        stack.push("one"); 
         stack.push("two"); 
         stack.push("three"); 
           System.out.println("\nStack");
         System.out.println("size " + stack.size());
         while ( !stack.isEmpty()) {
         String popElto = stack.pop();
             System.out.println(popElto);
         
         } 
         
         System.out.println("\nQueue"); //ordena cola por orden ascendente
         Deque <String> queue = new ArrayDeque<>(); 
         queue.add("one"); 
         queue.add("two"); 
         queue.add("two"); 
          while ( !queue.isEmpty()) {
         String popElto = queue.poll();
             System.out.println(popElto);
         
    }
    
}
}