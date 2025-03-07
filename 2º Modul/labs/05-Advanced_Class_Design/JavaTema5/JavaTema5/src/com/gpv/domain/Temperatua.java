/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.gpv.domain;

/**
 *
 * @author pue
 */
public enum Temperatua {
    FRIO(-10, 15),
    CALOR(16, 28),
    MUCHOCALOR(29 , 41);
    
    private int gradosMin;
    private int gradosMax;
    private Temperatua( int min , int max){
        gradosMin=min;
        gradosMax =max;
    }   

    public int getGradosMin() {
        return gradosMin;
    }

    public int getGradosMax() {
        return gradosMax;
    }

    
}
