package org.dsf.array;


/*
An interesting array problem to find the length of the longest subarray that has alternating even odd elements.

 */
public class MAXLengthOddEvenSubArray {


    public static void main(String[] args) {

    }

    public  int maxOddEven(int[] arr){

        int curr=1;
        int res=0;
        for (int i = 1; i < arr.length; i++) {

            if((arr[i-1]%2==0 && arr[i]%2!=0) ||
                    (arr[i-1]%2!=0 && arr[i]%2==0)){
                curr++;
                res=Math.max(res,curr);
            }else{
                curr=1;
            }
        }
        return res;
    }
}
