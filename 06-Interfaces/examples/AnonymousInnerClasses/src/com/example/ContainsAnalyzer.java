package com.example;

public class ContainsAnalyzer implements StringAnalyzer {
  @Override
  public boolean analyze(String target, String searchStr){
    return target.contains(searchStr);
  }
}
