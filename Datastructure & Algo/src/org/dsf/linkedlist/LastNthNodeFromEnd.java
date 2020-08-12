package org.dsf.linkedlist;

import org.dsf.linkedlist.LinkedListImpl.*;

public class LastNthNodeFromEnd {


    static Object findNodeFromNode(int position,Node head){
        Node first=head,second=head;
        Object result=null;

        for (int i = 0; i < position; i++) {
            if(second==null)
                return null;
            first=first.next;
        }

        while (first!=null){
            first=first.next;
            second=second.next;
        }
        result=second.value;
        return result;
    }

    public static void main(String[] args) {
        LinkedListImpl linkedList=new LinkedListImpl();
        linkedList.insertAtBegin("Mayur");
        linkedList.insertAtEnd("Dipu");
        linkedList.insertAtEnd("Nilesh");
        linkedList.insertAtEnd("Kalyni");
        System.out.println("Head Node Value:"+linkedList.head.value);
        System.out.println("Node from End of List: "+findNodeFromNode(2,linkedList.head));
        linkedList.printLinkedList();

    }


}
