package org.dsf.queue;

public class LinkedListQueue {

    public class Node
    {
        double value;
        Node next;

        public Node( double x )
        {
            value = x;
            next  = null;
        }

        public String toString()
        {
            return "" + value;
        }
    }

    Node rear,front;
    int size;

    public void enqueue(double x){
        Node tmp=new Node(x);
        if(front==null){
            ++size;
            front=rear=tmp;
            return;
        }
        ++size;
        rear.next=tmp;
        rear=tmp;
    }

    public void dequeue(){

        if(front==rear){
            return;
        }
        size--;
        front=front.next;
        if(front==null){
            rear=null;
        }
        return;
    }

    public int size(){
        return size;
    }

    public Node getFront(){
        return front;
    }

    public Node getRear(){
        return rear;
    }


    public static void main(String[] args) {
        LinkedListQueue queue=new LinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println(queue.size());
        queue.dequeue();
        System.out.println(queue.size());
        System.out.println("Front:"+queue.getFront()+" Rear:"+queue.getRear());
    }
}
