package org.dsf.recursion;

public class PrintNNumber {

    static void printN1(int n){
        if(n<=0)
            return;
        System.out.println(n);
        printN1(n-1);
    }

    //Tail recursion
    static void print1N(int n){
        if(n<=0)
            return;

        print1N(n-1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        printN1(-2);
        print1N(5);
    }

}
