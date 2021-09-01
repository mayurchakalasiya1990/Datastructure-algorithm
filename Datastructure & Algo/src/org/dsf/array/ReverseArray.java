package org.dsf.array;

import java.util.Arrays;

public class ReverseArray {


    /*
           Time Complexity: theta(n)
           Auxilary Space: theta(1)
     */

    public static void main(String[] args) {
        int[] arr={1,2,3,41,2,3,10};
        System.out.println("Array:"+Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Reverse Array:"+Arrays.toString(arr));

    }

    static void reverseArray(int[] arr){
        int low=0,high=arr.length-1;
        int temp=-1;
        while(low<high){
            temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            high--;
            low++;
        }
    }
}
