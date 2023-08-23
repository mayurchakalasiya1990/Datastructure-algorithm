package com.dsf.StringProblem;

public class BeautifulString {

    // Complete the beautifulBinaryString function below.
    static int beautifulBinaryString(String b) {
        int result=0,tempIndex=-1,startIndex=0,endIndex=0;
        String matchStr="010";
        while(b.indexOf(matchStr)!=-1){
            tempIndex=b.indexOf(matchStr);
            //startIndex=tempIndex;
            endIndex=tempIndex+2;
            if(tempIndex+3 == b.length()-1 && b.charAt(tempIndex+3)=='0'){
                b=b.substring(startIndex,endIndex-1)+"0"+b.substring(endIndex+1,b.length());
                ++result;
            }else{
                b=b.substring(startIndex,endIndex-1)+"1"+b.substring(endIndex+1,b.length());
                ++result;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int result=beautifulBinaryString("0101010");
        System.out.println(result);

    }
}
