package com.dsf.recursion;

public class factorial {

    static int factorial(int n){

        if (n==0)
            return 1;
        return n*factorial(n-1);
    }
}
