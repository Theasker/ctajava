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
    
    BiPredicate<Employee, String> eBiPred; // Wrtie your BiPredicate here
      
    System.out.println("=== Print matching list");
    for(Employee e:eList){
      if (true){// Use BiPredicate for test
        e.printSummary();
      }
    }
  }
}
