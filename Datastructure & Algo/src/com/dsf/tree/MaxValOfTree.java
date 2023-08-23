package com.dsf.tree;

public class MaxValOfTree {


    /*

     */

    public static int getMax(Node root){
        if(root==null)
            return Integer.MIN_VALUE;
        return Math.max(root.key,Math.max(getMax(root.left),getMax(root.right)));
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Max Value from Binary Tree:"+getMax(tree.root));
    }
}
