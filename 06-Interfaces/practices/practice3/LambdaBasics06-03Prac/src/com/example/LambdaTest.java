package com.example;

public class LambdaTest {
  public static void main(String[] args) {
    String[] strList01 = 
      {"tomorrow","toto","to","timbukto","the","hello","heat"};
    
    AnalyzerTool stringTool = new AnalyzerTool();
    String searchStr = "to";
    
    System.out.println("Searching for: " + searchStr);
    
    System.out.println("==Contains==");
    stringTool.showResult(strList01, searchStr, 
      (t,s) -> t.contains(s));

    System.out.println("==Starts With==");
    stringTool.showResult(strList01, searchStr, 
      (t,s) -> t.startsWith(s));

    System.out.println("==Equals==");
    stringTool.showResult(strList01, searchStr, 
      (t,s) -> t.equals(s));    
    
    System.out.println("==Ends With==");
    // Your code here
    
    System.out.println("==Less than 5==");
    // Your Code here
    
    System.out.println("==Greater than 5==");
    // Your code here
  }    
}
