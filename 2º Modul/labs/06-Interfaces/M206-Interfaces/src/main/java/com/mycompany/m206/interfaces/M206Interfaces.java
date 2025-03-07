/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.m206.interfaces;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface OperadorMatematico {
    int operar(int a, int b);
}

public class M206Interfaces {

    public static void main(String[] args) {
        
         // Uso de una expresión lambda para implementar el método operar
        OperadorMatematico suma = (a, b) -> a + b;
        OperadorMatematico resta = (a, b) -> a - b;

        System.out.println("Suma: " + suma.operar(5, 3));  // Salida: Suma: 8
        System.out.println("Resta: " + resta.operar(5, 3)); // Salida: Resta: 2
        
        System.out.println("");
         // Uso de una expresión lambda para crear un hilo
        Runnable tarea = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Tarea en ejecución " + i);
            }
        };
       
        Thread hilo = new Thread(tarea);
        hilo.start();
    
       
        List<String> nombres = Arrays.asList("Ana", "Pedro", "Juan", "Maria");

        // Uso de una expresión lambda con Stream API
      
        nombres.stream()
               .filter(nombre -> nombre.startsWith("A"))
               .forEach(nombre -> System.out.println(nombre)); // Salida: Ana
    }
        
        
        
    
}






