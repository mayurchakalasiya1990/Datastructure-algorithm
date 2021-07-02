package org.algo.part1.sorting;
import java.util.Arrays;
public class SelectionSort {

    public static void sort(int[] a){
        int min=0;
        for (int i = 0; i < a.length; i++) {
            min = i;
            //find minimum value from loop
            System.out.println("--i--:"+i);
            for (int j = i+1; j < a.length; j++) {
                System.out.println("j:"+j+" min:"+min);
                if(a[j]<a[min]){
                    min = j;
                }
            }
            swap(a,i,min);
        }
    }
    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static void main(String[] args) {
        int[] arr={5,4,3,2,1,0};

        System.out.println("Before Sorting:"+Arrays.toString(arr));
        sort(arr);
        System.out.println("After Sorting:"+Arrays.toString(arr));
    }

}
