package org.dsf.array;

public class InsertElement {


    /*
        time complexity: O(n)
        time complexity: O(n)
     */
    public static void main(String[] args) {

    }


    int insert(int[] arr, int n, int x, int cap, int pos){
        if(n==cap)
            return n;
        int idx=n-1;
        for (int i = n-1; i >= idx; i++) {
            arr[i+1]=arr[i];
        }
        arr[idx]=x;
        return n+1;
    }
}
