package org.dsf.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class GenerateNumber {

    public static void main(String[] args) {
            generateNumber(5,6,10000);
    }

    static void generateNumber(int a, int b,int n){
        Queue<String> queue=new ArrayDeque<>();

        queue.offer(a+"");
        queue.offer(b+"");

        for (int i = 0; i < n; i++) {
            String curr=queue.poll();
            System.out.println(curr);
            queue.offer(curr+""+a);
            queue.offer(curr+""+b);
        }

    }

}
