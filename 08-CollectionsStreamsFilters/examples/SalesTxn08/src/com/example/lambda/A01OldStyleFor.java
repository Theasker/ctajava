package com.example.lambda;

import java.util.List;

/**
 *
 * @author oracle
 */
public class A01OldStyleFor {

    public static void main(String[] args) {
        
        List<SalesTxn> tList = SalesTxn.createTxnList();
        
        System.out.println("\n=== Print List with for ===");
        for(SalesTxn t:tList){
            t.printSummary();
        }        
    }
}