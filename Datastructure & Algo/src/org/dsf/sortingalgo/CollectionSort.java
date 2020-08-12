package org.dsf.sortingalgo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionSort {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();

        list.add(10);
        list.add(70);
        list.add(80);
        list.add(30);
        list.add(20);

        Collections.sort(list);
        System.out.println("Incremental Order Oder:"+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Reverse/Decremental Order Oder:"+list);


        List<Point> points=new ArrayList<>();

        points.add(new Point(2,3));
        points.add(new Point(3,3));
        points.add(new Point(10,3));
        points.add(new Point(1,3));
        Collections.sort(points,new PointComparator());
        System.out.println("Pointers are sorted: "+points);

    }

}

