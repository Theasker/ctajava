package com.example.lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author oracle
 */
public class A13FlatMap {
    
  public static void main(String[] args) {        
            
    try(Stream<String> lines = 
        Files.lines(Paths.get("tempest.txt"))){       
            
      long matches = lines
        .flatMap(line -> Stream.of(line.split(" ")))
        .filter(word -> word.contains("my"))
        .peek(s -> System.out.println("Match: " + s))
        .count();
            
      System.out.println("# of Matches: " + matches);                   
    } catch (IOException e){
      System.out.println("Message: " + e.getMessage());
    }
  }
}
