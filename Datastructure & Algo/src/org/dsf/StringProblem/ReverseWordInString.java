package org.dsf.StringProblem;
import java.util.Arrays;

public class ReverseWordInString {
    public static void main(String[] args) {
        String st1="My name is mayur.";
        //char[] ch=st1.toCharArray();
        reveseWord(st1);
        //System.out.println(String.valueOf(ch));
    }

    /*
        1) Reverse words mayur => ruyam
        2) reverse full String 

     */

    static void reveseWord(String str){

        char[] sChar=str.toCharArray();
         int start=0,end=0;
        for (end = 0; end < sChar.length; end++) {
            if(sChar[end]==' '){
                reverse(sChar,start,end-1);
                start=end+1;
            }
        }
        reverse(sChar,start,sChar.length-1);
        reverse(sChar,0,sChar.length-1);
        System.out.println(String.valueOf(sChar));

    }

    static void reverse(char[] str,int low,int high){
        while(low<=high){
            char temp=str[low];
            str[low]=str[high];
            str[high]=temp;
            high--;
            low++;
        }
    }

}
