/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m204.polimorfism;

/**
 *
 * @author alfre
 */
public class Singleton {
       
    // La instancia única de la clase, declarada como privada y estática.
    private static Singleton instanciaUnica;

    // Constructor privado para evitar la creación de instancias desde fuera de la clase.
    private Singleton() {
        // Código de inicialización aquí.
    }

    // Método público y estático que devuelve la instancia única.
    public static Singleton getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new Singleton();
        }
        return instanciaUnica;
    }

    // Otros métodos de la clase.
    public void mostrarMensaje() {
        System.out.println("¡Hola, soy un Singleton!");
    }
}

    

