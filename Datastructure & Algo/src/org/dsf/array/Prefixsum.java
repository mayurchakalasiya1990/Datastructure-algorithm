package org.dsf.array;

import java.util.Arrays;

public class Prefixsum {

    public static void main(String[] args) {
        int[] arr={2,8,3,9,6,5,4};
        System.out.println("Prefix sum Array:"+Arrays.toString(prefixSum(arr)));
        System.out.println("getSum from 0 to 2:"+getSum(arr,0,2));
        System.out.println("getSum from 1 to 6:"+getSum(arr,1,6));
    }


    static int getSum(int[] arr, int start, int end){
        int res=-1;
        int[] preFixSum=prefixSum(arr);
        if(start!=0){
            res=preFixSum[end]-preFixSum[start-1];
        }else{
            res=preFixSum[end];
        }
        return res;
    }

    static int[] prefixSum(int[] arr){
        int[] prefSum=new int[arr.length];
        prefSum[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefSum[i]=prefSum[i-1]+arr[i];
        }
        return prefSum;
    }

}
