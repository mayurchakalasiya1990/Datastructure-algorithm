package com.dsf.sortingalgo.partionalog;

import java.util.Arrays;

public class QuickSortUsingLomuto {


    static void qSort(int arr[],int l,int h){

        if(l<h){
            int p=LomutoPartition.lPartition(arr,l,h);
            qSort(arr,l,p-1); // p-1 because in lomuto partition pivot is placed at correct position after partiton completed.
            qSort(arr,p+1,h);
        }
    }

    public static void main(String[] args) {

        int arr[]={8,4,7,9,3,10,5};
        System.out.println("Arrays:"+Arrays.toString(arr));
        qSort(arr,0,arr.length-1);
        System.out.println("Arrays after Quick soft:"+Arrays.toString(arr));

    }
}
