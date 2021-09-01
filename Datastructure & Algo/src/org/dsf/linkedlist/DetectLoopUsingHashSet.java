package org.dsf.linkedlist;

import org.dsf.linkedlist.LinkedListImpl.*;

import java.util.HashMap;
import java.util.HashSet;


//Auxiliary Space O(n)
//Time complexity O(n)
public class DetectLoopUsingHashSet {

    static boolean isLoopDetected(Node head){
        HashSet<Object> hashSet=new HashSet<>();
        Node curr=head;
        while (curr!=null){

            if(hashSet.contains(curr.value)){
                return true;
            }
            hashSet.add(curr.value);
            curr=curr.next;
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
