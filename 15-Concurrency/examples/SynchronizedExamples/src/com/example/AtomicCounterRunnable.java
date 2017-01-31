package com.example;

public class AtomicCounterRunnable implements Runnable{
  private AtomicCounter count = new AtomicCounter();
  private int countSize = 0;
  private String threadName;
  
  public AtomicCounterRunnable(){
    super();
  }
  
  public AtomicCounterRunnable(int countSize, String threadName){
    this.countSize = countSize;
    this.threadName = threadName;
  }
  
  @Override
  public void run(){
    for (int i = 0; i < countSize; i++){
        count.increment();
        System.out.println(threadName 
             + " Current Count: " + this.getCounter());
    }
  }
  
  public synchronized int getCounter(){
    return count.getValue();
  }
}
