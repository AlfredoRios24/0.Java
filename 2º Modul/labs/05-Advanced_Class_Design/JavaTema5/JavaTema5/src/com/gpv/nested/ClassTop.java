/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gpv.nested;

import com.gpv.domain.ElectronicDevice;


public class ClassTop {
    private static int valorStatic = 10;
    private int valorInstance = 10;       
    
    
     ElectronicDevice ed1 = new ElectronicDevice() {
            @Override
            public void turnOn() {
                System.out.println("Turn On " + valorInstance);
            }

            @Override
            public void turnOff() {
                System.out.println("Turn Off " + valorInstance);
             }
        };
     
    public void metodo(){
        NestedStatic ns = new NestedStatic();
        InnerMember im = new InnerMember();
        
    }
    public void metodoAnonymous(){
        ElectronicDevice ed = new ElectronicDevice() {
            @Override
            public void turnOn() {
                System.out.println("Turn On " + valorInstance);
            }

            @Override
            public void turnOff() {
                System.out.println("Turn Off " + valorInstance);
             }
        };
        ed.turnOff();
    }
    public void metodoLocalClass(){
        class Helper{
            private int i;
            public Helper(int i){
                this.i=i;
            }
            public int get(){
                return i * 234+ valorInstance;
            }
        }
        Helper h1 = new Helper(10);
        Helper h2 = new Helper(10);
        System.out.println("h1 " + h1.get());
    }
    
    public class InnerMember{
      //   private int valorInstance = 11;
        public void metodo(){
             System.out.println("InnerMember " + valorInstance);
//            System.out.println("InnerMember " + this.valorInstance);
//            System.out.println("InnerMember " + ClassTop.this.valorInstance);
        }               
    }
    public static class NestedStatic{
        public void metodo(){
            ClassTop.valorStatic = 10;
            System.out.println("NestedStatic " + valorStatic);
        }
    }
}
class ClassTopDefault {
    
}
