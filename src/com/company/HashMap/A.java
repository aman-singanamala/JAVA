package com.company.HashMap;

import java.util.HashMap;

public class A {
    public static void main(String[] args) {
        HashMap<String, Integer> map= new HashMap<>();
        map.put("apple",1);
        map.put("bat",2);
        map.put("cat",3);
        // Print size and content of the Map
        System.out.println("Size of the map is :- "+map.size());
        // Printing elements in object of Map
        System.out.println(map);
        if(map.containsKey("apple")){
            Integer a= map.get("apple");
            System.out.println("value of the key apple is : "+a);
        }
    }
}
