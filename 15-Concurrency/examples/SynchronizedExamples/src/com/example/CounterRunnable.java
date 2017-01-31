package com.example;

public class CounterRunnable implements Runnable{
  private Counter count = new Counter();
  private int countSize = 0;
  private String threadName;
  
  public CounterRunnable(){
    super();
  }
  
  public CounterRunnable(int countSize, String threadName){
    this.countSize = countSize;
    this.threadName = threadName;
  }
  
  @Override
  public void run(){
    for (int i=0; i < countSize; i++){
      count.increment();
      System.out.println(threadName + " Current Count: " + count.getValue());
    }
  }
}
