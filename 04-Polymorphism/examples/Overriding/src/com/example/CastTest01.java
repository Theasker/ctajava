package com.example;

public class CastTest01 {
  public static void main(String[] args) {
    Employee e = new Manager(102, "Joan Kern", 
        "012-23-4567", 110_450.54, "Marketing");
    
    if (e instanceof Manager){
      Manager m = (Manager) e;
      m.setDeptName("HR");
      System.out.println(m.getDetails());
    }
  }
}
