package org.dynamicprogramming;

public class CanConstructStr {

    public static void main(String[] args) {

        System.out.println("can Construct -> abcdef ? :"+canConstruct("abcdef",new String[]{"ab","abc","cd","abcd","def"}));
        System.out.println("can Construct -> skateboard ? :"+canConstruct("skateboard",new String[]{"bo","rd","ate","t","ska","sk","boar"}));
        System.out.println("can Construct -> eeeeeeeeeeeeeeeeeeeeeeeeeeef ? :"+canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeef",new String[]{
                "e",
                "ee",
                "eee",
                "eeee",
                "eeeee",
                "eeeeee",
                "eeeeeee",
                "eeeeeeee",
                "eeeeeeeee",
                "eeeeeeeeee",
                "eeeeeeeeeee",
                "eeeeeeeeeeee",
                "eeeeeeeeeeeeeeeeee",
                "eeeeeeeeeeeeeeeeeeeee",
                "eeeeeeeeeeeeeeeeeeeeeeeeeeef"
        }));

    }

    public static  boolean canConstruct(String target, String[] wordBank){
        if(target.equals("")) {
            return true;
        }

        for (int i = 0; i < wordBank.length; i++) {
            if(target.indexOf(wordBank[i])==0){
                String prefix=target.substring(wordBank[i].length());
                if(canConstruct(prefix,wordBank)){
                    return true;
                }
            }
        }
        return false;
    }
}


