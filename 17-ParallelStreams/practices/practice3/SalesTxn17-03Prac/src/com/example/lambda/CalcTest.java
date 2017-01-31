package com.example.lambda;

import java.util.List;

/**
 *
 * @author oracle
 */
public class CalcTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        
        // Print out Transaction Totals
        System.out.println("=== Transactions Totals ===");
       
        double t2 = 0; //  PriceCo code here
        
        System.out.printf("%nPriceCo Total: $%,9.2f%n", t2);

        int c2 = 0; // PriceCo count code here
        
        System.out.printf("PriceCo Transactions: %,6d%n", c2);
        
    }
}
