package org.dsf.array;
/*
Frequencies in A Sorted Array

 */
public class FrequencyInArray {

    public static void main(String[] args) {
        int[] arr={30};
        frequencies(arr);
    }

    static void frequencies(int[] arr){
        int matchCnt=1;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]!=arr[i+1]){
                System.out.println(arr[i]+":"+matchCnt);
                matchCnt=0;
            }
            matchCnt++;
        }
        System.out.println(arr[arr.length-1]+":"+matchCnt);
    }
}
