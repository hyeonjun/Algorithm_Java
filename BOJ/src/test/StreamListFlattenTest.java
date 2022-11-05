package test;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamListFlattenTest {

  public static void main(String[] args) {
    Object[] objects = new Object[3];
    objects[0] = "test";
    objects[1] = new String[]{"list1", "list2"};
    objects[2] = "tesTest";

    String[] result = flattenTwoDimension(objects)
      .map(Object::toString).toArray(String[]::new);

    System.out.println(Arrays.toString(result));
  }

  private static Stream<Object> flattenTwoDimension(Object[] array) {
    return Arrays.stream(array)
      .flatMap(o -> o instanceof Object[]? Arrays.stream((Object[]) o): Stream.of(o));
  }

  private static Stream<Object> flattenMultipleDimension(Object[] array) {
    return Arrays.stream(array)
      .flatMap(o -> o instanceof Object[]? flattenMultipleDimension((Object[])o): Stream.of(o));
  }
}
