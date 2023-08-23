package com.dsf.array;

import java.util.Arrays;

public class NbonacciNumber {

/*
0,0,1,1,2
 */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nBonacciNumner(3,8)));
    }

    static int[] nBonacciNumner(int n,int m){
        int[] res=new int[m];
        res[n-1]=1;
        for (int i = n; i < m; i++) {
            for (int j = i-n; j < i; j++) {
                res[i]+=res[j];
            }
        }
        return res;
    }

    static void bonacciseries(int n, int m)
    {

        // Assuming m > n.
        int a[] = new int[m];
        for(int i = 0; i < m; i++)
            a[i] = 0;

        a[n - 1] = 1;
        a[n] = 1;

        // Uses sliding window
        for (int i = n + 1; i < m; i++)
            a[i] = 2 * a[i - 1] - a[i - n - 1];

        // Printing result
        for (int i = 0; i < m; i++)
            System.out.print(a[i] + " ");
    }
}
