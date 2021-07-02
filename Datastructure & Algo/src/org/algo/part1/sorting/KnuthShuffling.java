package org.algo.part1.sorting;

import java.util.Random;
import java.util.Arrays;
public class KnuthShuffling {

    public static void shuffle(int[] a){
        for (int i = 0; i < a.length; i++) {
            int r= new Random().nextInt(i+1);
            swap(a,i,r);

        }
    }
    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static void main(String[] args) {
        int[] arr=new int[52];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
        }
        System.out.println("Array:"+Arrays.toString(arr));
        shuffle(arr);
        System.out.println("After Shuffle:"+Arrays.toString(arr));
    }


}
