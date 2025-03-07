/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m205_advanced_class_design;

/**
 *
 * @author alfre
 */
public class Television extends ElectronicDevice{
    
    @Override
    public void turnOn(){
   changeChannel(1); initializeScreen();
        }

    @Override
  public void turnOff(){   
      System.out.println("Television ");
            }

    private void initializeScreen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void changeChannel(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
