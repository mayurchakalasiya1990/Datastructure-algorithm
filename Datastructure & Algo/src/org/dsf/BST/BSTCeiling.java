package org.dsf.BST;

public class BSTCeiling {


    /*
    Time complexity : O(h)
    Space Complexity: O(1) due to iterative solution
 */
    public static Node ceil(Node root,int x){
        Node res=null;

        while(root!=null){

            if(root.key==x){
                return root;
            }else if(root.key<x){
                root=root.right;
            }else{
                res=root;
                root=root.left;
            }

        }
        return res;
    }

}
