/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.m209.lambdabuiltins;


import java.util.function.Predicate;
import java.util.function.Function;
import java.util.Arrays;
import java.util.List;


public class M209LambdaBuiltIns {

    
       public static Predicate<String> isNotEmpty() {
        return s -> s != null && !s.isEmpty();
    }

    public static Function<String, Integer> stringLength() {
        return String::length;
    }
    
    
    public static void main(String[] args) {
       
          List<String> names = Arrays.asList("Anna", "", "Bob", "Charlie", null);
        
        names.stream()
             .filter(M209LambdaBuiltIns.isNotEmpty())
             .map(M209LambdaBuiltIns.stringLength())
             .forEach(System.out::println);
    }
        
        
        
        
        
    }

