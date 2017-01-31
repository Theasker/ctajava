package com.example.lambda;

import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author MikeW
 */
public class RoboCall03 {

  public void phoneContacts(List<Person> pl, Predicate<Person> aTest){
    for(Person p:pl){
      if (aTest.test(p)){
        roboCall(p);
      }
    }
  }

  public void emailContacts(List<Person> pl, Predicate<Person> aTest){
    for(Person p:pl){
      if (aTest.test(p)){
        roboEmail(p);
      }
    }
  }

  public void mailContacts(List<Person> pl, Predicate<Person> aTest){
    for(Person p:pl){
      if (aTest.test(p)){
        roboMail(p);
      }
    }
  }  
  
  public void roboCall(Person p){
    System.out.println("Calling " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge() + " at " + p.getPhone());
  }
  
  public void roboEmail(Person p){
    System.out.println("EMailing " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge() + " at " + p.getEmail());
  }
  
  public void roboMail(Person p){
    System.out.println("Mailing " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge() + " at " + p.getAddress() + ", " + p.getCity() + ", " + p.getState() + " " + p.getCode());
  }
  
}
