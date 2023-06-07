package Recursion;

import java.util.ArrayList;

public class stream {
    public static void main(String[] args) {
//        skip("", "amansinganamala");
//        System.out.println(skipchar("abcdefaa"));
        subseq(" ", "abc");
    }

    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    static String skipchar(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return skipchar(up.substring(1));
        } else {
            return ch+skipchar(up.substring(1));
        }
    }


    static void subseq(String p, String up){
         if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch= up.charAt(0);
        subseq(p+ch, up.substring(1)); // take it
        subseq(p, up.substring(1)); // ignore it
    }

    static ArrayList<String> subseqs(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch= up.charAt(0);
        ArrayList<String> left= subseqs(p+ch, up.substring(1));
        ArrayList<String>  right= subseqs(p, up.substring(1));

        left.addAll(right);
        return left;
    }





}
