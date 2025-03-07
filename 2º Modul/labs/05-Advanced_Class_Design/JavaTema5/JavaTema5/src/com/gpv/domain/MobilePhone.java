/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gpv.domain;


public class MobilePhone extends ElectronicDevice{
    private boolean pinOk=false;
    
    @Override
    public void turnOn() {
        tryPin("1234");
        if(pinOk){
            state = PowerState.ON;
            System.out.println("MobilePhone turnOn " + state.getDesc());
            
        }  
        else
            turnOff();
    }

    @Override
    public void turnOff() {
         state = PowerState.OFF;
        System.out.println("MobilePhone turnOff "  + state.getDesc());
    }
    
    
    public void tryPin(String str){
        System.out.println("tryPin "  + str);
        if(str.equals("1234")){
            pinOk=true;
        }
    }
    
}
