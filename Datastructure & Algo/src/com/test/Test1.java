package com.test;

public class Test1 {

    public static void main(String[] args) {

        long number= (long) Math.pow(56,2);
        System.out.println(number);
        long digit, sum = 0;
        boolean flag=true;
        while (flag){
            while(number > 0)
            {
                digit = number % 10;
                sum = sum + digit;
                number = number / 10;
            }
            number=sum;
            sum=0;
            digit=0;
            flag=true;
            if((number+"").length()==1){
                flag=false;
            }
        }
        System.out.println(number);
    }

}



