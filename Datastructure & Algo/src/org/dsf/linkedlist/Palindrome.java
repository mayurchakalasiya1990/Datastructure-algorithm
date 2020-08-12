package org.dsf.linkedlist;

import org.dsf.linkedlist.LinkedListImpl.*;
import java.util.Stack;

public class Palindrome {


    static boolean isPalimdromeNavie(Node head){

        Stack stack=new Stack<>();

        Node curr=head;
        while(curr!=null){
            stack.push(curr.value);
            curr=curr.next;
        }

        curr=head;

        while(curr!=null){
            if(!curr.value.equals(stack.pop())){
                  return false;
            }
            curr=curr.next;
        }

        return true;

    }

    public static void main(String[] args) {
        LinkedListImpl linkedList=new LinkedListImpl();

        linkedList.insertAtBegin("G");
        linkedList.insertAtEnd("A");
        linkedList.insertAtEnd("M");
        linkedList.insertAtEnd("A");
        linkedList.insertAtEnd("G");

        linkedList.printLinkedList();
        System.out.println("is linkedList palindrome?: "+isPalimdromeNavie(linkedList.head));

    }

}
