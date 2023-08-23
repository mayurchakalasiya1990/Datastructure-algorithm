package com.dsf.sortingalgo.partionalog;
import java.util.Arrays;

/*

    1)  pivot is first element.
    2)  pivot is not its actually place after partition.
* */
public class HoarePartition {

    static int hPartition(int[] arr, int l,int h){

        int i=l-1,j=h+1,pivot=arr[l];

        while(true){
            do{
                i++;
            }while (arr[i]<pivot);
            do{
                j--;
            }while (arr[j]>pivot);

            if(i>=j) return j;
            swap(arr,i,j);
        }
    }

    static void swap(int[] arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    public static void main(String[] args) {
        int[] arr={5,3,8,4,2,7,1,10};

        System.out.println("Array:"+Arrays.toString(arr));
        int index=hPartition(arr,0,arr.length-1);
        System.out.println("Index:"+index);
        System.out.println("Array After Hoare Partition:"+Arrays.toString(arr));
    }
}
