package com.dsf.sortingalgo;

import java.util.ArrayList;
import java.util.Arrays;

public class UnionOfSortedArrays {

    static void unionNaive(int a[],int b[],int m, int n){
        int[] c=new int[n+m];
        int k=0;
        for (int i = 0; i < m; i++) {
            c[k++]=a[i];
        }
        for (int i = 0; i < n; i++) {
            c[k++]=b[i];
        }
        Arrays.sort(c);
        for (int i = 0; i < c.length; i++) {
            if(i==0 || c[i-1]!=c[i]){
                System.out.println(c[i]);
            }
        }
    }


    static void union(int a[],int b[],int m, int n){
        int i=0,j=0;

        while(i<m && j<n){

            if(i>0 && a[i-1]==a[i]){
                i++;
                continue;
            }
            if(j>0 && b[j-1]==b[i]){
                j++;
                continue;
            }

            if(a[i]<b[j]){
                System.out.println(a[i++]);
            }else if(a[i]>b[j]){
                System.out.println(b[j++]);
            }else{
                System.out.println(a[i++]);
                j++;
            }
        }

        while (i<m){
            System.out.println(a[i++]);
        }

        while (j<n){
            System.out.println(b[j++]);
        }
    }

    public static void main(String[] args) {
        int[] a={3,8,10};
        int[] b={2,8,9,10,15};

        System.out.println("Union of two Arrays:");
        //unionNaive(a,b,a.length,b.length);
        union(a,b,a.length,b.length);

    }


}
