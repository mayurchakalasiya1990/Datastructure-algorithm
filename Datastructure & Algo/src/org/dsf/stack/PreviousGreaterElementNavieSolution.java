package org.dsf.stack;

public class PreviousGreaterElementNavieSolution {


    //O(n
    public static void main(String[] args) {
        int[] arr={20,30,10,5,15};
        printPrevGreaterElement(arr);
    }

    static void printPrevGreaterElement(int arr[]){
        for (int i = 0; i < arr.length ;i++) {
            for (int j=i-1; j>=0  ; j--) {
                  if(arr[i]<arr[j]){
                      System.out.println("Value:"+arr[j]);
                      break;
                  }
            }


        }
    }
}
