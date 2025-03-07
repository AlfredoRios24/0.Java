/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.m204.polimorfism;

/**
 *
 * @author alfre
 */
public class M204Polimorfism {

    
    public static void main(String[] args) {
        
        // Object hashCode
       // byte unByte = 0b000011;
         int unByte = 0b000011;
        
            System.out.println("unByte " +unByte);
        
        unByte =(byte) (unByte >>> 1); 
            System.out.println("unByte " +unByte);
        
           // Obtener la única instancia del Singleton.
        Singleton singleton = Singleton.getInstance();
        
        // Llamar a un método de la instancia del Singleton.
        singleton.mostrarMensaje();  
            
            
        
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "M204Polimorfism{" + '}';
    }
    
    
    
}
