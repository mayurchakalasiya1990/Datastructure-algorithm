package org.dsf.linkedlist;

public class DoublyLinkedList {

    class Node{
        Node next, prev;
        Object value;

        public Node(Object value){
            this.value=value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", prev=" + prev +
                    ", value=" + value +
                    '}';
        }
    }


    Node head;

    public void insertAtBegin(Object value){
        Node temp=new Node(value);
        if(head==null){
            head=temp;
            return;
        }
        temp.next=head;
        head=temp;
    }

    public void insertAtEnd(Object value){
        Node temp=new Node(value);
        Node curr=head;

        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        temp.prev=curr;
        curr=temp;
    }

    public void printDLinkedList(){
        Node curr=head;
        while (curr!=null){
            System.out.println(curr.value);
            curr=curr.next;
        }
    }

    public static void main(String[] args) {

        DoublyLinkedList linkedList=new DoublyLinkedList();
        linkedList.insertAtBegin("Mayur");
        linkedList.insertAtEnd("Dipu");
        linkedList.insertAtEnd("Nilesh");
        linkedList.insertAtEnd("Kalyni");
        linkedList.printDLinkedList();
    }


}
