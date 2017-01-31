package com.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamCopyTest {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: CharStreamCopyTest <original file> <copy>");
            System.exit(-1);
        }
        char[] c = new char[128];
        // Example use of InputStream methods
        try (FileReader fr = new FileReader(args[0]);
                FileWriter fw = new FileWriter(args[1])) {
            int count = 0;
            int read = 0;
            while ((read = fr.read(c)) != -1) {
                fw.write(c);
                count += read;
            }
            System.out.println("Wrote: " + count + " characters.");
        } catch (FileNotFoundException f) {
            System.out.println("File " + args[0] + " not found.");
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
    }
}
