package com.example;

public class ExampleRunnable implements Runnable {
    private final String name;

    public ExampleRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(name + ":" + i);
        }
    }
}
