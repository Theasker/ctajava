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
public class P03NioReadAll {
    
    public static void main(String[] args) {
        
        List<String> fileArr;
        Path file =  Paths.get("hamlet.txt");
/* Remove these comments
        try{
            // Read file into array here
            
            System.out.println("\n=== Rosencrantz ===");
            // Filter for Ros. here

            
            System.out.println("\n=== Guildenstern ===");
            // Filter for Guil. here

            

        }catch (IOException e){
          System.out.println("Error: " + e.getMessage());
        }
*/
    } 
}
