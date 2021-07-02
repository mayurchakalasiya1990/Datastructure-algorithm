package org.dsf.tree;


import java.util.ArrayDeque;
import java.util.Queue;

public class MaxWidthBinaryTree {

    static int maxWidth(Node root){
        if(root==null) return -1;
        int maxWidth=1;
        Queue<Node> queue=new ArrayDeque<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int count=queue.size();
            maxWidth=maxWidth<count?count:maxWidth;
            // iterate at tree level - line by line
            for (int i = 0; i < count; i++) {
                queue.poll();
                if(root.left!=null){
                    queue.add(root.left);
                }
                if(root.right!=null){
                    queue.add(root.right);
                }
            }
        }
        return maxWidth;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Max Value from Binary Tree:"+maxWidth(tree.root));
    }


}
