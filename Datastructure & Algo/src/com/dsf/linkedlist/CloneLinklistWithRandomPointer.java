package com.dsf.linkedlist;
import com.dsf.linkedlist.LinkedListWithRandomPointerImpl.*;

import java.util.HashMap;

class LinkedListWithRandomPointerImpl {

    static class Node{

        Node next;
        Object value;
        boolean visited; // Detect Loop in Linkedlist
        Node random;
        Node(Object value){
            this.value=value;
            visited=false;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", value=" + value +
                    '}';
        }
    }

    Node head;

    void insertAtBegin(Object val){
        Node node=new Node(val);
        node.next=head;
        head=node;
    }

    void insertAtEnd(Object val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            return;
        }
        Node pt=head;
        while (pt.next!=null){
            pt=pt.next;
        }
        pt.next=node;
    }

    Node getNodeAtPos(int n){
        Node curr=head;
        for (int i = 1; i < n-1; i++) {
            curr=curr.next;
        }
        return curr;
    }

    void setRandomNode(int pos,Node node){
        Node curr=head;
        while(pos>1){
            curr=curr.next;
            --pos;
        }
        curr.random=node;
    }

    void printLinkedList(){
        Node curr=head;
        while(curr!=null){
            Node random=curr.random;
            Object value=random!=null?random.value:null;
            System.out.println("Value:"+curr.value+" Random Pointer:"+value);
            curr=curr.next;
        }

    }

}

public class CloneLinklistWithRandomPointer {

    /*
     1)
     */
    static void cloneLinkedList(Node head){

        Node curr=head;
        Node clone=null,prev=null,headClone=null;
        HashMap<Node,Node> nodeHashMap=new HashMap<>();
        LinkedListWithRandomPointerImpl cloneList=new LinkedListWithRandomPointerImpl();
        boolean isFirstIteration=true;
        while (curr!=null){
            clone=new Node(curr.value);
            nodeHashMap.put(clone, curr.random);
            curr=curr.next;
            if (isFirstIteration){
                headClone=clone;
                prev=clone;
                isFirstIteration=false;
            }else{
                prev.next=clone;
                prev=clone;
            }

        }
        cloneList.head=headClone;
        curr=head;
        clone=headClone;
        while (curr!=null){
            clone.random=nodeHashMap.get(clone);
            clone=clone.next;
            curr=curr.next;
        }
        System.out.println("Clone LinkedList:");
        cloneList.printLinkedList();


    }

    /*
        LinkedList: 10>20>30>40>null
        1) Create same node in LinkedList After Every Node
            i.e 10>10>20>20>30>30>40>40>null

         2) Set Random pointer of clone LinkedList using actually linkedlist

         3) Remove clone linkedlist from actually linkedlist and create clone LinkedList.
     */

    static void cloneLinkedList1(Node head){
        LinkedListWithRandomPointerImpl cloneList=new LinkedListWithRandomPointerImpl();
        Node curr=head;
        Node nextNode=null;
        while(curr!=null){
            nextNode=curr.next;
            curr.next=new Node(curr.value);
            curr.next.next=nextNode;
            curr=nextNode;
        }

        curr=head;
        while(curr!=null){
            curr.next.random=curr.random!=null?curr.random.next:null;
            curr=curr.next.next;
        }

        curr=head;
        Node cloneCurr=null;
        while (curr!=null){
            if(cloneList.head==null){
                cloneList.head=curr.next;
            }
            cloneCurr=curr.next;
            curr.next=curr.next.next;
            curr=curr.next;
        }
        System.out.println("Clone List:");
        cloneList.printLinkedList();

    }

    public static void main(String[] args) {


        LinkedListWithRandomPointerImpl list=new LinkedListWithRandomPointerImpl();
        list.insertAtBegin(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(60);

        list.setRandomNode(1,list.getNodeAtPos(3));
        list.setRandomNode(2,list.getNodeAtPos(4));
        list.setRandomNode(3,list.getNodeAtPos(1));
        list.setRandomNode(4,list.getNodeAtPos(2));
        list.setRandomNode(5,list.getNodeAtPos(6));
        list.setRandomNode(6,list.getNodeAtPos(5));
        System.out.println("List:");
        list.printLinkedList();
        //cloneLinkedList(list.head);
        cloneLinkedList1(list.head);


    }
}
