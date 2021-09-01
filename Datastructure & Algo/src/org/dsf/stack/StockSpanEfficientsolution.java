package org.dsf.stack;

import java.util.Stack;

public class StockSpanEfficientsolution {

    public static void main(String[] args) {

        int[] arr={15,13,12,14,16,8,6,4,10,30};
        stockSpan(arr);

    }

    static void stockSpan(int[] arr){

        Stack<Integer> stack=new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
                stack.pop();
            }
            int span=stack.isEmpty()? i+1:i-stack.peek();
            System.out.println(span);
            stack.push(i);
        }
    }

}

