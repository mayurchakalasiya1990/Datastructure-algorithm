package org.dynamicprogramming;

import java.util.HashMap;

public class Fibonaci {


    public static void main(String[] args) {
        HashMap<Long,Long> memo=new HashMap();
        System.out.println("Fibo number:"+fibo(100,memo));
        System.out.println(memo);

    }

    /*public static int fibo(int n){
        if(n<=2) return 1;
        return fibo(n-1)+fibo(n-2);
    }*/

    public static long fibo(int n, HashMap memo){

        if(n<=2) return 1;
        if(memo.get(n)!=null) return (long)memo.get(n);
        memo.put(n, fibo(n-1,memo) + fibo(n-2,memo));
        return (long)memo.get(n);
    }
}
