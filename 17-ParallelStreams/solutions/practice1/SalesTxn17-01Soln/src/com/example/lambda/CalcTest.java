package com.example.lambda;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 *
 * @author oracle
 */
public class CalcTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        
        // Print out Transaction Totals
        System.out.println("=== Transactions Totals ===");
        
        Stream<SalesTxn> s1 = tList.stream();
        Stream<SalesTxn> s2 = s1.filter(
            t -> t.getBuyerName().equals("Radio Hut"));
        DoubleStream s3 = s2.mapToDouble(
            t -> t.getTransactionTotal());
        double t1 = s3.sum();
        
        System.out.printf("Radio Hut Total: $%,9.2f%n", t1);
        
    }
}
