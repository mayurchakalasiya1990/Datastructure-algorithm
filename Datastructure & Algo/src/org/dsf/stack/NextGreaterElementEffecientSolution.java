package org.dsf.stack;


import java.util.*;
import java.util.Stack;

public class NextGreaterElementEffecientSolution {
    public static void main(String[] args) {
        int[] arr= {10,15,20,25};
        List output=nextGreaterSolution(arr);
        Collections.reverse(output);
        System.out.println(output);

    }

    static List<Integer> nextGreaterSolution(int[] arr){
        Stack<Integer> stack=new Stack<>();
        ArrayList<Integer> list=new ArrayList<>();
        stack.push(arr[arr.length-1]);
        list.add(-1);
        for (int i = arr.length-2; i>=0; i--) {
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            int ng=stack.isEmpty()?-1:stack.peek();
            System.out.println("Value:"+ng);
            list.add(ng);
            stack.push(arr[i]);
        }
        return list;
    }
}
