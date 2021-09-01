package org.dsf.tree;

class Node{
    Node left;
    Node right;
    int key;

    Node(int k){
        this.key=k;
    }
}

/*

InOrder:
Time Complexity: O(n)
Auxilary Space: O(h)
 */

public class BinaryTree {

    // Root of Binary Tree
    Node root;

    BinaryTree()
    {
        root = null;
    }


    /* Given a binary tree, print its nodes according to the
      "bottom-up" postorder traversal. */
    void postorder(Node node)
    {
        if (node == null)
            return;

        // first recur on left subtree
        postorder(node.left);

        // then recur on right subtree
        postorder(node.right);

        // now deal with the node
        System.out.print(node.key + " ");
    }

    /* Given a binary tree, print its nodes in inorder*/
    void inorder(Node node)
    {
        if (node == null)
            return;

        /* first recur on left child */
        inorder(node.left);

        /* then print the data of node */
        System.out.print(node.key + " ");

        /* now recur on right child */
        inorder(node.right);
    }

    /* Given a binary tree, print its nodes in preorder*/
    void preorder(Node node)
    {
        if (node == null)
            return;

        /* first print data of node */
        System.out.print(node.key + " ");

        /* then recur on left subtree */
        preorder(node.left);

        /* now recur on right subtree */
        preorder(node.right);
    }

    // Wrappers over above recursive functions
    void printPostorder()  {     postorder(root);  }
    void printInorder()    {     inorder(root);   }
    void printPreorder()   {     preorder(root);  }

    int height(Node root){

        if(root==null){
            return 0;
        }else{
            return Math.max(height(root.left),height(root.right))+1;
        }
    }


    /*
    Time Complexity : O(n)
    Auxilary space : O(h)
     */
    void printKDistNode(Node root,int k){
        if(root==null)
            return;
        if(k==0) {
            System.out.print(root.key + " ");
        }else{
            printKDistNode(root.left,k-1);
            printKDistNode(root.right,k-1);
        }
    }

    // Driver method
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreorder();

        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInorder();

        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostorder();

        System.out.println("\nheight of binary tree is "+tree.height(tree.root));

        int k=1;
        System.out.println("print "+k+" dist node: ");
        tree.printKDistNode(tree.root,k);

    }

}
