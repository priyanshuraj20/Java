//find depth of all nodes:

public class DepthOfTree {
    static class Node {
        int val;
        Node left, right;
        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void printDepth(Node root, int depth) {
        if (root == null) return;

        System.out.println("Node " + root.val + " has depth " + depth);

        printDepth(root.left, depth + 1);
        printDepth(root.right, depth + 1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);

        printDepth(root, 0);
    }
}


