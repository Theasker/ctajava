package com.example.lambda;

import java.util.List;


/**
 *
 * @author oracle
 */
public class A06Determine {
    
    public static void main(String[] args) {
        
        List<Employee> eList = Employee.createShortList();
        
        double r1 = eList.stream()
            .filter(e -> e.getState().equals("CO"))
            .mapToDouble(Employee::getSalary)
            .sequential().sum();
        
        double r2 = eList.stream()
            .filter(e -> e.getState().equals("CO"))
            .mapToDouble(Employee::getSalary)
            .parallel().sum();
        
        System.out.println("The same: " + (r1 == r2));
    }
}
