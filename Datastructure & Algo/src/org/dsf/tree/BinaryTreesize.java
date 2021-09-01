package org.dsf.tree;

public class BinaryTreesize {
    static int getSize(Node root){

        if(root==null) return 0;

        return 1+getSize(root.left)+getSize(root.right);

    }

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Tree Size:"+getSize(tree.root));

    }

}
