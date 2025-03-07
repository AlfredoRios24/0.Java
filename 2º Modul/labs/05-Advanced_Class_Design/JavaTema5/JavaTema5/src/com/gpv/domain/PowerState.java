
package com.gpv.domain;


public enum PowerState {
    OFF("The power id off"),
    ON("The usage power is high"),
    SUSPEND("The usage power is low");
    
    private String desc;
    private PowerState(String d){
        desc=d;
    }
    
    public String getDesc(){
        return desc;
    }
}
