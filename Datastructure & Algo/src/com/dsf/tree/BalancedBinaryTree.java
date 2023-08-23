package com.dsf.tree;


/*

In a Balanced Binary Tree for every node, the difference between heights of left subtree and right subtree should not be more than one.
two solutions (one with time complexity of O(n^2) and another with time complexity of O(n) ) to check
whether a Tree is Balanced or not.
 */
public class BalancedBinaryTree {


    static int isBlanace(Node root){
        if(root==null) return 0;

        // check for left subtree and return left height
        int lh=isBlanace(root.left);
        if(lh==-1)return -1;

        // check for right subtree and return left height
        int rh=isBlanace(root.right);
        if(rh==-1)return -1;

        if(Math.abs(lh-rh)>1) { // check isBalanceTree
            return -1; // unbalance tree
        }
        else {
            return Math.max(lh, rh) + 1; // return height of tree
        }
    }

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("Is balance tree?:"+isBlanace(tree.root));
    }

}
