public class Conceptos {

    public static void main (String[] args){

System.out.println("Hello World");

/*
Ejercicios de condicionales
Salario anual del usuario es mayor a 100_000 -> le damos el préstamo
Salario anual del usuario es mayor a 50_000 y su edad es menor que 30 años -> le damos la mitad
*/

        double SalaryPerYear = 10_000;
        int age = 35;
        boolean isVip = false;
        boolean hasDebts = false;


        if(SalaryPerYear >= 100_000 || isVip){
            System.out.println("Te damos el préstamo completo");
        } else if (SalaryPerYear >= 50_000 && age < 30){
            System.out.println("Te damos la mitad del préstamo");
        } else if (SalaryPerYear >= 30_000 && age < 40){
            System.out.println("Te damos un tercio del préstamo");
        }else if (!hasDebts) {
            System.out.println("Te damos un 10% del préstamo");
        }else {
            System.out.println("No te damos el préstamo");
        }

/*
Otro concepto para reducir texto
*/
      String productType = "SALUD";

      switch (productType){
          case "SALUD":
              System.out.println("El impuesto es de 5%");
              break;
          case "BELLEZA":
              System.out.println("El impuesto es de 10%");
              break;
          case "ALCOHOL":
              System.out.println("El impuesto es de 20%");
              break;
          default:
              System.out.println("El tipo de procuto es desconocido");
      }

/*
Bucles
FOR - para
WHILE - mientras
*/

        int number = 5;

        for (int i = 0; i < 3; i++){
            number += number;
            System.out.println("El resultado es :"+number);
        }

String[] names = {"ARTURO", "PEDRO", "MIGUEL"};
        for (int i =0; i < names.length; i++){
            System.out.println("Los nombres son: "+names[i]);
        }

       double carSpeed= 0.0;
        double speedLimit = 100.0;

        while (carSpeed < 100) {
            carSpeed += 12.5;
            System.out.println("The speed of the car is: " +carSpeed);
        }

/*
Funciones
*/

        String arturoInformation = buildPersonInformation("Arturo", 30);
        String miguelInformation = buildPersonInformation("Miguel", 30);
        System.out.println(arturoInformation);
        System.out.println(miguelInformation);
    }


    public static String buildPersonInformation(String personName, int personAge){
        return "Hola estoy imprimiendo la función y me llamo: "+ personName+" y tengo "+personAge+" años.";



    }
}
