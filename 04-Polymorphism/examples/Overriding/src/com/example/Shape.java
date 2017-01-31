 package com.example;

public class Shape {
  double height;
  double width;
  Shape(double a, double b) {
    height = a;
    width = b;
  }
  double calculateArea() {
    System.out.println("Area for Figure is undefined.");
    return 0;
  }
}
class Rectangle extends Shape {
  Rectangle(double a, double b) {
    super(a, b);
  }
  // override calculateArea for rectangle
  double calculateArea() {
    System.out.println("Inside Area for Rectangle.");
    return height * width;
  }
}
class Triangle extends Shape {
  Triangle(double a, double b) {
    super(a, b);
  }
  // override calculateArea for right triangle
  double calculateArea() {
    System.out.println("Inside Area for Triangle.");
    return height * width / 2;
  }
}

