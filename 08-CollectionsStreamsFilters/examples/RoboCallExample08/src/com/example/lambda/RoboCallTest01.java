package com.example.lambda;

import java.util.List;

/**
 *
 * @author MikeW
 */
public class RoboCallTest01 {
  
  public static void main(String[] args) {
    
    List<Person> pl = Person.createShortList();
    RoboCall01 robo = new RoboCall01();
    
    System.out.println("\n==== RoboCall Test 01 ====");
    System.out.println("\n=== Calling all Drivers ===");
    robo.callDrivers(pl);
    
    System.out.println("\n=== Emailing all Draftees ===");
    robo.emailDraftees(pl);
    
    System.out.println("\n=== Mail all Pilots ===");
    robo.mailPilots(pl);
    
  }

}
