
import java.util.ArrayList;



public class Prueba {


    public static void main(String[] args) {
        
        ArrayList <Integer>valores = new ArrayList<Integer>(); 
        valores.add(4); 
        valores.add(5); 
        valores.set(1,6); 
        valores.remove(0); 
        for(Integer v: valores){
            System.out.println(v);
        }
     
}
        
    }
    

