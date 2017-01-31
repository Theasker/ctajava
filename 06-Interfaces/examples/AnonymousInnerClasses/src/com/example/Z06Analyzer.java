package com.example;

public class Z06Analyzer {
  
  public static void searchArr(String[] strList, String searchStr, StringAnalyzer analyzer){
    
    for(String currentStr:strList){
      if (analyzer.analyze(currentStr, searchStr)){
        System.out.println("Match: " + currentStr);
      }
    } 
  }
  
  public static void main(String[] args) {
    String[] strList01 = 
    {"tomorrow","toto","to","timbukto","the","hello","heat"};
    String searchStr = "to";
    System.out.println("Searching for: " + searchStr);

    // Use short form Lambda
    System.out.println("==Contains==");
    Z06Analyzer.searchArr(strList01, searchStr, 
      (t, s) -> t.contains(s));
    
    // Changing logic becomes easy
    System.out.println("==Starts With==");
    Z06Analyzer.searchArr(strList01, searchStr, 
      (t, s) -> t.startsWith(s));
  }    
}
