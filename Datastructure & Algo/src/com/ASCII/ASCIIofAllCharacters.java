package com.ASCII;

public class ASCIIofAllCharacters {
    public static void main(String[] args)
    {
        int i;

        for(i = 0; i <= 255; i++)
        {
            System.out.println(" The ASCII value of " + (char)i + "  =  " + i);
        }
    }
}

//0-9 => 48-57
//A-B=>65-90
//a-b=>97-122