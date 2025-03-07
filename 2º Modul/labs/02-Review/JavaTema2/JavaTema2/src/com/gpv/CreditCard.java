
package com.gpv;

import java.time.LocalDate;


public class CreditCard {
    public final static int VISA = 50001;
    
    public String accountName;
    public String cardNumber;
    public LocalDate expDate;
    
    
    public double getCharges(){
        return 0.0;
    }
    public void disputeCharge(String chargeId, float amount){
        
    }
}
