public class PreOrder {
    static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void preOrder(Node root) {
        if (root == null) return;

        // Root → Left → Right
        
        preOrder(root.left);
        System.out.print(root.val + " ");
        preOrder(root.right);
    }

    public static void main(String[] args) {
        // Example tree:
        //        1
        //       / \
        //      2   3
        //     / \
        //    4   5

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(9);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Preorder Traversal:");
        preOrder(root); // Expected Output: 1 2 4 5 3
    }
}
