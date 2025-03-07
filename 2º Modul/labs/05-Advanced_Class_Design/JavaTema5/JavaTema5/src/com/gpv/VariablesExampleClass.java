
package com.gpv;


public class VariablesExampleClass {
    private final  int field ;
    public static final int JAVA_CONSTANT = 10;    
    
    public VariablesExampleClass(){
        this.field=100;
        changeValues(100);
    }
    public void changeValues(final int param){
        //param=1010;
        final int localVar;
        localVar = 10;
        //localVar = 100;
    }
    
}
