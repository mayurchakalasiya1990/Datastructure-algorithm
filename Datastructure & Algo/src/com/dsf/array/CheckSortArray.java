package com.dsf.array;

public class CheckSortArray {

    public static void main(String[] args) {
        int[] arr={};
        System.out.println("is Sorted Array?:"+isArraySorted(arr));
    }

    static boolean isArraySorted(int arr[]){

        for (int i = 0; i < arr.length; i++) {
            if((i+1)<arr.length-1 && (arr[i+1]-arr[i])<0){
                return false;
            }
        }
        return true;
    }
}
