package org.dsf.StringProblem;

public class MarExploration {

    // Complete the marsExploration function below.
    static int marsExploration(String s) {

        int result=0;

        char[] arr=s.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]!='S'){
                ++result;
            }
            if(arr[i+1]!='O'){
                ++result;
            } if(arr[i+2]!='S'){
                ++result;
            }
            i+=2;
        }

        return result;

    }

    public static void main(String[] args) {

        String s="SOSSOSSOS";
        System.out.println(marsExploration(s));

    }
}
