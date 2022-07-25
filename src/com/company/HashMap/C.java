package com.company.HashMap;
import java.util.HashMap;
public class C {
    public static void main(String[] args) {
        HashMap<Integer,String> hm1= new HashMap<>();
        HashMap<Integer, String> hm2
                = new HashMap<Integer, String>();
        // Add Elements using put method
        hm1.put(1, "Geeks");
        hm1.put(2, "For");
        hm1.put(3, "Geeks");

        hm2.put(1, "Geeks");
        hm2.put(2, "For");
        hm2.put(3, "Geeks");

        System.out.println("Mappings of HashMap hm1 are : "
                + hm1);
        System.out.println("Mapping of HashMap hm2 are : "
                + hm2);
    }
}
