package com.dsf.linkedlist;

public class MiddleOfLinkedList {

    static Object middleValue(LinkedListImpl.Node head){
        Object result=null;
        LinkedListImpl.Node fast=head;
        LinkedListImpl.Node slow=head;
        if(fast==null){
            return null;
        }
        // For Odd nodes curr!= null
        // For even nodes curr.next!= null
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        result=slow.value;
        return result;
    }

    public static void main(String[] args) {
        LinkedListImpl linkedList=new LinkedListImpl();
        linkedList.insertAtBegin("Mayur");
        linkedList.insertAtEnd("Dipu");
        linkedList.insertAtEnd("Nilesh");
        linkedList.insertAtEnd("Kalyni");
        System.out.println("Head Node Value:"+linkedList.head.value);
        System.out.println("Middle Node: "+middleValue(linkedList.head));
        linkedList.printLinkedList();

    }

}
