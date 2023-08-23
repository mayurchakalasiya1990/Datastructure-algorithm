package com.dsf.tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class LevelOrderTraversal {


    static void printLevelOrderLineByLine(Node root){

        if(root==null)
            return;

        Queue<Node> queue=new ArrayDeque<>();
        queue.add(root);
        queue.add(null); // marker for end of the level
        while (queue.size()>1) {
            Node curr = queue.poll();
            if (curr == null){
                System.out.println();
                queue.add(null); // marker for end of the level
                continue;
            }
            System.out.println(curr.key);
            if(curr.left!=null){
                queue.add(curr.left);
            }
            if(curr.right!=null){
                queue.add(curr.right);
            }
        }
    }


    /*
        1) Create node
        2) add root Node
     */
    static void printLevelOrderLinebyLine2(Node root){
        Queue<Node> queue=new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int count=queue.size();
            for (int i = 0; i < count; i++) {
                Node curr=queue.poll();
                System.out.print(curr.key+" ");
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
            }
            System.out.println();
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

        //printLevelOrderLineByLine(tree.root);
        printLevelOrderLinebyLine2(tree.root);

    }

}
