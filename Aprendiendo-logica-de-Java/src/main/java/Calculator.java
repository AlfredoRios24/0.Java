import java.util.Scanner;

public class Calculator {

    /*
    Estructura de control en funciones,
    El ejercicio se basa en hacer una calculadora
     */

    public static void main (String[] args){

        // PASOS DE LA FUNCION
        Scanner sc= new Scanner(System.in);

        System.out.println("Introduce el primer número");
       double firstNumber = sc.nextDouble();

        System.out.println("Introduce el segundo número");
        double secondNumber = sc.nextDouble();

        System.out.println("Introduzca la operación");
        String operation = sc.next();

        // resultado
     double result = doCalculation(firstNumber, secondNumber, operation);

     System.out.println("El resultado de la operación "+operation+" es: "+result);

    }
// LAS VALIDACIONES
    private static double doCalculation(double firstNumber, double secondNumber, String operation){
        switch (operation) {
            case "+":
                return sum(firstNumber, secondNumber);
            case "-":
                return minus(firstNumber, secondNumber);
            case "*":
                return multiply(firstNumber, secondNumber);
            default:
                throw new IllegalArgumentException("Operacion desconocida");
                      }

    }
// LA DEFINICION DE LAS OPERACIONES
    private static double sum(double firstNumber, double secondNumber){
        return firstNumber + secondNumber;
            }

    private static double minus(double firstNumber, double secondNumber){
        return firstNumber - secondNumber;
            }
    private static double multiply(double firstNumber, double secondNumber){
        return firstNumber * secondNumber;
    }

}
