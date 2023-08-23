package com.dynamicprogramming;

import java.util.HashMap;

public class GridTraveller {
    public static void main(String[] args) {

        HashMap<String,Long> memo=new HashMap<>();
        System.out.println("Grid Traveller:"+gridTraveller(3,3,memo));
        System.out.println("Grid Traveller:"+gridTraveller(18,18,memo));

    }

    /*
        Time Complexity: O(m*n)
        Space Complexity: O(m+n)
     */
    public static long gridTraveller(int m, int n, HashMap memo){
        String key=m+" "+n;
        //memorization
        if(memo.get(key)!=null) return (long)memo.get(key);
        //Base case
        if(m == 0 || n == 0) return 0;
        if(m==1 && n==1) return 1;

        //memorization
        memo.put(key,gridTraveller(m-1,n, memo) + gridTraveller(m,n-1,memo));
        return (long)memo.get(key);
    }

    /*
        Time Complexity: O(2^(n+m))
        Space Complexity: O(n+m)
     */
    public static long gridTravellerRecur(int m, int n){
        if(m == 0 || n == 0) return 0;
        if(m==1 && n==1) return 1;
        return gridTravellerRecur(m-1,n) + gridTravellerRecur(m,n-1);
    }
}
