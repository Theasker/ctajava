package com.example;

public class ThreadTest {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ExampleRunnable("one"));
        ExampleThread thread2 = new ExampleThread("two");
        
        // Start Threads
        thread1.start();
        thread2.start();
    }
}
