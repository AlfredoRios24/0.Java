
package com.example.domain;

public class Director extends Manager{
    
    private double budget; 
    
    public Director(int empId, String name, String ssn, double salary) {
        super(empId, name, ssn, salary);
        this.budget = budget; 
    }

    /**
     * @return the budget
     */
    public double getBudget() {
        return budget;
    }

    /**
     * @param budget the budget to set
     */
    public void setBudget(double budget) {
        this.budget = budget;
    }
    
}
