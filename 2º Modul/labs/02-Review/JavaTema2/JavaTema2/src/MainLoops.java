/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author pue
 */
public class MainLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("While");
        int i=10;
        while(i<20){
            System.out.print(" " +  i);
            i++;
        }
        System.out.println("Do While");
         i=20;
        do{
            System.out.print(" " +  i);
            i++;
        }while(i<20);
        System.out.println("");
        System.out.println("For:");
        int idx =0;
        for( ; idx < 9; idx++){
            System.out.print(" " +  idx);
        }
        System.out.println("");
    }
    
}
