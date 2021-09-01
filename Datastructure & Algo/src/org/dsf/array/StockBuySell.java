package org.dsf.array;

public class  StockBuySell {


    public static void main(String[] args) {
        int[] arr={1,5,3,8,12};
        System.out.println("Calculate Max Profit:"+maxProfit(arr));
    }


    /*
        When price increase calculate profit and add to profit.
        when there is no-profit, skip the profit calculation.
     */
   static int maxProfit(int[] arr){

       int profit=0;
       for (int i = 1; i < arr.length; i++) {
           if(arr[i]>arr[i-1]){
               profit+=(arr[i]-arr[i-1]);
           }
       }
       return profit;

    }
}
