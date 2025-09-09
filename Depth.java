//Find depth of given Node

public class Depth{
    static class Node {
        int val;
        Node left, right;
        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void printDepth(Node root, int depth,int data) {
        if (root == null) return;

        if(root.val == data) {
        System.out.println("Node " + root.val + " has depth " + depth);
        }

        printDepth(root.left, depth + 1,data);
        printDepth(root.right, depth + 1,data);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);
        root.right.right.right.left = new Node(11);
        root.left.right.left = new Node(5);
        root.left.right.right = new Node(6);

        printDepth(root, 0,11);
    }
}