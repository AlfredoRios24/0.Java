/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m205_advanced_class_design.ClassAnidada;

/**
 *
 * @author alfre
 */
public class ClaseLocal1 {
    
  
    public void metodoConClaseLocal() {
        // Clase local dentro de un método
        class ClaseLocal {
            public void mostrarMensaje() {
                System.out.println("Hola desde la clase local");
            }
        }
        ClaseLocal claseLocal = new ClaseLocal();
        claseLocal.mostrarMensaje();
    }

    public static void main(String[] args) {
        ClaseLocal1 claseExterna = new ClaseLocal1();
        claseExterna.metodoConClaseLocal();
    }
}

    

