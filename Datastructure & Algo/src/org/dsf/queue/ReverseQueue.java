package org.dsf.queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {



    public static void main(String[] args) {

        Queue<Integer> queue=new ArrayDeque();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        reverseQueue(queue);
        System.out.println("Stack Solution: "+queue);
        reverseQueueRecur(queue);
        System.out.println("Recursive Solution: "+queue);
    }


    //Reverse Queue using Stack
    static void reverseQueue(Queue<Integer> queue){
        Stack<Integer> stack=new Stack<>();
        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }
        while(!stack.isEmpty()){
            queue.offer(stack.pop());
        }
    }

    static void reverseQueueRecur(Queue<Integer> queue){
        if(queue.isEmpty()) return;
        int x=queue.poll();
        reverseQueue(queue);
        queue.offer(x);
    }

}
