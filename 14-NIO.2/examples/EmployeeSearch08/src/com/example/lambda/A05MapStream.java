package com.example.lambda;

import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author oracle
 */
public class A05MapStream {
   
    public static void main(String[] args) {
        
        Map<String, String> stMap = new HashMap<>();
        
        stMap.put("WY", "Cheyenne");
        stMap.put("SD", "Pierre");
        stMap.put("CO", "Denver");
        stMap.put("CA", "Sacramento");
        stMap.put("DE", "Dover");

        // Stream Key's
        stMap.keySet().stream()
            .filter(s -> s.startsWith("C"))
            .forEach(s -> System.out.println("State:  " + s));
        
        // Stream Values
        stMap.values().stream()
            .filter(s -> s.startsWith("D"))
            .forEach(s -> System.out.println("City: " + s));
    }
    
}
