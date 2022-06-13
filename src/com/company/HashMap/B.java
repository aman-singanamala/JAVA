package com.company.HashMap;

import java.util.HashMap;

public class B {
    public static void main(String[] args) {
        // No need to mention the
        // Generic type twice
        HashMap<Integer, String> hm1= new HashMap<>();
        //Initialization of a HashMap using Generics
        HashMap<Integer, String> hm2= new HashMap<Integer,String>();
        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");

        hm2.put(4, "four");
        hm2.put(5, "five");
        hm2.put(6, "six");

        System.out.println("Mapping of the HashMap hm1 are : "+hm1);
        System.out.println("Mapping of the HashMap hm2 are : "+hm2);

    }
}
