// root ---> deepest leaf

// 👉 “Maximum depth of tree” aur “Height of tree (root ke hisaab se)” same hi cheez hain.

// Depth: root se lekar ek node tak path ka length.

// Height: ek node se leaf tak ka longest path.

// Ab root ke liye:

// Root ki depth = 0

// Root ki height = maximum depth of tree
public class MaxDepth {
    static class Node {
        int val;
        Node left, right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) return -1;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        // Example Tree:
        //        1
        //       / \
        //      2   3
        //     / \
        //    4   5
        //         \
        //          6

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);

        System.out.println("MAximum Depth of a Tree: " + height(root));
    }
}

