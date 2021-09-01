package org.dsf.sortingalgo;

import java.util.Arrays;

public class MergeSort {


    static void mergedSort(int[] arr,int l, int r){
        if(r>l){
            int m=l+(r-l)/2;
            mergedSort(arr,l,m);
            mergedSort(arr,m+1,r);
            merge(arr,l,m,r);

        }
    }

    static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining el   nts of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    public static void main(String[] args) {

        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array");
        System.out.println(Arrays.toString(arr));

        MergeSort ob = new MergeSort();
        mergedSort(arr,0,arr.length-1);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(arr));

    }
}
