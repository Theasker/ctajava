package com.example.lambda;

import java.util.function.DoubleFunction;

public class A06DoubleFunction {

  public static void main(String[] args) {
        
    A06DoubleFunction test = new A06DoubleFunction();
        
    DoubleFunction<String> calc = 
          t -> String.valueOf(t * 3);
        
    String result = calc.apply(20);
    System.out.println("New value is: " + result);        
  }      
}
