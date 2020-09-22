package org.dsf.array;

import java.util.Arrays;

public class RemoveElementFromArray {

    public static void main(String[] args) {

        int arr[]={10,20,20,30,30,30};
        System.out.println("Array:"+Arrays.toString(arr));
        System.out.println("Size of Array After Removed duplicate:"+removeDuplicateFromArray(arr));
        System.out.println("Array:"+Arrays.toString(arr));
    }

    public static int removeDuplicateFromArray(int[] arr){
        int[] temp=new int[arr.length];
        temp[0]=arr[0];
        int res=1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=temp[res-1]){
                temp[res]=arr[i];
                res++;
            }
        }
        for (int i = 0; i < res; i++) {
            arr[i]=temp[i];
        }
        return res;
    }
}
