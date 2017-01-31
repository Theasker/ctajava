package com.example.lambda;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Supplier;

/**
 *
 * @author oracle
 */
public class SupplierTest {
  
  public static void main(String[] args) {
    
    List<Employee> eList = Employee.createShortList();
    Employee first = eList.get(0);
    
    Supplier<Employee> eSupp; // Write your Supplier lambda here
      
    System.out.println("=== Print employee list before");
    eList.stream().forEach(Employee::printSummary);
    
    // Add new employee here
    
    System.out.println("\n=== Print employee list after");
    eList.stream().forEach(Employee::printSummary);
    
        
  }
}
