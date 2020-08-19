package org.dsf.sortingalgo.partionalog;

import java.util.Arrays;

/*
*  1) last element of Array is alawys Pivote.
*  2) if pivote is not last element then we exchange pivote and last element and perform lomuto partition.
* */
public class LomutoPartition {

    static int lPartition(int arr[],int l,int h){

        int pivot=arr[h];
        int j=l-1;
        for (int i = l; i <= h-1; i++) {
            if(arr[i]<pivot){
                ++j;
                swap(arr,j,i);
            }
        }
        swap(arr,j+1,h);
        return j+1;
    }

    static void swap(int[] arr,int j,int i){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }


    public static void main(String[] args) {
        int[] arr={10,80,30,90,40,50,70};

        System.out.println("Array :"+Arrays.toString(arr));

        lPartition(arr,0,arr.length-1);

        System.out.println("After Lomuto Partition:"+Arrays.toString(arr));
    }

}
