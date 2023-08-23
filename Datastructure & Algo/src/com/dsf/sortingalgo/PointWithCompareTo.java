package com.dsf.sortingalgo;

import java.util.Arrays;

public class PointWithCompareTo implements Comparable<PointWithCompareTo>{

    int x,y;
    PointWithCompareTo(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public int compareTo(PointWithCompareTo o) {
        return this.x-o.x;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        PointWithCompareTo[] points={new PointWithCompareTo(2,1),new PointWithCompareTo(3,1),new PointWithCompareTo(1,2)};
        Arrays.sort(points);
        System.out.println(Arrays.toString(points));
    }
}
