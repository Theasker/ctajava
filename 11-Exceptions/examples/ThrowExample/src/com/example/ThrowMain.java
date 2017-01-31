package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ThrowMain {

    public static void main(String[] args) {
        try {
            int data = readByteFromFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int readByteFromFile() throws IOException {
        try {
            File f=new File("a.txt");
            InputStream in = new FileInputStream(f);
            System.out.println("File open");
           if (f.length() > 250)
               throw new IOException("File too big");
            return in.read();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
    
}


 