
package com.mycompany.m206.interfaces;

import com.mycompany.m206.interfaces.newpackage.CrushedRock;
import com.mycompany.m206.interfaces.newpackage.ItemReport;
import com.mycompany.m206.interfaces.newpackage.RedPaint;
import com.mycompany.m206.interfaces.newpackage.SalesCalc;
import static com.mycompany.m206.interfaces.newpackage.SalesCalc.reportTitle;
import com.mycompany.m206.interfaces.newpackage.Widget;


public class MainSalesCalc {


    public static void main(String[] args) {
        
        
        CrushedRock cr = new CrushedRock ("Class 1 Crushed Rock", 500.00, 200.0 , 250.00); 
        SalesCalc sc = new CrushedRock ("Class 2 Crushed Rock", 1000.00, 400.0 , 25.00); 
        SalesCalc rp = new RedPaint (25.00, 60.0 , 25.00); 
        SalesCalc wi = new Widget ("Guantes", 20, 10, 1); 
        
        
         ItemReport report  = new ItemReport(); 
         
         SalesCalc[] itemList = new SalesCalc[5]; 
         itemList[0]= cr; 
         itemList[1]= sc; 
         itemList[2]= rp; 
         itemList[3]= wi; 
         itemList[4]= new Widget ("otro ", 10, 3, 3); 
         
         
         System.out.println(reportTitle);
         for (SalesCalc item: itemList){
            report.printItemData(item); 
                    }
         
   
          
         
// printSalesCalc(cr); 
// printSalesCalc(sc); 
// printSalesCalc(rp); 
// printSalesCalc(wi); 

        
        
        
  
        
    }
    

    
}
