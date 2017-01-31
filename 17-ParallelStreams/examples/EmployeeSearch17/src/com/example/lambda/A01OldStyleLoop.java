package com.example.lambda;

import java.util.List;

/**
 *
 * @author oracle
 */
public class A01OldStyleLoop {

    public static void main(String[] args) {
        
        List<Employee> eList = Employee.createShortList();
        
        double sum = 0;
        
        for(Employee e:eList){
            if(e.getState().equals("CO") && 
                e.getRole().equals(Role.EXECUTIVE)){
                e.printSummary();
                sum += e.getSalary();
            }
        }
        
        System.out.printf("Total CO Executive Pay: $%,9.2f %n", sum);               
    }
    
}
