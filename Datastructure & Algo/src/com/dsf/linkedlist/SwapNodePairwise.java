package com.dsf.linkedlist;

public class SwapNodePairwise {

    static void swapNodePairwise1(LinkedListImpl.Node head){

        LinkedListImpl.Node curr=head;

        while(curr!=null && curr.next!=null){

            //Swap  Nodes
            Object value1=curr.value;
            curr.value=curr.next.value;
            curr.next.value=value1;
            curr=curr.next.next;
        }
    }

    public static void main(String[] args) {
        LinkedListImpl l1=new LinkedListImpl();
        l1.insertAtBegin(10);
        l1.insertAtEnd(20);
        l1.insertAtEnd(30);
        l1.insertAtEnd(40);
        l1.insertAtEnd(50);
        l1.insertAtEnd(60);

        System.out.println("LinkedList 1:");
        l1.printLinkedList();
        // l1: 10 > 20 > 30 > 40 >50 > 60 > null

        System.out.println("Swap Node Pairwise:");
        swapNodePairwise1(l1.head);
        l1.printLinkedList();
    }

}
