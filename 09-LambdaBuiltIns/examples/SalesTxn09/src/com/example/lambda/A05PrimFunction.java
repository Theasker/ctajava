package com.example.lambda;

import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

/**
 *
 * @author MikeW
 */
public class A05PrimFunction {
  
  public static void main(String[] args){ 

    List<SalesTxn> tList = SalesTxn.createTxnList();
    SalesTxn first = tList.get(0);
           
    ToDoubleFunction<SalesTxn> discountFunction = 
        t -> t.getTransactionTotal() 
            * t.getDiscountRate();
    
    System.out.println("\n== Discount");
    System.out.println(
        discountFunction.applyAsDouble(first));

    // What's wrong here?
    Function<SalesTxn, Double> taxFunction = 
        t -> t.getTransactionTotal() * t.getTaxRate();
    double tax = taxFunction.apply(first); // What happerns here?    
  }
}
