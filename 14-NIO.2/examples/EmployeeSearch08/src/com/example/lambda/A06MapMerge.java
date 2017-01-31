package com.example.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


/**
 *
 * @author oracle
 */
public class A06MapMerge {
  public static void main(String[] args) {
    Map<String, String> stMap = new HashMap<>();
    String message = " (Verified C State)";
        
    stMap.put("WY", "Cheyenne");
    stMap.put("SD", "Pierre");
    stMap.put("CO", "Denver");
    stMap.put("CA", "Sacramento");
    stMap.put("DE", "Dover");

    // Stream Key's
    List<String> cList = stMap.keySet().stream()
       .filter(s -> s.startsWith("C"))
       .collect(Collectors.toList());
        
    cList.stream().forEach((e) -> {
      stMap.merge(e, message, (s,m) -> s.concat(m));
    });
               
    stMap.forEach((k,v) -> 
      System.out.println("Key: " + k + "  Value: " + v));    
  } 
}
