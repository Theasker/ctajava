package com.example;

public class ExampleThread extends Thread {
    private final String name;
    
    public ExampleThread(String name){
        this.name = name;
    }
    
    @Override
    public void run(){  
        for (int i = 0; i < 1000; i++) {
            System.out.println(name + ":" + i);        
        }
    } 
}
