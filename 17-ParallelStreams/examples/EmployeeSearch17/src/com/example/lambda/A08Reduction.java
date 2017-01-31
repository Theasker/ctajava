package com.example.lambda;

import java.util.stream.IntStream;

/**
 *
 * @author oracle
 */
public class A08Reduction {
    
    public static void main(String[] args) {
        
        int r1 = IntStream.rangeClosed(1, 5).parallel()
            .reduce(0, (a, b) -> a + b);
        
        System.out.println("Result: " + r1);
        
        int r2 = IntStream.rangeClosed(1, 5).parallel()
            .reduce(0, (sum, element) -> sum + element);
        
        System.out.println("Result: " + r2);
        
    }
    
}
