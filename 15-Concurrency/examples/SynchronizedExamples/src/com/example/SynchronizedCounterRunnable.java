package com.example;

public class SynchronizedCounterRunnable implements Runnable{
  private SynchronizedCounter count = new SynchronizedCounter();
  private int countSize = 0;
  private String threadName;
  
  public SynchronizedCounterRunnable(){
    super();
  }
  
  public SynchronizedCounterRunnable(int countSize, String threadName){
    this.countSize = countSize;
    this.threadName = threadName;
  }
  
  @Override
  public void run(){
    for (int i = 0; i < countSize; i++){
      synchronized(this){
        count.increment();
        System.out.println(threadName 
             + " Current Count: " + count.getValue());
      }
    }
  }
}
