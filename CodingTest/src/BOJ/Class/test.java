package BOJ.Class;

import java.util.Scanner;

class A {
  public boolean intCheck(double a) {
    return a == (int) a;
  }

  public long sum(int a, int b) {
    return a + b;
  }
}

class B extends A {

  @Override
  public boolean intCheck(double b) {
    return super.intCheck(b);
  }

  @Override
  public long sum(int a, int b) {
    return super.sum(a, b);
  }
}

class C {
  int sum(int a, int b) {
    return a + b;
  }

  int sum(int a, double b) {
    return (int) (a + b);
  }

  int sum (int a, int b, int c) {
    return a + b + c;
  }
}

public class test {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    for (int i=0; i<sc.nextInt(); i++) {
      System.out.println(i);
    }
  }
}
