package com.dsf.linkedlist;

public class DetectLoopWithDummyNode {

    static boolean isLoopDetected(LinkedListImpl.Node head){

        LinkedListImpl.Node temp=new LinkedListImpl.Node("Dummy");
        LinkedListImpl.Node curr=head;
        while (curr!=null){

            if (curr.next==null)
                return false;

            if(curr.next==temp){
                return true;
            }
            LinkedListImpl.Node curr_next=curr.next;
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
