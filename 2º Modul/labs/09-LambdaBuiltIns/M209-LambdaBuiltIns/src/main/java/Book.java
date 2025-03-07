/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alfre
 */
public class Book {
    int id;
    String name;
    public Book(int id, String name){
    this.id = id;
    this.name = name;
    }
    
    public boolean equals(Object obj){//line 1
        boolean output = false;
        Book b = (Book) obj;
        if (this.name.equals(b.name)){
        output = true;
        }
        return output; 
        
        
    }}
    
    
    

