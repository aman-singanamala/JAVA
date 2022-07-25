package com.company.HashMap;
import java.util.HashMap;
public class F {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Java");
        map.put(2,"Python");
        map.put(3,"JavaScript");
        System.out.println("HashMap : "+map);
        // return set view of keys using keySet()
        System.out.println("Keys : "+map.keySet());
        // return set view of values using values()
        System.out.println("Values : "+map.values());
        // return set view of key/value pair using entrySet()
        System.out.println("Key/Value mappings: " + map.entrySet());
    }
}
