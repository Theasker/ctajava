package com.example.lambda;

import java.util.List;

/**
 *
 * @author MikeW
 */
public class RoboCallTest02 {
  
  public static void main(String[] args) {
    
    List<Person> pl = Person.createShortList();
    RoboCall02 robo = new RoboCall02();
    
    System.out.println("\n==== Robo Test 02 ====");
    System.out.println("\n=== Calling all Drivers ===");
    robo.callDrivers(pl);
    
    System.out.println("\n=== Emailing all Draftees ===");
    robo.emailDraftees(pl);
    
    System.out.println("\n=== Mail all Pilots ===");
    robo.mailPilots(pl);
    
  }

}
