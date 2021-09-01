package org.dsf.array;
/*
Find count of maximum consecutive 1s in a binary array. Two approaches are discussed, one is O(n^2) and other is O(n).
Both of these approaches require O(1) auxiliary space.

 */

import java.util.Arrays;

public class MaxConsecutive1s {


    public static void main(String[] args) {
        int[] arr={0,1,1,0,1,1,1};
        System.out.println("Arrays:"+Arrays.toString(arr));
        System.out.println("MAX 1's:"+max(arr));
    }

    static int  max(int[] arr){
        int curr=0,res=0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]==1){
                ++curr;
                res=Math.max(res,curr);
            }else{
                curr=0;
            }
        }
        return res;
    }
}
