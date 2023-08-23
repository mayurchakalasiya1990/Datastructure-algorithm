package com.algo.part1.sorting;

public class ShellSort {
    public static void sort(int[] arr){
        int N=arr.length;
        int h=1;
        while(h<N/3){
            h=3*h+1;
        }
        while(h>=1){
            for (int i = h; i <N ; i++) {
                for (int j = i; j >=h && (arr[j]<arr[j-h]) ; j-=h) {
                    swap(arr,j,j-h);
                }
            }
            h=h/3;
        }
    }
    public static void swap(int[] arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
