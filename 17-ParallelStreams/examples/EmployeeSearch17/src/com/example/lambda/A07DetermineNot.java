package com.example.lambda;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author oracle
 */
public class A07DetermineNot {
    
    public static void main(String[] args) {
        
        List<Employee> eList = Employee.createShortList();
        
        Optional<Employee> e1 = eList.stream()
            .filter(e -> e.getRole().equals(Role.EXECUTIVE))
            .sequential().findAny();
        
        Optional<Employee> e2 = eList.stream()
            .filter(e -> e.getRole().equals(Role.EXECUTIVE))
            .parallel().findAny();
        
        System.out.println("The same: " + 
            e1.get().getEmail().equals(e2.get().getEmail()));
        
    }
}
