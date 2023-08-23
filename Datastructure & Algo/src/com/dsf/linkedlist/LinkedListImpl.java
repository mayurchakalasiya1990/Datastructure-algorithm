package com.dsf.linkedlist;

public class LinkedListImpl {

    static class Node{

        Node next;
        Object value;
        boolean visited; // Detect Loop in Linkedlist
        Node(Object value){
            this.value=value;
            visited=false;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", value=" + value +
                    '}';
        }
    }

    Node head;

    void insertAtBegin(Object val){
        Node node=new Node(val);
        node.next=head;
        head=node;
    }

    void insertAtEnd(Object val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            return;
        }
        Node pt=head;
        while (pt.next!=null){
            pt=pt.next;
        }
        pt.next=node;
    }

    void printLinkedList(){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.value);
            curr=curr.next;
        }

    }

    public static void main(String[] args) {
        LinkedListImpl linkedList=new LinkedListImpl();
        linkedList.insertAtBegin("Mayur");
        linkedList.insertAtEnd("Dipu");
        linkedList.insertAtEnd("Nilesh");
        linkedList.insertAtEnd("Kalyni");
        linkedList.printLinkedList();

    }

}
