/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repaso.newpackage;

import java.net.Socket;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author alfre
 */
public class asassa {
    
    interface CourseFilter extends Predicate <String>{
    @Override
    public default boolean test (String str){
    return str.equals("Java"); 
    }
    }
    
    List <String> strs = Arrays.asList("Java", "Java EE", "Java ME"); 
    predicate <String> cf1 = s -> s.length()>3;
    predicate cf2 = new CourseFilter(){
    public boolean test (String s){
    return s.contains("Java"); 
    }
    }; 
    
    long c = strs.stram().filter(cf1)
                . filter(cf2)
                .count(); 
    
    System.out.println(c); 
    
    
}
