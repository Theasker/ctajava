package com.example.lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author oracle
 */
public class A08BufferedRead {
  public static void main(String[] args) {
    try(BufferedReader bReader = 
      new BufferedReader(new FileReader("tempest.txt"))){
            
      bReader.lines()
        .forEach(line -> 
            System.out.println("Line: " + line));
            
    } catch (IOException e){
        System.out.println("Message: " + e.getMessage());
    }          
  }    
}
