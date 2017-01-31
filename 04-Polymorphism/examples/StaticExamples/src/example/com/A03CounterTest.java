package example.com;

public class A03CounterTest {

  public static void main(String[] args) {
    System.out.println("Start: " + StaticCounter.getCount());
    StaticCounter.increment();
    StaticCounter.increment();
    System.out.println("End: " + StaticCounter.getCount());
  }
}
