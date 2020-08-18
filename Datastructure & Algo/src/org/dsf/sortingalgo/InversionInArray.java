package org.dsf.sortingalgo;

public class InversionInArray {

    static int inversionCount(int[] arr){
        int res=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    ++res;
                }
            }
        }
        return res;
    }

    static int contInversion(int a[],int l,int r){
        int res=0;
        if(r>l){
            int m=l+(r-l)/2;
            res+=contInversion(a, l,m);
            res+=contInversion(a, m+1,r);
            res+=countAndMerge(a,l,m,r);
        }
        return res;
    }

    static int countAndMerge(int[] a,int l,int m,int r){
        int res=0;
        int n1=m-l+1,n2=r-m;
        int[] left=new int[n1];
        int[] right=new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i]=a[l+i];
        }
        for (int i = 0; i < n2; i++) {
            right[i]=a[m+1+i];
        }

        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if (left[i] <= right[j]) {
                a[k]=left[i];
                i++;
            }else if(left[i] > right[j]){
                a[k]=right[j++];
                res=res+(n1-i); // a[j] < a[i] (Inversion will be create from ith element to n1 element in array.)
            }
            ++k;
        }
        while (i<n1){
            a[k]=left[i++];
            k++;
        }
        while (j<n2){
            a[k]=right[j++];
            k++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={2,4,1,3,5};
        System.out.println("Inversion count(Naive) is : "+inversionCount(arr));
        System.out.println("Inversion count(Efficient) is : "+contInversion(arr,0,arr.length-1));
    }
}
