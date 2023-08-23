package com.algo.part1.sorting;
import java.util.Arrays;
public class PermutationTest {

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

    public static boolean isPermutationArrays(int[] arr1, int[] arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        insertionSort(arr1);
        insertionSort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1={1,2,4,6,8};
        int[] arr2={4,8,2,6,0};
        System.out.println("Array1: "+Arrays.toString(arr1));
        System.out.println("Array1: "+Arrays.toString(arr2));
        System.out.println("is both permutation of each other ?:"+isPermutationArrays(arr1,arr2));
    }
}
