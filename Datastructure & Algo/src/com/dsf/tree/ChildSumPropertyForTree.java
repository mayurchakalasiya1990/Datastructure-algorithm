package com.dsf.tree;
import java.lang.*;

/*
Children Sum Property is a property in which the sum of values of the left child and right child should be equal to the value of their node if both children are present.
Else if only one child is present then the value of the child should be equal to its node value.
 */
public class ChildSumPropertyForTree {
    class Node
    {
        int key;
        Node left;
        Node right;
        Node(int k){
            key=k;
            left=right=null;
        }
    }

    public static void main(String args[])
    {
        com.dsf.tree.Node root=new com.dsf.tree.Node(20);
        root.left=new com.dsf.tree.Node(8);
        root.right=new com.dsf.tree.Node(12);
        root.right.left=new com.dsf.tree.Node(3);
        root.right.right=new com.dsf.tree.Node(9);

        System.out.print(isCSum(root));
    }

    public static boolean isCSum(com.dsf.tree.Node root) {
        if (root == null)
            return true;
        if (root.left == null && root.right == null)
            return true;
        int sum = 0;
        if (root.left != null) sum += root.left.key;
        if (root.right != null) sum += root.right.key;

        return (root.key == sum && isCSum(root.left) && isCSum(root.right));
    }
}


