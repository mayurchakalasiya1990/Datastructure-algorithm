package org.dsf.StringProblem;

import java.util.HashMap;
import java.util.Map;

public class WeightedUniform {

    // Complete the weightedUniformStrings function below.
    static String[] weightedUniformStrings(String s, int[] queries) {

        String[] result=new String[queries.length];
        char[] arrChar=s.toCharArray();
        //int[] wStrArry=new int[arrChar.length*26];
        Map<Integer,String> wStrArry=new HashMap<>();
        char temp;
        int wVal=0,j=0,rCnt=0;
        boolean entry=true;
        for (int i = 0; i < arrChar.length; i++) {
            temp=arrChar[i];

            do{
                wVal+=(int)arrChar[i]-96;
                wStrArry.put(wVal,"Yes");
                if(!entry){
                    ++i;
                }
                entry=false;
            }while (i+1<=arrChar.length-1 && arrChar[i+1]==arrChar[i]);
            entry=true;
            wVal=0;
        }

        for (int i = 0; i < queries.length; i++) {
            if(wStrArry.get(queries[i])!=null){
                result[i]="Yes";
            }else{
                result[i]="No";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s="abccddde";
        int[] quieries={1,3,12,5,9,10};
        String[] result=weightedUniformStrings(s,quieries);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
