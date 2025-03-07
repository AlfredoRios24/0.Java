/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repaso.newpackage;

/**
 *
 * @author alfre
 */
public class Shape{
    
   Shape(){System.out.println("Shape");}
   protected void area(){System.out.println("Shape");}
      
    
}

class Square extends Shape{
int side;
Square(int side){
/*insert code here*/ super();
    this.side=side; 
}
public void area(){System.out.println("Square");}
}


class Rectangle extends Square {
int len, br; 
Rectangle (int x, int y){
/*insert code here*/ super(x);
    len = x; br =y; 
}

public void area(){System.out.println("Rectanble");}


}


