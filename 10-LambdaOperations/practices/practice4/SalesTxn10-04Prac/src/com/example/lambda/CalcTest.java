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
        // Replace with stream
        double t1 = 0;
        
        System.out.printf("Radio Hut Total: $%,9.2f%n", t1);
        
        // Replace with Stream
        double t2 = 0;
        
        System.out.printf("PriceCo Total: $%,9.2f%n", t2);
        // Replace with stream
        double t3 = 0;
        
        System.out.printf("Best Deals Total: $%,9.2f%n", t3);
        
        // Print out Average Unit Count
        System.out.println("=== Average Unit Count ===");
        // Replace with Stream
        OptionalDouble a1 = OptionalDouble.of(0);
        
        if (a1.isPresent()){
            System.out.printf("Widget Pro Avg: %,9.0f%n", a1.getAsDouble());
        }
        
        // Replace with stream
        OptionalDouble a2 = OptionalDouble.of(0);
        
        if (a2.isPresent()){
            System.out.printf("Widget Avg: %,9.0f%n", a2.getAsDouble());        
        }
                 
        
    }
}
