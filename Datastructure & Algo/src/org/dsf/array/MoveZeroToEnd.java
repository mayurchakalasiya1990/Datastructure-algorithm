package org.dsf.array;

import java.util.Arrays;

public class MoveZeroToEnd {

    static void moveZeroToEnd(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[j]!=0){
                         swapElement(arr,i,j);
                    }
                }
            }
        }
    }

    static void moveZeroToEndEff(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                swapElement(arr,i,count);
                count++;
            }
        }
    }


    static void swapElement(int[] arr,int i, int j){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
    }




    public static void main(String[] args) {

        int[] arr={10,12,0,0,2,5};
        System.out.println("Arrays:"+Arrays.toString(arr));
        moveZeroToEndEff(arr);
        System.out.println("move Zero to End:"+Arrays.toString(arr));
    }
}
