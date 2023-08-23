package com.dsf.sortingalgo;

import java.util.Arrays;

public class InsertionSort {

    /*
        1) best case : sorted Array : Time Complexity O(n)
        1) worse case : Reverse sorted Array : Time Complexity O(n^2) theta(n^2)
     */

    static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }

    }

    public static void main(String[] args) {
        int[] arr={20,40,50,60,10,30};
        System.out.println("Array: "+Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }
}
