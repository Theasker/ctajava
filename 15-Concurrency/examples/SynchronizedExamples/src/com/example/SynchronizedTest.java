package com.example;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedTest {
  public static void main(String[] args) {
    ExecutorService es = Executors.newFixedThreadPool(4);
    
    es.submit(new SynchronizedCounterRunnable(10, "A"));
    es.submit(new SynchronizedCounterRunnable(10, "B"));
    es.submit(new SynchronizedCounterRunnable(10, "C"));    
    
    es.shutdown();
  }
}
