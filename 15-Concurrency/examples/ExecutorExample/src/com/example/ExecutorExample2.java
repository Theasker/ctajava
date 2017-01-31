package com.example;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorExample2 {

  public static void main(String[] args) {
    ExecutorService es = Executors.newFixedThreadPool(4);
    Future<String> f1 = es.submit(new ExampleCallable("one", 10000));
    Future<String> f2 = es.submit(new ExampleCallable("two", 10000));

    try {
      es.awaitTermination(5, TimeUnit.SECONDS);
      es.shutdown();
      String result1 = f1.get();
      System.out.println("Result of one: " + result1);
      String result2 = f2.get();
      System.out.println("Result of two: " + result2);
    } catch (ExecutionException | InterruptedException ex) {
      System.out.println("Exception: " + ex);
    }

  }
}
