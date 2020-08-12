package org.dsf.StringProblem;

public class CamelCaseSolution {


    // Complete the camelcase function below.
    static int camelcase(String s) {
        int result=0;
        char[] words=s.toCharArray();
        for (char c:words) {
            if(Character.isUpperCase(c)){
                ++result;
            }
        }
        return ++result;
    }

    public static void main(String[] args) {
        String s="saveChangesInTheEditor";
        System.out.println(camelcase(s));
    }

}
