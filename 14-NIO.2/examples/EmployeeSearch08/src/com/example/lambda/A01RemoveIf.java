package com.example.lambda;

import java.util.ArrayList;

/**
 *
 * @author oracle
 */
public class A01RemoveIf {
  public static void main(String[] args) {
    ArrayList<Employee> eList = 
        (ArrayList) Employee.createShortList();
        
    System.out.println("=== Starting List ===");
    eList.forEach(Employee::printSummary);
        
    eList.removeIf(e -> e.getState().equals("KS"));
        
    System.out.println("=== Ending List ===");
    eList.forEach(Employee::printSummary);
        
  }
}
