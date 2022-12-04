package BOJ.Class.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class4_1991 {

  static int n;
  static Node head;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());

    head = new Node('A', null, null);

    StringTokenizer st;


    for (int i=0; i<n; i++) {
      st = new StringTokenizer(br.readLine());

      char root = st.nextToken().charAt(0);
      char left = st.nextToken().charAt(0);
      char right = st.nextToken().charAt(0);

      insertNode(head, root, left, right);
    }

    preorder(head);
    System.out.println();
    inorder(head);
    System.out.println();
    postorder(head);
  }

  private static void insertNode(Node tmp, char root, char left, char right) {
    if (tmp.value == root) {
      tmp.left = left == '.' ? null : new Node(left, null, null);
      tmp.right = right == '.' ? null : new Node(right, null, null);
    } else {
      if (tmp.left != null) insertNode(tmp.left, root, left, right);
      if (tmp.right != null) insertNode(tmp.right, root, left, right);
    }
  }

  private static void preorder(Node node) {
    if (node == null) return;
    System.out.print(node.value); // 루트
    preorder(node.left); // 왼쪽
    preorder(node.right); // 오른쪽
  }

  private static void inorder(Node node) {
    if (node == null) return;
    inorder(node.left);
    System.out.print(node.value);
    inorder(node.right);
  }

  private static void postorder(Node node) {
    if (node == null) return;
    postorder(node.left);
    postorder(node.right);
    System.out.print(node.value);
  }
}

class Node {
  char value;
  Node left;
  Node right;

  public Node(char value, Node left, Node right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }
}