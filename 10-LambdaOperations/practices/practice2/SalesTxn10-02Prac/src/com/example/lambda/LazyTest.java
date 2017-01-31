package com.example.lambda;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

/**
 *
 * @author oracle
 */
public class LazyTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        Consumer<SalesTxn> quantReport = 
          t -> System.out.printf("Seller: " 
            + t.getSalesPerson() + "-- Buyer: " + t.getBuyerName()
            + " -- Quantity: %,9.0f%n", t.getUnitCount());
        Consumer<SalesTxn> streamStart =
          t -> System.out.println("Stream start: " + t.getSalesPerson()
                + " ID: " + t.getTxnId());
        Consumer<SalesTxn> stateSearch = 
          t -> System.out.println("State Search: " + t.getSalesPerson()
                + " St: " + t.getState());
        Consumer<SalesTxn> productSearch = 
          t -> System.out.println("Product Search");
        
        
        
        // Print out list normally
        System.out.println("=== Widget Pro Quantity in CO ===");

        
        
        // Print out all the steps in the list
        System.out.println("\n=== Widget Pro Quantity in CO ===");

            
        
        // Update code to handle return value of a findFirst
        System.out.println("\n=== Widget Pro Quantity in CO (FindFirst)===");

        
        
        
    }
}
