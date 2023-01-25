package com.company.Random_Practice.exams;

import java.util.*;

public class mapvalue {
    public static void main(String[] args) {
        Map<String, Integer> map= new HashMap<>();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter lenght:");
        int n= in.nextInt();

        for (int i = 0; i < n; i++) {
            String key= in.next();
            Integer value= in.nextInt();
            map.put(key, value);
        }

        System.out.println("Enter the key to be deleted:");
        String k = in.next();
        map.remove(k);
        System.out.println("Map after removing key '" + k + "': " + map);
    }
}