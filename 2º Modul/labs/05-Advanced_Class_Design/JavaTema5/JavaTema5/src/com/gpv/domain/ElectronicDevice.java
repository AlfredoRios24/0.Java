
package com.gpv.domain;


public abstract class ElectronicDevice {
    protected PowerState state = PowerState.OFF;
    
    public void changePowerState(PowerState newState){
        switch(newState){
            case ON:
                turnOn();
                break;
            case OFF:
                turnOff();
                break;
        }
    }
    public abstract void turnOn();
//    {
//        System.out.println("ElectronicDevice turnOn");
//    }
    public abstract void turnOff();
//            {
//        System.out.println("ElectronicDevice turnOff");
//    }
}
