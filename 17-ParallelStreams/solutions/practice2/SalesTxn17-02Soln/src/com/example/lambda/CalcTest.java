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
        double t1 = tList.parallelStream()
            .filter(t -> t.getBuyerName().equals("Radio Hut"))
            .mapToDouble( t -> t.getTransactionTotal())
            .sum();
        
        System.out.printf("Radio Hut Total: $%,9.2f%n", t1);
        
        double t2 = tList.stream()
            .filter(t -> t.getBuyerName().equals("PriceCo"))
            .mapToDouble( t -> t.getTransactionTotal())
            .parallel()
            .sum();
        
        System.out.printf("PriceCo Total: $%,9.2f%n", t2);
        
        double t3 = tList.stream()
            .filter(t -> t.getBuyerName().equals("Best Deals"))
            .mapToDouble( t -> t.getTransactionTotal())
            .sequential()
            .sum();
        
        System.out.printf("Best Deals Total: $%,9.2f%n", t3);                 
        
    }
}
