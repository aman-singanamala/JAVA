package com.company.Random_Practice.exams;

import java.util.Scanner;
import java.util.TreeSet;

public class Q6 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            set.add(in.nextInt());
        }

        if(set.size()==1){
            System.out.println("-1");
        }
        else{
            set.remove(set.last());
            System.out.println(set.last());
        }
    }
}