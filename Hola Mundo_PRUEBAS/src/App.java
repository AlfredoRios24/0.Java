import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola Mundo");

// Comentario de una linea

/*
Comentario
en
varias
lineas
*/

System.out.println("Otro texto");

String myString = "Esto e suna cadena de texto";
myString = "Aqui cambio el valor de a cadena de texto";
System.out.println(myString);

Integer myInt = 7;
myInt = myInt + 5;
System.out.println(myInt);
System.out.println(myInt-1);

Double myDouble = 6.5;
System.out.println(myDouble);

Float myFloat = 6.5f;
System.out.println(myFloat);

System.out.println(myFloat + " " + myString + myDouble + " " + myInt + myString);

Boolean myBoolean;
myBoolean = false;
System.out.println(myBoolean);

myFloat = null;
if (myFloat != null) {
System.out.println(myFloat + 10);
System.out.println("My Float es distinto de nulo");
} else {
System.out.println("My Float es nulo");
}




List myList = new ArrayList();
myList.add(myString);
myList.add(myInt.toString());
System.out.println(myList);

Map<String, String> myMap = new HashMap();
myMap.put("strng", myString);
myMap.put("int", myInt.toString());
System.out.println(myMap);
System.out.println(myMap.get("int"));

for (int index = 0; index < myList.size(); index++) {
    System.out.println(myList.get(index));
}


    }

}









