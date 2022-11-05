package test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

  public static void main(String[] args) {
    Object[] objects = new Object[3];
    objects[0] = "test";
    objects[1] = new String[]{"list1", "list2"};
    objects[2] = "tesTest";

    String[] result = flatten(objects)
      .map(Object::toString).toArray(String[]::new);

    System.out.println(Arrays.toString(result));
  }

  private static Stream<Object> flatten(Object[] array) {
    return Arrays.stream(array)
      .flatMap(o -> o instanceof Object[]? Arrays.stream((Object[]) o): Stream.of(o));
  }
}
