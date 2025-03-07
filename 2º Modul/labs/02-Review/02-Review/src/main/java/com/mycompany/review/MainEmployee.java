/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.review;

import com.mycompany.review.newpackage.Employee;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author alfre
 */
public class MainEmployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar c; //importar metodos.java lang
        Date d; 
        
        
       Employee emp1 = new Employee(); // importar clases y metodos creados en otros paquetes
        emp1.display();
        
        
    }
    
}
