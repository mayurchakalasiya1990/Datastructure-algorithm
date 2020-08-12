package org.dsf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {


    static int pageCount(int n, int p) {
        /*
         * Write your code here.
         */
        int result  =0;
        double total=n;
        double temp=0;
        if((total/2)>p){
            temp=p/2;
        }else{
            temp=(n-p)/2;
        }
        result=(int)((temp<1 && temp>0)?1:temp);
        return result;
    }

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int totalPairs=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((ar[i]+ar[j])%k==0){
                    ++totalPairs;
                }
            }
        }

        return totalPairs;

    }


    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        List<Integer> visitedItem=new ArrayList<Integer>();
        int maxArrayCnt=0,currArrayCnt=0;
        for(int i=0;i<a.size();i++){
            currArrayCnt=1;
            if(visitedItem.contains(a.get(i))){
                continue;
            }
            for(int j=i+1;j<a.size();j++){
                if(Math.abs(a.get(i).intValue()-a.get(j).intValue())<=1){
                    ++currArrayCnt;
                }
            }
            visitedItem.add(a.get(i));
            if(maxArrayCnt<currArrayCnt){
                maxArrayCnt=currArrayCnt;
            }

        }
        return maxArrayCnt;
    }

    static int[] climbingLeaderboard(int[] scores, int[] alice) {

        int[] result=new int[alice.length];
        int[] scoreBoard=new int[scores.length];

        int rank=1,rScore=scores[0];
        scoreBoard[0]=rank;
        for (int i = 1; i <scores.length ; i++) {
            if(rScore>scores[i]){
                ++rank;
                scoreBoard[i]=rank;
                rScore=scores[i];
            }else if(rScore==scores[i]){
                scoreBoard[i]=rank;
            }
        }
        System.out.println(Arrays.toString(scoreBoard));
        int j = scores.length-1;
        for (int i = 0; i < alice.length; i++) {

            for (j = j; j >=0; j--) {
                if(alice[i]<scores[j]){
                    result[i]=scoreBoard[j]+1;
                    //innetCnt=j;
                    break;
                }else if(alice[i]==scores[j]){
                    result[i]=scoreBoard[j];
                    //innetCnt=j;
                    break;
                }/*else{
                    if(scoreBoard[j]-1 == 0){
                        result[i]=scoreBoard[j];
                    }else{
                        result[i]=scoreBoard[j]-1;
                    }
                    innetCnt=j;
                    break;
                }*/
            }
            if(j==-1){
                result[i]=1;
            }
            //j=innetCnt-1;
        }
        return result;
    }


    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // Write your code here
        List<Integer> result=new ArrayList<Integer>();
        int iVal=0,jVal=0;
        boolean flag=false;
        for(int i=0;i<s.size();i++){
            iVal=s.get(i).intValue();
            flag=false;
            for(int j=i+1;j<s.size();j++){
                jVal=s.get(j).intValue();
                if((iVal+jVal)%k!=0){
                    if(!result.contains(jVal)) {
                        result.add(jVal);
                        flag=true;
                    }
                }
            }
            if(flag && !result.contains(iVal)){
                result.add(iVal);
            }
        }

        System.out.println(result);

        for (int i = 0; i < result.size(); i++) {
            for (int j = i+1; j < result.size(); j++) {
                if(result.get(i).intValue()+result.get(j).intValue()%k!=0){
                    System.out.println(result.get(i).intValue()+"%"+result.get(j).intValue()+"="+result.get(i).intValue()+result.get(j).intValue()%k);
                }
            }
        }
        return result.size();
    }


    private static final String[] tensNames = {
            "",
            "ten",
            "twenty",
    };

    private static final String[] numNames = {
            "",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen"
    };
    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) {
        String timeinWords="";

        if(m==0){
            timeinWords=numNames[h]+"O' clock ";
        }else if(m==15){
            timeinWords="quarter past "+numNames[h];
        }else if(m==30){
            timeinWords="half quarter "+numNames[h];
        }else if(m==45){
            timeinWords="quarter to "+numNames[h++];
        }else{
            String str1="",str2="";
            if(m>30){
                m=60-m;
                h++;
                str1=" to "+numNames[h];
            }else{
                str1=" past "+numNames[h];
            }

            if(m<20){
                if(m==1){
                    str2=numNames[1]+" minute ";
                }else{
                    str2=numNames[1]+" minutes ";
                }
            }else{
                str2=tensNames[m/10]+" "+numNames[m%10]+" minutes";
            }
            timeinWords=str2+str1;
        }

        return timeinWords;
    }


    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int temp=0,temp1=0;
        int m=0;
        int[] result=new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
           if(a.length==k){
               result[i]=a[queries[i]];
           }else{
               if((queries[i]+k-1)<a.length){
                   System.out.println("queries[i]+k-1:"+(queries[i]+k-1));
                    result[i]=a[queries[i]+k-1];
               }else{
                   System.out.println("queries[i]+k-1:"+(Math.abs(a.length-(queries[i]+k-1))));
                   result[i]=a[Math.abs(a.length-(queries[i]+k-1))];
               }
           }
        }
        return result;
    }

    // Complete the findDigits function below.
    static int findDigits(int n) {

        int n1=n;
        int count=0,temp=0;
        while(n>0){
            temp=n % 10;
            n = n / 10;
            if(temp!=0 && n1%(temp)==0){
                ++count;
            }
        }
        return count;

    }
    public static void main(String[] args) throws IOException {


        //int n = 6;

        //int p = 5;
//        int result = pageCount(n, p);

        //System.out.println(result);

     /*   int n = 6;
        int k = 3;
        int[] ar = {1, 3, 2, 6, 1, 2};


        int result = divisibleSumPairs(n, k, ar);*/

        /*List<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(2);
        a.add(3);
        a.add(1);
        a.add(2);

        int result = pickingNumbers(a);
        */

     /*   int[] scores = {100,90,90,80,75,60};
        int[] alice = {50,65,77,90,102};

        int[] result = climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
*/
/*
        int k=7;
        List<Integer> s = new ArrayList<>();
        //278 576 496 727 410 124 338 149 209 702 282 718 771 575 436
        s.add(278);
        s.add(576);
        s.add(496);
        s.add(727);
        s.add(410);
        s.add(124);
        s.add(338);
        s.add(149);
        s.add(209);
        s.add(702);
        s.add(282);
        s.add(718);
        s.add(771);
        s.add(575);
        s.add(436);
*/

//        int result = nonDivisibleSubset(k, s);
//        System.out.println(timeInWords(5,45));

     /*   int[] a = {10160,27429,61174,92314,90626,66576,13013,3055,28071,13366,48292,83192,376,63276,35825,39497,39701,46967,95656,92257,31122,91431,72587,78900,77935,27666,52875,56477,89913,43214,32042,16424,70643,9567,25090,61268,76142,38102,80674,4212,67819,45317,3756,68194,8592,39580,24042,64644,2898,36050,73252,34020,27480,62191,12919,5415,6208,82146,78243,12472,25359,10284,28896,12353,36202,53985,89973,12343,8438,86998,32907,76257,32315,36662,60802,57258,92593,84844,38254,95490,37245,11505,45861,81076,73695,58780,86490,96254,57277,81085,8726,98987,7720,53973,11340,43922,24309,17664,56264,32746,4661,89170,25354,53327,42183,86156,10585,34775,87351,48838,30265,24595,76694,76125,5670,66741,51256,8512,62994,8532,5948,88071,23871,13667,42043,51562,73940,66351,69225,46556,15449,73885,35725,40802,43564,94260,43309,54148,29034,30659,19337,59298,71605,96030,51775,93627,79122,3030,18490,42116,27914,40789,30186,51784,54455,88581,3345,44747,54931,88921,91302,86731,79157,43378,43885,22720,37637,87193,93219,66671,17852,12555,42320,5808,24937,94094,15786,4058,13476,34275,62525,57741,75063,9063,9524,45870,97643,29220,6968,68925,34492,98269,55656,13648,57998,99540,52720,95635,86732,45938,78657,20935,74845,37328,43095,99781,47774,58880,20190,61249,9507,99067,35341,84569};
        int k=1;
        int[] queries = {76,39,57,212,202,210,14,47,188,183,178,78,148};

        int[] result = circularArrayRotation(a, k, queries);

        System.out.println(Arrays.toString(result));
*/

        System.out.println(findDigits(1024));

    }
}
