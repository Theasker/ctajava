package com.example;

public class GoodBonus {
  public double calcBonus(Employee e){
    if (e instanceof Employee){
      return e.getSalary() * 0.01;
    }else if (e instanceof Engineer){
      return e.getSalary() * 0.02;
    }else if (e instanceof Manager){
      return e.getSalary() * 0.03;
    }else if (e instanceof Director){
      return e.getSalary() * 0.05;
    }else {
      return 0;
    }
  }
}
