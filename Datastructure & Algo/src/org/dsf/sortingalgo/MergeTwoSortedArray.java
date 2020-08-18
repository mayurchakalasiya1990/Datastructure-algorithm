package org.dsf.sortingalgo;

import java.util.Arrays;

public class MergeTwoSortedArray {


    static void mergedSortedArrayNaive(int[] a, int[] b, int m, int n){

        int[] c=new int[n+m];

        for (int i = 0; i < m; i++) {
                c[i]=a[i];
         }
        for (int i = 0; i < n; i++) {
            c[m+i]=b[i];
        }
        Arrays.sort(c);
        System.out.println("Merged two Sorted Array: "+Arrays.toString(c));
    }

    static void mergedSortedArray(int[] a, int[] b, int m, int n){

        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                System.out.println(a[i++]);
            }else{
                System.out.println(b[j++]);
            }
        }
        while(i<a.length){
            System.out.println(a[i++]);
        }
        while(j<b.length){
            System.out.println(b[j++]);
        }
    }


    public static void main(String[] args) {

        int[] a={1,2,4,5,7,10,12,17};
        int[] b={10,12,15,16,19,20};
        mergedSortedArrayNaive(a,b,a.length,b.length);
        mergedSortedArray(a,b,a.length,b.length);
    }

}
