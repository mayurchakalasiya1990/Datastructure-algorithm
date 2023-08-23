package com.dsf.sortingalgo;

import java.util.Arrays;

public class MergeFuncOfMergeSort {

    static void merge(int[] arr,int l,int m,int h){

        int n1=m-l+1;
        int n2=h-m;
        int[] left=new int[n1];
        int[] right=new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i]=arr[l+i];
        }

        for (int i = 0; i < n2; i++) {
            right[i]=arr[m+1+i];
        }

        int i=0,j=0,k=l;

        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k++]=left[i];
                i++;
            }else{
                arr[k++]=left[j];
                j++;
            }
        }

        while(i<n1){
            arr[k++]=left[i++];
        }

        while(j<n2){
            arr[k++]=right[j++];
        }

    }


    public static void main(String[] args) {
        int[] arr={10,20,30,50,1,3,5,6,8,9};
        merge(arr,0,0+(arr.length-0)/2,arr.length);
        System.out.println(Arrays.toString(arr));
    }

}
