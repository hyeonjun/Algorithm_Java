package BOJ.Class.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class4_5639 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Node5639 head = new Node5639(Integer.parseInt(br.readLine()));

    while (true) {
      String input = br.readLine();
      if (input == null || input.equals("")) break;
      head.insert(Integer.parseInt(input));
    }

    postorder(head);
  }

  private static void postorder(Node5639 node5639) {
    if (node5639 == null) return;
    postorder(node5639.left);
    postorder(node5639.right);
    System.out.println(node5639.value);
  }
}

class Node5639 {
  int value;
  Node5639 left;
  Node5639 right;

  public Node5639(int value) {
    this(value, null, null);
  }

  public Node5639(int value, Node5639 left, Node5639 right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }

  public void insert(int value) {
    if (value < this.value) { // 현재 노드의 값보다 작으면 왼쪽
      if (this.left == null) {
        this.left = new Node5639(value);
      } else this.left.insert(value);
    } else { // 크면 오른쪽
      if (this.right == null ){
        this.right = new Node5639(value);
      } else this.right.insert(value);
    }
  }
}
