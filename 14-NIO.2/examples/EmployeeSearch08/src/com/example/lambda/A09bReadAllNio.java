package com.example.lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author oracle
 */
public class A09bReadAllNio {
    
  public static void main(String[] args) {
        
    Path file = Paths.get("tempest.txt");
    List<String> fileArr;
        
    try{       
            
      fileArr = Files.readAllLines(file);
            
      fileArr.stream()
        .filter(line -> line.contains("PROSPERO"))
        .forEach(line -> System.out.println(line));
            
    } catch (IOException e){
      System.out.println("Message: " + e.getMessage());
    }         
  }   
}
