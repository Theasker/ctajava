package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInput {

    public static void main(String[] args) {
        String s = "";
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Type xyz to exit: ");
            s = in.readLine();
            while (s != null) {
                System.out.println("Read: " + s.trim());
                if (s.equals("xyz")) {
                    System.exit(0);
                }
                System.out.print("Type xyz to exit: ");
                s = in.readLine();
            }
        } catch (IOException e) { // Catch any IO exceptions.
            System.out.println("Exception: " + e);
        }
    }
}