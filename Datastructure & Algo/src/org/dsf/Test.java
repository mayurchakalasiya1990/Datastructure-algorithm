package org.dsf;

public class Test {

    public static void main(String[] args) {
        /*String intp="10160 27429 61174 92314 90626 66576 13013 3055 28071 13366 48292 83192 376 63276 35825 39497 39701 46967 95656 92257 31122 91431 72587 78900 77935 27666 52875 56477 89913 43214 32042 16424 70643 9567 25090 61268 76142 38102 80674 4212 67819 45317 3756 68194 8592 39580 24042 64644 2898 36050 73252 34020 27480 62191 12919 5415 6208 82146 78243 12472 25359 10284 28896 12353 36202 53985 89973 12343 8438 86998 32907 76257 32315 36662 60802 57258 92593 84844 38254 95490 37245 11505 45861 81076 73695 58780 86490 96254 57277 81085 8726 98987 7720 53973 11340 43922 24309 17664 56264 32746 4661 89170 25354 53327 42183 86156 10585 34775 87351 48838 30265 24595 76694 76125 5670 66741 51256 8512 62994 8532 5948 88071 23871 13667 42043 51562 73940 66351 69225 46556 15449 73885 35725 40802 43564 94260 43309 54148 29034 30659 19337 59298 71605 96030 51775 93627 79122 3030 18490 42116 27914 40789 30186 51784 54455 88581 3345 44747 54931 88921 91302 86731 79157 43378 43885 22720 37637 87193 93219 66671 17852 12555 42320 5808 24937 94094 15786 4058 13476 34275 62525 57741 75063 9063 9524 45870 97643 29220 6968 68925 34492 98269 55656 13648 57998 99540 52720 95635 86732 45938 78657 20935 74845 37328 43095 99781 47774 58880 20190 61249 9507 99067 35341 84569";
        System.out.println(intp.replaceAll(" ",","));*/
        //isieae fdtonf fotrga anoyec cttctt tfhhhs
        String input="roqfqeylxuyxjfyqterizzkhgvngapvudnztsxeprfp";
        int row=(int)Math.sqrt(input.length());
        int col=0;
        if((row*row)<input.length()){
            col=row+1;
            row+=(row*col<input.length()?1:0);
        }else {
            col=row;
        }

        System.out.println(input.length());
        int startIndex=0,endIndex=col;
        String[] result=new String[col];
        String finalResult="",temStr="";
        for (int i = 0; i < row; i++) {

            if(endIndex<=input.length()-1){
                temStr=input.substring(startIndex,endIndex);
                startIndex=startIndex+col;
                endIndex=startIndex+col;
            }else{
                temStr=input.substring(startIndex,input.length());
            }
            for (int j = 0; j < col; j++) {
                if(temStr.length()>j){
                    if (result[j]==null)
                        result[j]="";

                    result[j]+=temStr.charAt(j);
                }else {
                    break;
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            finalResult+=result[i]+" ";
        }
        System.out.println(finalResult);
    }


}
