package com.example.lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author oracle
 */
public class A09aReadNio {
    
  public static void main(String[] args) {
        
    try(Stream<String> lines = 
        Files.lines(Paths.get("tempest.txt"))){       
      
      lines.forEach(line -> 
        System.out.println("Line: " + line));
      
    } catch (IOException e){
      System.out.println("Error: " + e.getMessage());
    }          
  }   
}