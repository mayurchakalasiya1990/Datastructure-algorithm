package org.dsf.StringProblem;


/*
Given a text and a pattern, the task is to find if there is anagram of pattern present in text.


 */
public class AnagramSearch {


    public static void main(String[] args) {

        String txt="mayur V chakalasiya";
        String pttrn="v chakal";
        System.out.println("txt:"+txt+" Pattern:"+pttrn);
        System.out.println("is Pattern Present? :"+isPresent(txt,pttrn));
    }

    static boolean isPresent(String txt, String pttrn){

        int[] CT=new int[256];
        int[] CP=new int[256];

        //fill pattern array and txt array
        for (int i = 0; i < pttrn.length(); i++) {
            CT[txt.charAt(i)]++;
            CP[pttrn.charAt(i)]++;
        }

        for (int i = pttrn.length(); i < txt.length(); i++) {

            //Match Pattern Array and TXT array
            if(areSame(CT,CP)){
                return true;
            }
            //Sliding Window...
            CT[txt.charAt(i)]++;
            CT[txt.charAt(i-pttrn.length())]--;
        }
        return false;
    }

    static boolean areSame(int[] CT,int[] CP){
        for (int i = 0; i < CP.length; i++) {
            if(CP[i]!=CT[i]){
                return false;
            }
        }
        return true;
    }
}
