package org.dsf.linkedlist;

import org.dsf.linkedlist.LinkedListImpl.*;

public class DetectLoop {

    /*static boolean isLoopDetected(Node head){
        Node curr=head;
        while(cur
        return true;
            }
            curr=curr.next;
        }
        return false;
    }*/

    public static void main(String[] args) {

        LinkedListImpl linkedList=new LinkedListImpl();
        linkedList.insertAtBegin(10);
        linkedList.insertAtBegin(20);
        linkedList.insertAtBegin(30);
        linkedList.insertAtBegin(40);
        linkedList.printLinkedList();
        //System.out.println("is Loop detected? "+isLoopDetected(linkedList.head));

    }
}
