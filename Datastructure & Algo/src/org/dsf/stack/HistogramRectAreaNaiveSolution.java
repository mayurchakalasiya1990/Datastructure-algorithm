package org.dsf.stack;

public class HistogramRectAreaNaiveSolution {

    public static void main(String[] args) {
        int[] arr={6,2,5,4,1,5,6};
        System.out.println(getMaxArea(arr));
    }

    static int getMaxArea(int arr[]){
        int result=0;
        for (int i = 0; i < arr.length; i++) {
            int curr=arr[i];
            for (int j = i-1; j >= 0; j--) {
                if(arr[i]<=arr[j]){
                    curr+=arr[i];
                }else{
                    break;
                }
            }

            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<=arr[j]){
                    curr+=arr[i];
                }else{
                    break;
                }
            }
            result=Math.max(curr,result);
        }
        return result;
    }
}
