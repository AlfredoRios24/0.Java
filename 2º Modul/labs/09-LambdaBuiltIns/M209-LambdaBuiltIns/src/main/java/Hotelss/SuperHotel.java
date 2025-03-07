/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotelss;

/**
 *
 * @author alfre
 */
public class SuperHotel extends Hotel {
    public void resvar (){
    reservas--; 
    
    }
    public void reservar(int size){
    reservar(); 
    super.reservar();
    reservas += size; 
    }
}
//    
//    public static void main(String[]args){
//    SuperHotel hotel = new SuperHotel();
//    hotel.reservar(2);
//        System.out.println(hotel.reservas);
//    }
//    
//    
//    
//}
