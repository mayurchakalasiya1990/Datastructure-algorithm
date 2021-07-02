package org.dsf.BST;

public class BSTFloor {


    /*
        Time complexity : O(h)
        Space Complexity: O(1) due to iterative solution
     */
    public static Node floor(Node root,int x){
        Node res=null;

        while(root!=null){

            if(root.key==x){
                return root;
            }else if(root.key>x){
                root=root.left;
            }else{
                res=root;
                root=root.right;
            }

        }
        return res;
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(70);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

    }


}


