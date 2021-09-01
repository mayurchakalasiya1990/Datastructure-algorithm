package org.dsf.array;

public class LargestElement {

    /*
        Time complexity is : O(n)
     */

    public static void main(String[] args) {
        int [] arr={1,2,3,12,3,21,3,10};
        System.out.println("Largest element in Array:"+getLargestElement(arr));
        System.out.println("2nd Largest element in Array:"+get2ndLargestElement(arr));
        System.out.println("2nd Largest element in Array Using Efficient Solution:"+get2ndLargestElementEfficient(arr));
    }

    static int getLargestElement(int[] arr){
        int res=0;
        int index1=-1;
        for (int i = 0; i < arr.length; i++) {
            if(res<arr[i]){
                index1=i;
                res=arr[i];
            }
        }
        //System.out.println("Index of Largest Element:"+index1);
        return res;
    }

    static int get2ndLargestElement(int[] arr){
        int max=getLargestElement(arr);
        int res=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=max){
                if (res==-1){
                    res=i;
                }else if(arr[i]>arr[res]){
                    res=i;
                }
            }
        }
        return res;
    }

    static int get2ndLargestElementEfficient(int[] arr){
        int res=-1;
        int largest=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[largest]<arr[i]){
                res=largest;
                largest=i;
            }else if(arr[i]!=arr[largest]){
                if(res==-1 || arr[i]>arr[res]){
                    res=i;
                }
            }
        }
        //System.out.println("Index of Largest Element:"+index1);
        return res;
    }
}
