package com.dsf.sortingalgo;

import java.util.Comparator;

public class PointComparator implements Comparator<Point> {

    @Override
    public int compare(Point o1, Point o2) {
        return o1.x-o2.x;
    }
}
