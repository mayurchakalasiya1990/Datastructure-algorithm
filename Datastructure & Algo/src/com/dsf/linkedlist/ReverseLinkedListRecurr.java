package com.dsf.linkedlist;

public class ReverseLinkedListRecurr {


    static LinkedListImpl.Node reverseLinkedList(LinkedListImpl.Node head){

        //Base case:
        if(head==null || head.next==null)
            return head;

        LinkedListImpl.Node next_head=reverseLinkedList(head.next);
        LinkedListImpl.Node rest_tail=head.next;
        rest_tail.next=head;
        head.next=null;
        return next_head;
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
