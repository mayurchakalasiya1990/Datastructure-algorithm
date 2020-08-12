package org.dsf.linkedlist;

import org.dsf.linkedlist.LinkedListImpl.*;

public class DetectLoopWithDummyNode {

    static boolean isLoopDetected(Node head){

        Node temp=new Node("Dummy");
        Node curr=head;
        while (curr!=null){

            if (curr.next==null)
                return false;

            if(curr.next==temp){
                return true;
            }
            Node curr_next=curr.next;
            curr.next=temp;
            curr=curr_next;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedListImpl linkedList=new LinkedListImpl();
        linkedList.insertAtBegin(10);
        linkedList.insertAtEnd(20);
        linkedList.insertAtEnd(30);
        linkedList.insertAtEnd(40);
        linkedList.printLinkedList();
        System.out.println("is Loop detected? "+isLoopDetected(linkedList.head));
    }
}
