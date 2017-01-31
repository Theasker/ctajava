package com.example.lambda;

import java.util.List;

/**
 * @author MikeW
 */
public class RoboCallTest04 {

  public static void main(String[] args) {
    
    List<Person> pl = Person.createShortList();
    RoboCall03 robo = new RoboCall03();
    
    System.out.println("\n==== Robo Test 03 ====");
    System.out.println("\n=== Calling all Drivers ===");
    robo.phoneContacts(pl, (Person p) -> p.getAge() >=16);
    
    System.out.println("\n=== Emailing all Draftees ===");
    robo.emailContacts(pl, 
        p -> p.getAge() >= 18 && p.getAge() <= 25 
                && p.getGender() == Gender.MALE);
    
    
    System.out.println("\n=== Mail all Pilots ===");
    robo.mailContacts(pl, p -> p.getAge() >= 23 && p.getAge() <= 65);
    
    System.out.println("\n=== Phone all Pilots ===");
    Pilots allPilots = new Pilots(); // Concrete class version
    robo.phoneContacts(pl, allPilots);
  }
}
