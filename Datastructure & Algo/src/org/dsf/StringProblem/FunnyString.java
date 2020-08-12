package org.dsf.StringProblem;

public class FunnyString {

    // Complete the funnyString function below.
    static String funnyString(String s) {

        String result="Funny";
        int j=s.length()-1;
        char[] sArr=s.toCharArray();
        int temp1=0,temp2=0;
        for (int i = 0; i < sArr.length; i++) {
            if(i!=sArr.length-1 && j!=0){
                temp1=((int)sArr[i+1]-(int)sArr[i]);
                temp2=((int)sArr[j]-(int)sArr[j-1]);
                --j;
                if(Math.abs(temp1)!=Math.abs(temp2)){
                    result="Not Funny";
                    break;
                }
            }
        }
        return result;

    }


    public static void main(String[] args) {
        String result=funnyString("ovyvzvptyvpvpxyztlrztsrztztqvrxtxuxq");
        System.out.println(result);
    }
}
