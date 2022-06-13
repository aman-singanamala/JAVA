package com.company.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Traversal {
    public static void main(String[] args) {
        HashMap<String ,Integer> map = new HashMap<>();
        map.put("apple",1);
        map.put("bat",2);
        map.put("cat",2);
        // Iterating the map using for-each loop
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println("Key : "+e.getKey()+" Value : "+e.getValue());
        }
    }
}
