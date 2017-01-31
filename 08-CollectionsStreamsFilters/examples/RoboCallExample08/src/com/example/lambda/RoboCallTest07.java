package com.example.lambda;

import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author MikeW
 */
public class RoboCallTest07 {
  
  public static void main(String[] args){ 

    List<Person> pl = Person.createShortList();
    RoboCall05 robo = new RoboCall05();    
    
    System.out.println("\n=== Calling all Drivers Lambda ===");
    pl.stream()
        .filter(p -> p.getAge() >= 23 && p.getAge() <= 65)
        .forEach(p -> robo.roboCall(p));
    
  }
}
