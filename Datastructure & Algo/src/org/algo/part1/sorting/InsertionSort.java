package org.algo.part1.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }
    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static void main(String[] args) {
        int[] arr={5,4,3,2,1,0};

        System.out.println("Before InsertionSort:"+ Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After InsertionSort:"+Arrays.toString(arr));
    }
}
