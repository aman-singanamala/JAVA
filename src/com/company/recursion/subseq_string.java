package com.company.recursion;

import java.util.List;
import java.util.ArrayList;
public class subseq_string {
    static List<String> list = new ArrayList<>();
    public static void main(String[] args){
        String a= "AMAN";
        subseq("", a);
        //System.out.println(list);
        subseqascii("",a);

    }
    static void subseq(String p, String up){
        // p = processed
        // up= unprocessed
        if(up.isEmpty()){

            list.add(p);
            return;  // RETURN OUT OF FUNCTION LINE 22
        }
        Character ch = up.charAt(0);
        subseq(p+ch,up.substring(1)); //pick
        subseq(p,up.substring(1)); // unpick
    }
    static void subseqascii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);
        subseqascii(p+ch, up.substring(1));
        subseqascii(p,up.substring(1));
        subseqascii(p+(ch+0),up.substring(1));
    }

}
