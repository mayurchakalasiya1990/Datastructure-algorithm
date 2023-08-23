package com.dsf.StringProblem;

public class LeftMostRepeat {

    public static void main(String[] args) {

    }

    public char leftMostRepeatedChar(String s1){
        char resutl='\u0000';
        int CHAR=256;
        char[] count=new char[CHAR];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
        }
        for (int i = 0; i < CHAR; i++) {
            if(count[CHAR]>1)
                return (char)i;
        }
        return resutl;
    }
}
