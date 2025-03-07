package com.example;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class IntegerStack {

    private Deque<Integer> data = new ArrayDeque<>();

      // Métodos push, pop y peek se implementarán aquí
    
        // Método para agregar un elemento al tope de la pila
        public void push(int value) {
        data.push(value);
        }

        // Método para eliminar y devolver el elemento del tope de la pila
        public int pop() {
        if (data.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return data.pop();
        } 

        
           // Método para devolver el elemento del tope de la pila sin eliminarlo
        public int peek() {
        if (data.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return data.peek();
        }

        // Método para verificar si la pila está vacía
        public boolean isEmpty() {
        return data.isEmpty();
        }
        
        // Método para convertir la pila a un ArrayList
        public List<Integer> toArrayList() {
        return new ArrayList<>(data);
        }
        
        
        
        
}
