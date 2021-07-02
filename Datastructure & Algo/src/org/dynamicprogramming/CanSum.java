package org.dynamicprogramming;


import java.util.HashMap;

/*
Write a function 'canSum(targetsum, numbers) that takes in targetSum and an array of numbers as arguments.

 */
public class CanSum {

    public static void main(String[] args) {

        System.out.println("Can Sum :"+canSumRecur(7,new int[]{3,1,8}));
        //System.out.println("Can Sum :"+canSumRecur(3000,new int[]{7,14}));
        HashMap<Integer,Boolean> memo=new HashMap<>();
        System.out.println("Can Sum (Memo) :"+canSumMemo(3000,new int[]{10,14},memo));

    }


    public static boolean canSumRecur(int targetSum, int[] arr){

        if(targetSum==0) return true;
        if(targetSum<0) return false;

        for (int i = 0; i < arr.length; i++) {
            int reminderSum=targetSum-arr[i];
            if(canSumRecur(reminderSum,arr)) {
                return true;
            }
        }
        return false;
    }

    public static boolean canSumMemo(int targetSum, int[] arr,HashMap<Integer,Boolean> memo){
        if(memo.get(targetSum)!=null) return (boolean)memo.get(targetSum);
        if(targetSum==0) return true;
        if(targetSum<0) return false;

        for (int i = 0; i < arr.length; i++) {
            int reminderSum=targetSum-arr[i];
            if(canSumMemo(reminderSum,arr,memo)) {
                memo.put(targetSum,true);
                return true;
            }
        }
        memo.put(targetSum,false);
        return false;
    }

    public static int[] howSum(int targetsum,int[] arr){

        if(targetsum==0) return new int[arr.length];

        return null;
    }

}
