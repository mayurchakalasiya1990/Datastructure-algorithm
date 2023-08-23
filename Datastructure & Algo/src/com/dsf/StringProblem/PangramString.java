package com.dsf.StringProblem;

public class PangramString {

    // Complete the pangrams function below.

    static String pangrams(String s) {

        String result="pangram";
        char[] letter=s.toCharArray();
        int[] ascii=new int[122];
        int val=0,letterCnt=0;
        for (int i = 0; i < letter.length; i++) {
            val=(int)letter[i];
            if(val>=65 && val<=90){
                if(ascii[val]==0){
                    ascii[val]=1;
                    ++letterCnt;
                }
            }else if(val>=97 && val<=122){
                val=val-32;
                if(ascii[val]==0){
                    ascii[val]=1;
                    ++letterCnt;
                }
            }
        }
        if(letterCnt!=26){
            result="no pangram";
        }

        return result;
    }


    public static void main(String[] args) {

        String s="We promptly judged antique ivory buckles for the prize";
        System.out.println(pangrams(s));

    }
}
