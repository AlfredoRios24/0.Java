
package com.example;


public class MainIntegerStack {


    public static void main(String[] args) {
     
        IntegerStack stack = new IntegerStack();

    for (int i = 0; i < 6; i++) {
         stack.push(i);
            }
    System.out.println("After pushing 5 elements: " + stack.toArrayList());

    int element = stack.pop(); 
    System.out.println("Popped element = " + element);

    System.out.println("After popping 1 element : " + stack.toArrayList());


    int top = stack.peek();
    System.out.println("Peeked element = " + top);
    System.out.println("After peeking 1 element : " + stack.toArrayList());
    

        
        
    }
    
}


                    // Agregar elementos a la pila
//                    stack.push(10);
//                    stack.push(20);
//                    stack.push(30);
//
//                    // Mostrar el elemento en el tope de la pila
//                    System.out.println("Top element is: " + stack.peek());
//
//                    // Eliminar elementos de la pila
//                    System.out.println("Popped element is: " + stack.pop());
//                    System.out.println("Popped element is: " + stack.pop());
//
//                    // Mostrar el elemento en el tope de la pila después de algunas operaciones
//                    System.out.println("Top element is: " + stack.peek());
//
//                    // Verificar si la pila está vacía
//                    System.out.println("Is stack empty? " + stack.isEmpty());
//
//                    // Eliminar el último elemento de la pila
//                    System.out.println("Popped element is: " + stack.pop());
//
//                    // Verificar si la pila está vacía después de todas las operaciones
//                    System.out.println("Is stack empty? " + stack.isEmpty());
