package org.dsf.linkedlist;

import org.dsf.linkedlist.LinkedListImpl.*;

//Iterative Solution
public class ReverseLinkedList {

    static Node reverseLinkedList(Node head){

        Node curr=head;
        Node next,prev = null;

        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //System.out.println(prev);
        //head=prev;
        /*LinkedListImpl linkedList=new LinkedListImpl();
        linkedList.printLinkedList();*/
        return prev;
    }

    public static void main(String[] args) {
        LinkedListImpl linkedList=new LinkedListImpl();
        linkedList.insertAtBegin("Mayur");
        linkedList.insertAtEnd("Dipu");
        linkedList.insertAtEnd("Nilesh");
        linkedList.insertAtEnd("Kalyni");
        System.out.println("Head node :"+linkedList.head.value);
        linkedList.printLinkedList();
        linkedList.head=reverseLinkedList(linkedList.head);
        System.out.println("Reversed LinkedList:");
        System.out.println("Head node :"+linkedList.head.value);
        linkedList.printLinkedList();

    }
}
