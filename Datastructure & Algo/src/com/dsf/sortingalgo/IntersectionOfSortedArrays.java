package com.dsf.sortingalgo;

public class IntersectionOfSortedArrays {

    /*
            Time complexity: O(m+n)
            Auxilary: O(1)

            Pre-requisite : Both Arrays must be sorted

     */

    static void intersection(int[] a, int[] b,int n,int m){

        int i=0,j=0;
        while(i<n && j<m){

            if(i>0 && a[i-1]==a[i]) {
                i++;
                continue;
            }
             if(a[i]<b[j]){
                 i++;
             }else if(a[i]>b[j]){
                 j++;
             }else{
                 System.out.println(a[i]);
                 i++;
                 j++;
             }
        }
    }

    public static void main(String[] args) {

        int a[]={3,5,10,10,10,5,15,20};
        int b[]={5,10,10,15,30};

        System.out.println("Intersection point of Sorted Arrays:");
        intersection(a,b,a.length,b.length);
    }

}
