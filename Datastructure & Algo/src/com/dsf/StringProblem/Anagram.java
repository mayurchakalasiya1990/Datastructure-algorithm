package com.dsf.StringProblem;

import java.util.Arrays;

public class Anagram {


    public static void main(String[] args) {
        String s1="AAACV";
        String s2="CAAVA";
        System.out.println("Is String Anagram?:"+areAnagram(s1,s2));
    }

    static boolean areAnagram(String s1, String s2){

        int[] count =new int[256];

        //Check length
        if(s1.length()!=s2.length())
            return false;
        //check character of both string

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if(count[i]!=0)
                return false;
        }
        return true;
    }

    static boolean areAnagram2(String s1, String s2){

        //Check length
        if(s1.length()!=s2.length())
            return false;
        //check character of both string
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(!s1.equals(s2))
                return false;

        return true;
    }
}
