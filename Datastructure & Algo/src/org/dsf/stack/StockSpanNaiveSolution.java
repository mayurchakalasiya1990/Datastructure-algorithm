package org.dsf.stack;

public class StockSpanNaiveSolution {

    public static void main(String[] args) {

        int[] arr={15,13,12,14,16,8,6,4,10,30};
        stockSpan(arr);

    }

    static void stockSpan(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int span=0;
            for (int j = i; j>=0; j--) {
                if(arr[j]<=arr[i]){
                    span++;
                }else{
                    break;
                }
            }
            System.out.println(span);
        }

    }

}
