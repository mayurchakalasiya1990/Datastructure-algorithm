package org.dsf.stack;

public class NextGreaterElementNaiveSolution {


    public static void main(String[] args) {
        int[] arr= {10,15,20,25};
        nextGreaterSolution(arr);
    }

    static void nextGreaterSolution(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]>arr[i]){
                    System.out.println("Value:"+arr[j]);
                    break;
                }
            }
        }
    }
}
