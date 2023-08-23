package com.dsf.array;

/*
An element is called the leader of an array if there is no element greater than it on the right side.
 */
public class LeaderInArray {

    public static void main(String[] args) {

        int[] arr={7,10,4,3,6,5,2};
        int[] arr1={10,20,30};
        int[] arr3={30,20,10};

    }

    /*
          last element is always lead so start from last element of array.

     */
    public static void leaderOfArray(int[] arr){

        int curr_lead=arr[arr.length-1];
        System.out.println(curr_lead);
        for (int i = arr.length-2; i < 0; i++) {
            if(curr_lead<arr[i]){
                curr_lead=arr[i];
                System.out.println(curr_lead);
            }
        }
    }

}
