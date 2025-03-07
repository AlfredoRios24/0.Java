/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m205_advanced_class_design.ClassAnidada;

/**
CLASE ANIDADA EXTERNA
 */
public class ClasseExterna {
    static class ClaseAnidadaEstatica {
        public void mostrarMensaje() {
            System.out.println("Hola desde la clase anidada estática");
        }
    }

    public static void main(String[] args) {
        ClasseExterna.ClaseAnidadaEstatica claseAnidada = new ClasseExterna.ClaseAnidadaEstatica();
        claseAnidada.mostrarMensaje();
    }
}

