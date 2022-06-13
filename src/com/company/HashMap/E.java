package com.company.HashMap;

import java.util.HashMap;

public class E {
    public static void main(String[] args) {
        HashMap<Integer,String> hm= new HashMap<Integer,String>();
        hm.put(1,"apple");
        hm.put(2,"bat");
        hm.put(3,"cat");
        hm.put(4,"dog");
        System.out.println("Mapping of HashMap are : "+hm);
        // remove element with a key using remove method
        hm.remove(4);
        System.out.println("Mapping after removal are : "+hm);
    }
}
