package org.dsf.BST;

/*
Time Complexity: O(h)
Auxilary Space by Recursive: O(h)

 */

public class BSTSearch {

    public static boolean searchRecur(Node root,int val){

        if(root==null)
            return false;
        if(root.key==val)
            return true;
        if (root.key>val)
            searchRecur(root.left,val);
        if (root.key<val)
            searchRecur(root.right,val);

        return false;
    }

    public static boolean searchIterative(Node root){

        return false;
    }


    /*

    Assignment connects new Node to leaf nodes.
     */

    public static Node insertRecur(Node root, int key){
        if(root==null)
            return new Node(key);
        if(root.key>key)
            root.left=insertRecur(root.left,key);
        if(root.key<key)
            root.right=insertRecur(root.right,key);
        return root;

    }

    public static Node insertItr(Node root, int x){
        Node temp=new Node(x);
        Node parent=null,curr=root;

        while(curr!=null){
            parent=curr;
            if(curr.key>x){
                curr=curr.left;
            }else if(curr.key<x){
                curr=curr.right;
            }else {
                return root;
            }
        }
        if(parent==null){
            return temp;
        }
        if(parent.key>x)
            parent.left=temp;
        if(parent.key<x)
            parent.right=temp;

        return root;
    }

}
