package com.example.lambda;

import java.util.List;
import java.util.OptionalDouble;

/**
 *
 * @author oracle
 */
public class CalcTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        
        // Print out Transaction Totals
        System.out.println("=== Transactions Totals ===");
        double t1 = 0; // Radio Hut code here
        
        System.out.printf("Radio Hut Total: $%,9.2f%n", t1);
        
        double t2 = 0; //PriceCo Code Here
        
        System.out.printf("PriceCo Total: $%,9.2f%n", t2);
        
        double t3 = 0; // Best Deals Code here
        
        System.out.printf("Best Deals Total: $%,9.2f%n", t3);                 
        
    }
}
