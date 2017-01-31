package com.example.lambda;

import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author oracle
 */
public class RadioHutTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        Consumer<SalesTxn> radioReport = 
          t -> System.out.printf("ID: " + t.getTxnId() + "  Seller: " + t.getSalesPerson() 
          + "-- Buyer: " + t.getBuyerName() + " -- State: " 
          + t.getState() + " -- Amt: $%,9.0f%n", t.getTransactionTotal());
        
        // Print out Radio Hut Transactions
        System.out.println("=== Radio Hut Transactions ===");

        
        // Print out the total number of transactions
        System.out.print("Total Transactions: ");

        
        
        // Print largest transaction
        System.out.println("=== Radio Hut Largest ===");

        
        
        // Print smallest transaction
        System.out.println("=== Radio Hut Smallest ===");

        
        
        
    }
}
