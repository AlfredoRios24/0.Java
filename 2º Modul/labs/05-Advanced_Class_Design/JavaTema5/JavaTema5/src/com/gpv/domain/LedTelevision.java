/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gpv.domain;


public final class LedTelevision extends Television{

//    @Override
//    public void turnOn() {
//        
//        System.out.println("LedTelevision turnOn");
//        super.turnOn();
//    }

    
    
    @Override
    public void turnOff() {
        state = PowerState.OFF;
        System.out.println("LedTelevision turnOff " + state.getDesc());
    }
    
}
