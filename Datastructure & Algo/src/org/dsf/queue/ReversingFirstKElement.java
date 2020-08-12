package org.dsf.queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReversingFirstKElement {


    public static void main(String[] args) {

        Queue<Integer> queue=new ArrayDeque<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        queue.offer(60);
        queue.offer(70);
        queue.offer(80);
        queue.offer(90);

        System.out.println(reverseKElement(queue,5));

    }

    static Queue<Integer> reverseKElement(Queue<Integer> queue, int n){
        int i=0;
        Stack<Integer> stack=new Stack<>();
        Queue<Integer> result=new ArrayDeque<>();
        while(i<n){
            int x=queue.poll();
            stack.push(x);
            ++i;
        }

        while (!stack.isEmpty()){
            result.offer(stack.pop());
        }

        while (!queue.isEmpty()){
            result.offer(queue.poll());
        }

        return result;
    }
}
