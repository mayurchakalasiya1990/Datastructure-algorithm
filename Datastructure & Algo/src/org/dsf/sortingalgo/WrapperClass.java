package org.dsf.sortingalgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class WrapperClass {

    public static void main(String[] args) {
        Integer arr[]={10,3,5,20};
        //Arrays.sort(arr); // Incremental oder of Array Sorting
        //Arrays.sort(arr, Collections.reverseOrder()); //Reverse Oder, Decremental order
        Arrays.sort(arr,(o1,o2)->{ // Even-odd Order Sorting
            return o1%2 - o2%2;
        });
        System.out.println(Arrays.toString(arr));
    }
}
