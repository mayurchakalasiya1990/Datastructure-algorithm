package com.test;

import java.util.Arrays;

public class TestClass {

    public static void main(String[] args) {
        int[] arr= {2,6,4,5,7};
        System.out.println(solve(arr.length,arr));
        System.out.println(Arrays.toString(arr));

    }

    static String solve(int N,int[] arr){
        String result="Yes";
        int x= (int) Arrays.stream(arr).mapToLong(v->v).max().orElse(0);
        System.out.println(x);
        int temp1=0;
        for (int i = 0; i < N; i++) {

            if((i+1)<N && arr[i]>=arr[i+1]){
                temp1=(arr[i]-arr[i+1])+1;
                if( temp1 <= x){
                    arr[i]-=temp1;
                    temp1=0;
                }else{
                    return "No";
                }
            }
        }
        return result;
    }
}
