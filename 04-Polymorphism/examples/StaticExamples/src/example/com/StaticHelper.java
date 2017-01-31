package example.com;

import java.time.LocalDate;

public class StaticHelper {
    
    public static void printMessage(String message) {
        System.out.println("Messsage for " +
         LocalDate.now() + ": " + message);
    }
    
}