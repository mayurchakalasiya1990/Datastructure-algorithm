package com.dsf.linkedlist;

import java.util.HashSet;

public class IntersectionOf2LinkedList {

    /*
     1. Auxiliary Space O(m+n)
     2. Time Complexity O(m+n)
     */
    static LinkedListImpl.Node interSectionPoint1(LinkedListImpl.Node head1, LinkedListImpl.Node head2){
        System.out.println("1");
        LinkedListImpl.Node result=null;
        LinkedListImpl.Node curr1=head1,curr2=head2;
        HashSet<LinkedListImpl.Node> nodeSet=new HashSet<>();
        while(curr1!=null){
            nodeSet.add(curr1);
            curr1=curr1.next;
        }

        while(curr2!=null){
            if(!nodeSet.add(curr2)){
                result=curr2;
                break;
            }
            curr2=curr2.next;
        }
        return result;

    }

    /*
     1. Auxiliary Space O(1)
     2. Time Complexity O(m+n)

     1. diff=count1-count2 is difference between two linkedlist
     2. Move linkedlist (whichever is greater on size) to diff find in 1st steps.
     3. Move both linkedlist Simultaneously and find point for which curr1=curr2. it will be intersection point

     */
    static LinkedListImpl.Node intersectionPoint2(LinkedListImpl.Node head1, LinkedListImpl.Node head2){
        LinkedListImpl.Node result=null;
        int count1=0,count2=0;
        LinkedListImpl.Node curr1=head1,curr2=head2;
        while(curr1!=null){
            ++count1;
            curr1=curr1.next;
        }

        while(curr2!=null){
            ++count2;
            curr2=curr2.next;
        }

        int diff=Math.abs(count1-count2);

        //Node temp1=count1>count2?head1:head2;
        curr1=head1;
        curr2=head2;
        while (diff>0){
            curr1=curr1.next;
            --diff;
        }

        while (curr1!=null && curr2!=null){
            if(curr1==curr2){
                return curr1;
            }
            curr1=curr1.next;
            curr2=curr2.next;
        }
        result=null;
        return result;
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
        LinkedListImpl.Node curr1=l1.head;

        for (int i = 0; i < 3; i++) {
            curr1=curr1.next;
        }

        System.out.println("4th Node of List1:"+curr1.value);

        LinkedListImpl l2=new LinkedListImpl();
        l2.insertAtBegin(10);
        l2.insertAtEnd(20);
        l2.insertAtEnd(30);
        // l2: 10 > 20 > 30 > null
        System.out.println("LinkedList 2:");
        l2.printLinkedList();
        LinkedListImpl.Node curr2=l2.head;
        System.out.println("Head Node:"+l2.head.value);
        while(curr2!=null){
            if(curr2.next==null){

                curr2.next=curr1;
                break;
            }
            curr2=curr2.next;
        }

        // l2: 10 > 20 > 30 > 40 (40 is node of list1)

        System.out.println("Curr2.next:"+curr2.next.value);
        System.out.println("Intersection Point Method-1: "+interSectionPoint1(l1.head,l2.head).value);
        System.out.println("Intersection Point Method-2: "+intersectionPoint2(l1.head,l2.head).value);
    }
}
