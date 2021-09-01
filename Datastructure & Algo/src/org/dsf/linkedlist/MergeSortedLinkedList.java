package org.dsf.linkedlist;

import org.dsf.linkedlist.LinkedListImpl.*;

public class MergeSortedLinkedList {

    /*
        Time Complexity: O(m+n)
        Space Complexity: O(1)

     */
    static Node mergeSortedLinkedList(Node head1,Node head2){
        Node a=head1,b=head2,rhead=null,rtail=null;
        //base Condition
        if(a==null) return b;
        if(b==null) return a;

        if(Integer.valueOf(head1.value.toString())<Integer.valueOf(head2.value.toString())){
            rhead=head1;
            rtail=head1;
            if(a.next!=null){
                a=a.next;
            }
        }else{
            rhead=head2;
            rtail=head2;
            if(b.next!=null){
                b=b.next;
            }
        }

        while(a!=null && b!=null){
            int valA=Integer.valueOf(a.value.toString());
            int valB=Integer.valueOf(b.value.toString());

            if(valA>=valB){
                rtail.next=b;
                rtail=b;
                b=b.next;
            }else if(valA<valB){
                rtail.next=a;
                rtail=a;
                a=a.next;
            }
        }
        if(a!=null){
            rtail.next=a;
        }
        if(b!=null){
            rtail.next=b;
        }
        return rhead;
    }

    public static void main(String[] args) {

        LinkedListImpl list=new LinkedListImpl();
        list.insertAtBegin(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        System.out.println("List1:");
        list.printLinkedList();

        LinkedListImpl list1=new LinkedListImpl();
        list1.insertAtBegin(5);
        list1.insertAtEnd(15);
        list1.insertAtEnd(17);
        list1.insertAtEnd(18);
        list1.insertAtEnd(35);
        System.out.println("List2:");
        list1.printLinkedList();

        list.head=mergeSortedLinkedList(list.head,list1.head);
        System.out.println("Merge Sorted Linked List:");
        list.printLinkedList();

    }

}
