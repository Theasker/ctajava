package com.example.lambda;

import java.util.List;

/**
 *
 * @author oracle
 */
public class A05OldStyleSumLoop {

    public static void main(String[] args) {
        
        // Currently not using this example in the presentation
        
        List<SalesTxn> tList = SalesTxn.createTxnList();
        
        double sum = 0;
        
        for(SalesTxn t:tList){    
          if(t.getState().equals(State.CA) && 
                t.getBuyerName().equals("Acme Electronics")){
              t.printSummary();
              sum += t.getTransactionTotal();
          }
        }
        
        System.out.println("Total Sales: " + sum);               
    }
    
}
