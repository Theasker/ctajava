package com.example;

public class StringOperations {

    public static void main(String arg[]) {

        StringBuilder sb = new StringBuilder("hello");
        System.out.println("string sb: " + sb);
        sb.append(" world");
        System.out.println("string sb: " + sb);
        
        sb.append("!").append(" are").append(" you?");
        System.out.println("string sb: " + sb);
        
        sb.insert(12, " How");
        System.out.println("string sb: " + sb);

        // Get length
        System.out.println("Length: " + sb.length());

        // Get SubString
        System.out.println("Sub: " + sb.substring(0, 5));
    }
}