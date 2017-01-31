package com.example;

public class Counter {
  private static int i = 0;
  
  public void increment(){
    i++;
  }
  
  public void decrement(){
    i--;
  }
  
  public int getValue(){
    return i;
  }
}
