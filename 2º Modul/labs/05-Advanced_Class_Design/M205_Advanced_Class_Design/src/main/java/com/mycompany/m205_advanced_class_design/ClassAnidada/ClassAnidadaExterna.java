/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m205_advanced_class_design.ClassAnidada;

/**
CLASE INTERNA NO ESTATICA
 */
public class ClassAnidadaExterna {
    
        class ClaseInterna {
        public void mostrarMensaje() {
            System.out.println("Hola desde la clase interna");
        }
    }

    public static void main(String[] args) {
        ClassAnidadaExterna claseExterna = new ClassAnidadaExterna();
        ClassAnidadaExterna.ClaseInterna claseInterna = claseExterna.new ClaseInterna();
        claseInterna.mostrarMensaje();
    }
}

    

