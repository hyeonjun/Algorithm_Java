package BOJ.Class.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class4_1991 {

  static int n;
  static Node1991 head;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());

    head = new Node1991('A', null, null);

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

  private static void insertNode(Node1991 tmp, char root, char left, char right) {
    if (tmp.value == root) {
      tmp.left = left == '.' ? null : new Node1991(left, null, null);
      tmp.right = right == '.' ? null : new Node1991(right, null, null);
    } else {
      if (tmp.left != null) insertNode(tmp.left, root, left, right);
      if (tmp.right != null) insertNode(tmp.right, root, left, right);
    }
  }

  private static void preorder(Node1991 node1991) {
    if (node1991 == null) return;
    System.out.print(node1991.value); // 루트
    preorder(node1991.left); // 왼쪽
    preorder(node1991.right); // 오른쪽
  }

  private static void inorder(Node1991 node1991) {
    if (node1991 == null) return;
    inorder(node1991.left);
    System.out.print(node1991.value);
    inorder(node1991.right);
  }

  private static void postorder(Node1991 node1991) {
    if (node1991 == null) return;
    postorder(node1991.left);
    postorder(node1991.right);
    System.out.print(node1991.value);
  }
}

class Node1991 {
  char value;
  Node1991 left;
  Node1991 right;

  public Node1991(char value, Node1991 left, Node1991 right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }
}