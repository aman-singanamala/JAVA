package com.company.HashMap;

import java.util.HashMap;

public class D {
    public static void main(String[] args) {
        HashMap<Integer,String>hm= new HashMap<Integer,String>();
        hm.put(1,"apple");
        hm.put(2,"bat");
        hm.put(3,"cat");
        System.out.println("Initial Map :"+hm);
        hm.put(2,"ball");
        System.out.println("Updates Map :"+hm);
    }
}
