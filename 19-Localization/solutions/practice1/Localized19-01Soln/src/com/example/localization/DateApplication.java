package com.example.localization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;

public class DateApplication {
    PrintWriter pw = new PrintWriter(System.out, true);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    
    Locale ruLocale = new Locale("ru", "RU");
    Locale currentLocale = Locale.US;     
    ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", Locale.US);
         
    LocalDateTime today = LocalDateTime.now();
    DateTimeFormatter df;

    public static void main(String[] args){
        DateApplication dateApp = new DateApplication();
        dateApp.run();        
    }
    
    public void run(){
        String line = "";
        
        while (!(line.equals("q"))){
            this.printMenu();
            try { line = this.br.readLine(); } 
            catch (IOException e){ 
              System.out.println("Error: " + e.getMessage()); }
            
            switch (line){
                case "1": this.setEnglish(); break;
                case "2": this.setFrench(); break;
                case "3": this.setChinese(); break;
                case "4": this.setRussian(); break;
            }
        }       
    }
    
    public void printMenu(){
      pw.println("=== Date App ===");
      
      // Full Date
      df = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(currentLocale);
      pw.println(messages.getString("date1") + " " + today.format(df));
      
      // Long Date
      df = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(currentLocale);
      pw.println(messages.getString("date2") + " " + today.format(df));
      
      // Short Date
      df = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(currentLocale);
      pw.println(messages.getString("date3") + " " + today.format(df));
      
      // Medium Date/Time
      df = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(currentLocale);
      pw.println(messages.getString("date4") + " " + today.format(df));

      // Medium Time
      df = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).withLocale(currentLocale);
      pw.println(messages.getString("date5") + " " + today.format(df));
      
        pw.println("\n--- Choose Language Option ---");
        pw.println("1. " + messages.getString("menu1"));
        pw.println("2. " + messages.getString("menu2"));
        pw.println("3. " + messages.getString("menu3"));
        pw.println("4. " + messages.getString("menu4"));
        pw.println("q. " + messages.getString("menuq"));
        System.out.print(messages.getString("menucommand") + " ");        
    }
    
    public void setEnglish(){
        currentLocale = Locale.US;    
        messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);        
    }
    
    public void setFrench(){
        currentLocale = Locale.FRANCE;    
        messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
    }
    
    public void setChinese(){
        currentLocale = Locale.SIMPLIFIED_CHINESE;    
        messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);  
    }
    
    public void setRussian(){
        currentLocale = ruLocale;    
        this.messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);        
    }
}
