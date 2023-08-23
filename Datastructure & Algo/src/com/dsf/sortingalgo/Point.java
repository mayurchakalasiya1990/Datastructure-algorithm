package com.dsf.sortingalgo;

import java.util.Arrays;

public class Point {

    int x,y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
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
        Arrays.sort(points,(o1, o2) -> {return o1.x-o2.x;});
        System.out.println(Arrays.toString(points));
    }
}
