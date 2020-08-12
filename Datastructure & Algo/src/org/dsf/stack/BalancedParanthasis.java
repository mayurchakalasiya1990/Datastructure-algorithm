package org.dsf.stack;

import java.util.Stack;

public class BalancedParanthasis {

    public static void main(String[] args) {

          String input="{[]}(";
        //String input="({[]}()";
        System.out.println(isBalance(input));
    }


    static boolean isBalance(String s){

        Stack stack=new Stack();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='('){
                    stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()){
                    return false;
                }else if(!isMatch((char)stack.peek(),s.charAt(i))){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        return stack.isEmpty()==true;
    }

    static boolean isMatch(char a, char b){
        if(a=='{' && b=='}') {
            return true;
        }else if(a=='(' && b==')'){
            return  true;
        }else if(a=='[' && b==']'){
            return  true;
        }
        return false;
    }

}
