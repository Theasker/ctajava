package com.example;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CounterTest {
  public static void main(String[] args) {
    ExecutorService es = Executors.newFixedThreadPool(4);
    
    es.submit(new CounterRunnable(10, "A"));
    es.submit(new CounterRunnable(10, "B"));
    es.submit(new CounterRunnable(10, "C"));    
    
    es.shutdown();
  }
}
