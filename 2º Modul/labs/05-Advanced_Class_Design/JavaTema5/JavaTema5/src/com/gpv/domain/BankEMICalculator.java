
package com.gpv.domain;


public class BankEMICalculator {
    private String customerName;
    private String accountNo;
    private double loanAmount;
    private double monthlyPayment;
    private EMICalculatorHelper helper = new EMICalculatorHelper();
    
    public BankEMICalculator(String customerName, String accountNo, double loanAmount) {
        this.customerName = customerName;
        this.accountNo = accountNo;
        this.loanAmount = loanAmount;
        this.monthlyPayment = helper.calcMonthlyPayment();
    }
    
    public void display(){
        System.out.println("customerName " + customerName);
        System.out.println("accountNo " + accountNo);
        System.out.println("loanAmount " + loanAmount);
        System.out.println("monthlyPayment " + monthlyPayment);
        
    }
    
    private class EMICalculatorHelper{
         private int loanTerm = 60;
         private double interestRate = 0.9;
         private double interestRatePerMonth = interestRate / loanTerm;
         
         protected double calcMonthlyPayment(){
             double EMI = (loanAmount * interestRatePerMonth) / ( (1.0) - ((1.0) /
                     Math.pow(1.0 + interestRatePerMonth, loanTerm)));
             return Math.round(EMI);
         }        
    }
}
