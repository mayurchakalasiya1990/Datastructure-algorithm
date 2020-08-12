package org.dsf.queue;

public class Queue {

    final int MAX=1000;
    int front, rear,size;
    int[] a=new int[MAX];

    public Queue(){
        front=-1;rear=-1;
    }

    public void enqueue(int val){

        if(front==MAX-1){
            System.out.println("Queue is full.");
        }else{
            if(front==-1){
                ++rear;
            }
            a[++front]=val;
            size++;
        }
    }
    public int dequeue(){
        int val=-1;
        if(front==rear || rear==-1){
            System.out.println("Queue is empty.");
        }else {
            val=a[rear++];
            size--;
        }
        return val;
    }

    public int size(){
        return size;
    }

    public boolean isFull(){
        return MAX==size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int getFont(){
        int val=-1;
        if(!isEmpty()){
            val=a[front];
        }
        return val;
    }

    public int getRear(){
        int val=-1;
        if(!isEmpty()){
            val=a[rear];
        }
        return val;
    }

    public void display(){
        for (int i = rear; i < size; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(20);
        queue.display();
        queue.dequeue();
        queue.display();
    }

}
