package 재귀.main6;


import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node lt;
    Node rt;

    public Node(int data) {
        this.data = data;
    }
}


public class Main {
    Node root;

    public void BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Node current = Q.poll();
                System.out.print(current.data + " ");
                if (current.lt != null) {
                    Q.offer(current.lt);
                }
                if (current.rt != null) {
                    Q.offer(current.rt);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);
    }
}
