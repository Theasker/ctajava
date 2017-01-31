package com.example.lambda;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author MikeW
 */
public class RoboCallTest03 {

  public static void main(String[] args) {
    
    List<Person> pl = Person.createShortList();
    RoboCall03 robo = new RoboCall03();
    
    System.out.println("\n==== Robo Test 03 ====");
    System.out.println("\n=== Calling all Drivers ===");
    robo.phoneContacts(pl, 
        new Predicate<Person>(){
          @Override
          public boolean test(Person p){
            return p.getAge() >=16;
          }
        }
    );
    
    System.out.println("\n=== Emailing all Draftees ===");
    robo.emailContacts(pl, 
        new Predicate<Person>(){
          @Override
          public boolean test(Person p){
            return p.getAge() >= 18 && p.getAge() <= 25 && p.getGender() == Gender.MALE;
          }
        }
    );
    
    
    System.out.println("\n=== Mail all Pilots ===");
    robo.mailContacts(pl, 
        new Predicate<Person>(){
          @Override
          public boolean test(Person p){
            return p.getAge() >= 23 && p.getAge() <= 65;
          }
        }
    );
    
    
  }
}
