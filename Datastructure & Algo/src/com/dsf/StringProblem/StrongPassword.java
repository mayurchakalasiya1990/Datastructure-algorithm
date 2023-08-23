package com.dsf.StringProblem;

import java.util.regex.Pattern;

public class StrongPassword {

    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong

        int result=0;


            //numbers = "0123456789"
            boolean digit=Pattern.matches(".*[0-9].*",password);
            if (!digit){
                ++result;
            }
            //lower_case = "abcdefghijklmnopqrstuvwxyz"
            boolean lowerCase=Pattern.matches(".*[a-z].*",password);
            if (!lowerCase){
                ++result;
            }
            //upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            boolean upperCase=Pattern.matches(".*[A-Z].*",password);
            if (!upperCase){
                ++result;
            }
            //special_characters = "!@#$%^&*()-+"
            boolean specialCharacters=Pattern.matches(".*[!@#$%^&*()+-].*",password);
            if (!specialCharacters){
                ++result;
            }
            if(n<6){
                result=(6-n)>=result?6-n:result;
            }

        return result;
    }

    public static void main(String[] args) {
        String password="AUzs-nV";
        int result=minimumNumber(password.length(),password);

        System.out.println(result);
    }


}
