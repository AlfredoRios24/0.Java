/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.gpv;

import com.gpv.nested.ClassTop;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author pue
 */
public class MainNestedStatic {

    
    public static void main(String[] args) {
        ClassTop.NestedStatic nStatic = new ClassTop.NestedStatic();
        nStatic.metodo();
        System.out.println(nStatic.getClass().getName());
        String[] array = {"uno","dos"};
        List<String> lst = Arrays.asList(array);
        System.out.println(lst.getClass().getName());
        System.out.println("Inner Member");  
        
        ClassTop ct = new ClassTop();
        ClassTop.InnerMember im = ct.new InnerMember();
        im.metodo();
        ClassTop.InnerMember im1 = ct.new InnerMember();
        im1.metodo();
        System.out.println("++++++");
        ct.metodoLocalClass();
    }
    
}
