package com.example;

public class BadBonusTest {

  public static void main(String[] args) {    
    Employee e = new Employee(101, "Jim Smith", "011-12-2345", 100_000.00);
    Engineer eng = new Engineer(111, "Joe Smith", "111-12-2345", 101_000.00, "Software Developer");
    Manager m = new Manager(102, "Joan Kern", "012-23-4567", 110_450.54, "Marketing");
    Director d = new Director(103, "Abigail Adams", "112-23-4567", 
      112_450.54, "Marketing", "Government Marketing");
    BadBonus bonus = new BadBonus();
    
    System.out.println(e.getDetails());
    System.out.println("Bonus: " + bonus.calcBonus(e));
    System.out.println(eng.getDetails());
    System.out.println("Bonus: " + bonus.calcBonus(eng));
    System.out.println(m.getDetails());
    System.out.println("Bonus: " + bonus.calcBonus(m));
    System.out.println(d.getDetails());
    System.out.println("Bonus: " + bonus.calcBonus(d));

  }
}
