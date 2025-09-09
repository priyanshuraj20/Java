public class Main {
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

    static int idx = -1;

    public static Node buildTree(int arr[]) {
        idx++;
        if (arr[idx] == -1) return null;

        Node newNode = new Node(arr[idx]);
        newNode.left = buildTree(arr);
        newNode.right = buildTree(arr);

        return newNode;
    }

    public static void printTree(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");  // preorder traversal
        printTree(root.left);
        printTree(root.right);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = buildTree(arr);

        System.out.println("Preorder Traversal:");
        printTree(root);
    }
}
