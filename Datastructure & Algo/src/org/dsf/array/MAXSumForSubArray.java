package org.dsf.array;

/*
Explanation of the Kadane's algorithm.
 */

import java.util.Arrays;
public class MAXSumForSubArray {

    public static void main(String[] args) {

        int[] arr={-5,1,-2,3,-1,2,-2};
        System.out.println("Arrays:"+Arrays.toString(arr));
        System.out.println("Max sum of SubArray:"+maxSum(arr));
        System.out.println("Max sum of SubArray:"+maxSubArraySum(arr));

    }


    /*
           Time Complexity :O(n^2)
     */
    static int maxSum(int[] arr){
        int res=arr[0];
        for (int i = 0; i < arr.length; i++) {
            int curr=0;
            for (int j = i; j < arr.length-1; j++) {
                curr+=arr[j];
                res=Math.max(curr,res);
            }
        }
        return res;
    }

    static int maxSubArraySum(int arr[]){
        int res=arr[0];
        int maxEnding=arr[0];
        for (int i = 1; i < arr.length-1; i++) {
            maxEnding=Math.max(maxEnding+arr[i],arr[i]);
            res=Math.max(res,maxEnding);
        }
        return res;
    }
}
