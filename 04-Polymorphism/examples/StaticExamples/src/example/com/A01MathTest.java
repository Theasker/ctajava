package example.com;

public class A01MathTest {
  public static void main(String[] args) {
    System.out.println("Random: " + Math.random() * 10);
    System.out.println("Square root: " + Math.sqrt(9.0));
    System.out.println("Rounded random: " + 
        Math.round(Math.random()*100));
    System.out.println("Abs: " + Math.abs(-9));
  }
}
