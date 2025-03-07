/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hotelss;

/**
 *
 * @author alfre
 */
public class MainHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

          SuperHotel hotel = new SuperHotel();
    hotel.reservar(2);
        System.out.println(hotel.reservas);
        
        
        
    }
    
}
