package test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomTest {

  public static void main(String[] args) {
    random();
  }

  private static void random() {
    Random random = new Random();
    int value;
    int x=100;

    Set<Integer> set = new HashSet<>();

    while (x-- > 0) {
      value = random.nextInt(9) + 1;
      set.add(value);
    }

    System.out.println(set); // [1, 2, 3, 4, 5, 6, 7, 8, 9]
  }
}

