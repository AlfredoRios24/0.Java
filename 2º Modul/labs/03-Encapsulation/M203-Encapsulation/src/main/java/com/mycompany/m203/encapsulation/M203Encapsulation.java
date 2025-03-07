package com.mycompany.m203.encapsulation;





public class M203Encapsulation {

    public static void main(String[] args) {
        System.out.println("Encapsulation");
        
        /*
        tipos de clases i/o metodos:
        public: se puede acceder des de cualquier servidor. 
        private: solo se puede acceder des de la misma clase. Se puede invocar a través de un setter o getter. 
            private final: solo se modificara 1 vez el valor y no se podra modificar des de una invocacion u otra clase. 
        protected:solo se puede acceder des de la misma clase super y sub. 
        
        default: solo visible en la misma clase y paquete. 
        */
      
        
        /*
        Ejemplo de sobrecarga: es utilizar un mismo nombre para diferentes metodos, en este caso: print
        */
        
        double i = 10; 
        print (i); 
                     
        
    }
    
    public static void print (int i){
        System.out.println("print int: " +i );
            }
    
     public static void print (double i){
        System.out.println("print double: " +i );
            }
    
     /*
    System.out.println( this. getClass().getSimpleName() ); 
     Muestra las clases y subclases creadas en el proyecto. 
  
     */
     
    
}
