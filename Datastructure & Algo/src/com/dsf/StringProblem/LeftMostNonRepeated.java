package com.dsf.StringProblem;
import java.util.Arrays;

public class LeftMostNonRepeated {
    public static void main(String[] args) {

        String s1="ssvadvaccxdz";
        System.out.println("Non-Repeated Char:"+nonRepeated(s1));
    }

    static char nonRepeated(String s1){

        char result='0';
        int CHAR=256;
        int[] fi=new int[CHAR];
        Arrays.fill(fi,-1);  // no occur
        for (int i = 0; i < s1.length(); i++) {
            if(fi[s1.charAt(i)]==-1){
                fi[s1.charAt(i)]=i; // single occur
            }else{
                fi[s1.charAt(i)]=-2; // more than one occur
            }
        }
        for (int i = 0; i < CHAR; i++) {
            if(fi[i]>-1){
                return (char)i;
            }
        }
        return result;
    }
}
