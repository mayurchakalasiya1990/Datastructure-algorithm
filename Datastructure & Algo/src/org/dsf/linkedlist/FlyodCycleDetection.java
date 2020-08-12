package org.dsf.linkedlist;

import org.dsf.linkedlist.LinkedListImpl.*;

/*
Algorithm:
1) slow=head,fast=head
2) slow=slow.next,fast=fast.next.next
3) if slow==fast (both meet at any point), loop detected.

Point to Note:
1) fast_pointer will enter into loop before or at same time as slow_pointer.
2) let fast_pointer be k distance ahead of slow_pointer when slow_pointer enter in loop k>=0.
3) this distance keeps on increasing by one in every movement of both pointer.
4) when distance becomes length of cycle, they meet.

Note: K is increase by one after Every loop. Both pointer meet when k=n where n is length of loop

Time complexity of Floyd's Algo : O(m+n)
Auxiliary space complexity O(1)
n=length of loop
m=length before loop start

 */
public class FlyodCycleDetection {

    static boolean isLoopDetected(Node head){

        Node slow=head,fast=head;

        while (fast!=null && fast.next!=null){ // Important Condition if loop will not detected. To Avoid Null point Exception
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
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
