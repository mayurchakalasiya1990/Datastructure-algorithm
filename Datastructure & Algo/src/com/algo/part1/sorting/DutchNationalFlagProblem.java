package com.algo.part1.sorting;
import java.util.Arrays;

public class DutchNationalFlagProblem {
    static int swapCount=0;
    public static void main(String[] args) {
        char[] flagColors={'r','b','w','b','b','w','r'};
        sortPebble(flagColors);
        System.out.println(Arrays.toString(flagColors));
        System.out.println("swapCount:"+swapCount);
    }

    public static void sortPebble(char[] flagColors){
        int N=flagColors.length;
        int h=1;
        while(h<N/3){
            h=3*h+1;
        }
        while(h>=1){
            for (int i = h; i <N ; i++) {
                for (int j = i; j >=h && (flagColors[j]<flagColors[j-h]) ; j-=h) {
                    swap(flagColors,j,j-h);
                }    
            }
            h=h/3;
        }
    }

    public static String color(char pebbleColor){
        if(pebbleColor=='r'){
            return "RED";
        }else if(pebbleColor=='b'){
            return "BLUE";
        }else{
            return "WHITE";
        }
    }

    public static void swap(char[] arr, int i,int j){
        swapCount++;
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
