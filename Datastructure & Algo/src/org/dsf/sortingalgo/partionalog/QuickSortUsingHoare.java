package org.dsf.sortingalgo.partionalog;
import java.util.Arrays;
public class QuickSortUsingHoare {


    static void qSort(int[] arr, int l,int h){

        if(l<h){
            int p =HoarePartition.hPartition(arr,l,h);
            qSort(arr,l,p);// p because in hoare partition pivot is not placed at correct position after partiton completed.
            qSort(arr,p+1,h);
        }
    }

    public static void main(String[] args) {

        int[] arr={8,4,7,9,3,10,5};
        System.out.println("Arrays: "+Arrays.toString(arr));
        qSort(arr,0,arr.length-1);
        System.out.println("Arrays After Quick sort: "+Arrays.toString(arr));
    }


}
