// rootnode ----> shawllowest node 

// Minimum depth 
//using dfs:

import java.util.LinkedList;
import java.util.Queue;

public class minDepth {
     static class Node {
        int val;
        Node left, right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static int minDepth(Node root) {
    if(root == null) return 0;  // Node-based
    
    // If left child is null, go only right
    if(root.left == null) return 1 + minDepth(root.right);
    
    // If right child is null, go only left
    if(root.right == null) return 1 + minDepth(root.left);
    
    return 1 + Math.min(minDepth(root.left), minDepth(root.right));
}
//using bfs
public static int minDepthBFS(Node root) {
    if(root == null) return 0;
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    int depth = 1;
    
    while(!q.isEmpty()) {
        int size = q.size();
        for(int i=0; i<size; i++) {
            Node curr = q.poll();
            if(curr.left == null && curr.right == null) return depth;
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }
        depth++;
    }
    return depth;
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

        System.out.println("Minimum Depth of a Tree: " + minDepth(root));
        System.out.println("Minimum Depth of a Tree: " + minDepthBFS(root));
    }
}



