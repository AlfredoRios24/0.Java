/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m205_advanced_class_design.ClassAnidada;

/**
 *
 * @author alfre
 */
public class ClaseAnonima {
    
 
    public void metodoConClaseAnonima() {
        // Clase anónima implementando una interfaz
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hola desde la clase anónima");
            }
        };
        runnable.run();
    }

    public static void main(String[] args) {
        ClaseAnonima claseExterna = new ClaseAnonima();
        claseExterna.metodoConClaseAnonima();
    }
}

    
    

