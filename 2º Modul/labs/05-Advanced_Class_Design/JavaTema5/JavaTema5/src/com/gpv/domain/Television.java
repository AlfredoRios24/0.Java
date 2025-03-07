
package com.gpv.domain;


public abstract class Television extends ElectronicDevice{
    private int channel;

    @Override
    public final void turnOn() {
        initializeScreen();
        changeChannel(1);
        state = PowerState.ON;
        System.out.println("Television turnOn " + state.getDesc());
    }
    
    
    
    public void changeChannel(final int channel){
       final int valor;
       
        this.channel = channel;
        System.out.println("changeChannel:  " + this.channel);
    }
    public void initializeScreen(){
        System.out.println("initializeScreen");
    }
}

