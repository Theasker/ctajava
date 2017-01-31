package com.example.lambda;

import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author oracle
 */
public class ConsumerTest {
  
  public static void main(String[] args) {
    
    List<Employee> eList = Employee.createShortList();
    Employee first = eList.get(0);
    
    Consumer<Employee> eCons; // Write your consumer lambda here
    
    System.out.println("=== First Salary");
    // Call your consumer here
    
  }
}
