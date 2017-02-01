package com.example.lambda;

import java.time.LocalDate;
import java.util.List;
import java.util.function.BiPredicate;

/**
 *
 * @author oracle
 */
public class BiPredicateTest {
  
  public static void main(String[] args) {
    
    List<Employee> eList = Employee.createShortList();
    Employee first = eList.get(0);
    String searchState = "KS";
    
    /*
    BiPredicate<SalesTxn,String> stateBiPred = (t, s) -> t.getState().getStr().equals(s);
    System.out.println("\n== First is CA?");
    System.out.println(
    stateBiPred.test(first, testState));
    */
    
    BiPredicate<Employee, String> eBiPred =
            (t,s) -> t.getState().equals(s); // Wrtie your BiPredicate here
      
    System.out.println("=== Print matching list");
    for(Employee e:eList){
      if (eBiPred.test(e, searchState)){// Use BiPredicate for test
        e.printSummary();
      }
    }
  }
}
