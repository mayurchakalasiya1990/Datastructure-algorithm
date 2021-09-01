package org.dsf.stack;

import java.util.Stack;

public class PreviousGreaterElementEfficientSolution {



    public static void main(String[] args) {
        int[] arr={20,30,10,5,15};
        printPrevGreaterElement(arr);
    }

    static void printPrevGreaterElement(int arr[]){

        Stack<Integer> s=new Stack<>();
        s.push(arr[0]);

        for (int i = 0; i < arr.length; i++) {
            while(!s.empty() && s.peek()<=arr[i]){
                s.pop();
            }
            int pg=(s.isEmpty())?-1:s.peek();
            System.out.println("Value:"+pg);
            s.push(arr[i]);
        }

    }

}
