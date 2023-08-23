package com.dsf.recursion;

public class Test {

    static void fun(int n){
        if(n==0)
            return;
        System.out.println("before fun:"+(n-1));
        fun(n-1);
        System.out.println("After fun:"+(n-1));
    }

    public static void main(String[] args) {
        fun(3);
    }
}
