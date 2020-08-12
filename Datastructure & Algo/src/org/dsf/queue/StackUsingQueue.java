package org.dsf.queue;

import java.util.ArrayDeque;
import  java.util.Queue;
public class StackUsingQueue {

    Queue<Integer> q1=new ArrayDeque<>(),q2=new ArrayDeque<>();

    int top(){
        return q1.peek();
    }

    int size(){
        return q1.size();
    }

    int pop(){
        return q1.poll();
    }

    void push(int x){

        while(!q1.isEmpty()){
            q2.offer(q1.peek());
            q1.poll();
        }
        q1.offer(x);
        while(!q2.isEmpty()){
            q1.offer(q2.peek());
            q2.poll();
        }
    }

    public static void main(String[] args) {
        StackUsingQueue stackUsingQueue=new StackUsingQueue();
        stackUsingQueue.push(10);
        stackUsingQueue.push(20);
        stackUsingQueue.push(30);
        System.out.println(stackUsingQueue.size());
        stackUsingQueue.push(40);
        System.out.println(stackUsingQueue.size());
    }

}
