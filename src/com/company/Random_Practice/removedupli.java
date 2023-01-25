package com.company.Random_Practice;
import javax.swing.table.TableRowSorter;
import java.util.*;
public class removedupli {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input=in.next();

        Set<Character> set= new HashSet<>();

        for(int i=0;i< input.length();i++){
            set.add(input.charAt(i));
        }
        Set<Character> ans= new TreeSet<>(set);
         for(Character c: ans){
             System.out.println(c);
         }

    }
}
