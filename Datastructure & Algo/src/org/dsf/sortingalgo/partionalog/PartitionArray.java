package org.dsf.sortingalgo.partionalog;
import java.util.Arrays;
public class PartitionArray {


    static void partition(int[] arr, int l,int h, int p){

        int temp[]=new int[h-l+1];
        int index=0;

        for (int i = l; i <=h; i++) {
            if(arr[i]<=arr[p]){
                temp[index]=arr[i];
                index++;
            }
        }
        for (int i = l; i <=h; i++) {
            if(arr[i]>arr[p]){
                temp[index]=arr[i];
                index++;
            }
        }
        for (int i = l; i <=h; i++) {
            arr[i]=temp[i-l];
        }
        //System.out.println(Arrays.toString(temp));
    }

    public static void main(String[] args) {
        int arr[] ={5,13,6,9,12,11,8};
        int p=6; // partition around element pth
        partition(arr,0,arr.length-1,p);
        System.out.println("After Partition Around Element "+arr[p]);
        System.out.println(Arrays.toString(arr));
    }
}
