/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author alfre
 */
public enum Branch {
    
    LA("Basic"), BOSTON("Loan"), BANGALORE("Full"), MUMBAI("Full");

    String serviceLevel;
    private Branch branch;
    private Branch(String serviceLevel){ 
        this.serviceLevel = serviceLevel;
        }
    
    
    public String getServiceLevel(){ 
        return serviceLevel;
        }


public Branch getBranch() { return branch;
}

public void setBranch(Branch branch) { this.branch = branch;
}


        
    
}
