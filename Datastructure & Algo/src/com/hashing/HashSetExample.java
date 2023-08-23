package com.hashing;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {
        HashSet<String> strings=new HashSet<>();

        strings.add("mayur");
        strings.add("chakalasiya");
        strings.add("ids");
        strings.add("vasharambhai");
        System.out.println(strings);
        System.out.println("Hashset size:"+strings.size());
        System.out.println("Hashset isEmpty:"+strings.isEmpty());
        System.out.println("Iterate Hashset:");
        for (String str:
             strings) {
            System.out.println(str);
        }


    }
}
