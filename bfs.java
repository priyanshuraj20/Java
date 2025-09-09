import java.util.*;
public class bfs {
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
    public static void bfs(Node root){
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.remove();
            System.out.print(curr.val
            +" ");
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }

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

        System.out.println("level order  Traversal:");
        bfs(root); // Expected Output: 1 2 4 5 3
}
}
