package com.algo.part1.sorting;

public class Point implements Comparable<Point>{
    public int x;
    public int y;

    @Override
    public int compareTo(Point o) {
        if (this.x>o.x)
                return 1;
        if (this.x<o.x)
            return -1;
        if (this.y>o.y)
            return 1;
        if (this.y<o.y)
            return -1;
        return 0;
    }

    public int countIntersection(Point[] a, Point[] b) {
        sort(a);
        sort(a);
        int i = 0;
        int j = 0;
        int count = 0;

        while (i < a.length && j < b.length) {
            if (a[i].compareTo(b[j]) == 0) {
                count++;
                i++;
                j++;
            }
            else if (a[i].compareTo(b[j]) < 0) i++;
            else j++;
        }
        return count;
    }

    public static void sort(Point[] arr){
        int N=arr.length;
        int h=1;
        while(h<N/3){
            h=3*h+1;
        }
        while(h>=1){
            for (int i = h; i <N ; i++) {
                for (int j = i; j >=h && (arr[j].compareTo(arr[j-h])==-1) ; j-=h) {
                    swap(arr,j,j-h);
                }
            }
            h=h/3;
        }
    }
    public static void swap(Point[] arr, int i,int j){
        Point temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
