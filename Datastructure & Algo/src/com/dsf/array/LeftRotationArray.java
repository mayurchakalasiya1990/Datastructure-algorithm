package com.dsf.array;

import java.util.Arrays;

public class LeftRotationArray {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6};
        System.out.println("Arrays:"+Arrays.toString(arr));
        leftRotationByOne(arr);
        System.out.println("Rotate Arrays  by One::"+Arrays.toString(arr));
        int[] arr1={1,2,3,4,5,6};
        System.out.println("Arrays:"+Arrays.toString(arr1));
        leftRotateDTime(arr1,3);
        System.out.println("Rotate Arrays by 3:"+Arrays.toString(arr1));


    }


    /*
        Time Complexity: theta(d+n-d+n)= theta(2n)
        Auxilary Space: theta(1)
     */
    static void leftRotateDTime(int[] arr, int d){

        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);

    }

    static void reverse(int[] arr, int low,int high){
        while (low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;

        }
    }

    static void leftRotationByOne(int[] arr){
        int temp=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
    }

}
