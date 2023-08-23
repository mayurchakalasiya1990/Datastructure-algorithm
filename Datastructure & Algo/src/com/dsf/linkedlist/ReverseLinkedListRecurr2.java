package com.dsf.linkedlist;

public class ReverseLinkedListRecurr2 {

    static LinkedListImpl.Node recreverse(LinkedListImpl.Node curr, LinkedListImpl.Node prev){

        //Base case:
        if(curr==null) return prev;
        LinkedListImpl.Node next=curr.next;
        curr.next=prev;
        return recreverse(next,curr);
    }

    public static void main(String[] args) {
        LinkedListImpl linkedList=new LinkedListImpl();
        linkedList.insertAtBegin("Mayur");
        linkedList.insertAtEnd("Dipu");
        linkedList.insertAtEnd("Nilesh");
        linkedList.insertAtEnd("Kalyni");
        System.out.println("Head node :"+linkedList.head.value);
        linkedList.printLinkedList();
        linkedList.head=recreverse(linkedList.head,null);
        System.out.println("Reversed LinkedList:");
        System.out.println("Head node :"+linkedList.head.value);
        linkedList.printLinkedList();
    }
}
