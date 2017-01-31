package com.example.lambda;

import java.util.List;

/**
 *
 * @author oracle
 */
public class A02NewStyleLoop {

    public static void main(String[] args) {
        
        List<Employee> eList = Employee.createShortList();
        
        double result = eList.stream()
            .filter(e -> e.getState().equals("CO"))
            .filter(e -> e.getRole().equals(Role.EXECUTIVE))
            .peek(e -> e.printSummary())
            .mapToDouble(e -> e.getSalary())
            .sum();
        
        System.out.printf("Total CO Executive Pay: $%,9.2f %n", result);               
    }
    
}
