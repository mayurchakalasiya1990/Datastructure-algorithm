package org.dsf.array;

/*
Maximum Difference problem is to find the maximum of arr[j] - arr[i] where j>i.

 */

import java.util.Arrays;
public class MaxDiffInArray {

    public static void main(String[] args) {
        int[] arr={2,3,10,6,4,8,1};
        System.out.println("Arrays:"+Arrays.toString(arr));
        System.out.println("Max Diff:"+maxDiff(arr));
    }

    /*
          1) curr element - min is greater than res than update result
          2) update min for each and every iteration
     */
    public static int maxDiff(int[] arr){
        int res=arr[1]-arr[0];
        int min=arr[0];
        for (int i = 1; i < arr.length-1; i++) {
            res=Math.max(res,arr[i]-min);
            min=Math.min(min,arr[i]);
        }
        return res;
    }
}
