/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.gpv;

import com.gpv.domain.ElectronicDevice;
import com.gpv.domain.LedTelevision;
import com.gpv.domain.MobilePhone;
import com.gpv.domain.PowerState;
import com.gpv.domain.Television;

/**
 *
 * @author pue
 */
public class MainDevices {

    public static void main(String[] args) {
//        ElectronicDevice dev1 = new ElectronicDevice();
//        dev1.turnOn();
        ElectronicDevice dev = Math.random()>0.5 ? new MobilePhone() : new LedTelevision();
        
        PowerState ps = PowerState.valueOf("ON");
        String strPs = ps.name();
        System.out.println("StrPs " + strPs);
                
        dev.changePowerState(ps);
        
        dev.changePowerState(PowerState.OFF);
//        dev.turnOn();
//        
//        dev.turnOff();
    }
    
}
