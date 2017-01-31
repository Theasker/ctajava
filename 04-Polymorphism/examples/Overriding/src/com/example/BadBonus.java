package com.example;

public class BadBonus {
  public double calcBonus(Employee e){
    return e.getSalary() * 0.01;
  }
  
  public double calcBonus(Manager m){
    return m.getSalary() * 0.03;
  }

  public double calcBonus(Engineer e){
    return e.getSalary() * 0.02;
  }

  public double calcBonus(Director d){
    return d.getSalary() * 0.05;
  }
}
