package com.dsf.StringProblem;

public class Anagram2 {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {

        int[] chArr=new int[256];
        int result=0;
        for(int i=0;i<a.length();i++){
            chArr[a.charAt(i)]++;
            System.out.print(a.charAt(i)+":"+chArr[a.charAt(i)]+" ");
        }
        System.out.println();
        for(int i=0;i<b.length();i++){
            chArr[b.charAt(i)]--;
            System.out.print(b.charAt(i)+":"+chArr[b.charAt(i)]+" ");
        }


        for(int i=0;i<256;i++){
            if(chArr[i]>0 || chArr[i]<0){
                ++result;
            }
        }

        return result;

    }

    public static void main(String[] args) {

        String a="fcrxzwscanmligyxyvym";
        String b="jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        System.out.println();
        System.out.println("a:"+a.length()+" b:"+b.length());
        System.out.println("Result:"+makeAnagram(a,b));

    }




}
