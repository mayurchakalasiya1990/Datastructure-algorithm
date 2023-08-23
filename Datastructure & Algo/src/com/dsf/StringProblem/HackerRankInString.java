package com.dsf.StringProblem;

public class HackerRankInString {

    // Complete the hackerrankInString function below.
    static String hackerrankInString(String s) {
        String result="NO";
        char[] matchStr="hackerrank".toCharArray();
        char[] sChar=s.toCharArray();
        int m =0;
        for (int i = 0; i < sChar.length; i++) {
            if(sChar[i]==matchStr[m]){
                ++m;
                if(m==matchStr.length-1){
                    result="Yes";
                    break;
                }
            }
        }
        return  result;
    }

    public static void main(String[] args) {

        System.out.println(hackerrankInString("hereiamstackerrank"));
    }
}
