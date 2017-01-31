package com.example;

public class VirtualInvokeTest02 {

  public static void main(String[] args) {
    Employee e = new Manager(102, "Joan Kern", 
        "012-23-4567", 110_450.54, "Marketing");
    
    System.out.println(e.getDetails());
  }
}
