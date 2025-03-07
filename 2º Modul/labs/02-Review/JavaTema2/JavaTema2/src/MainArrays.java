/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author pue
 */
public class MainArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0]= "Juan";
        names[1]="Carlos";
        names[2]="Pedro";
        for(String name: names){
            System.out.println("Name: " + name);
        }
        int[] nums = {100, 1000, 2000};
        for(int num : nums){
            System.out.println(num);
        }
                
    }
    
}
