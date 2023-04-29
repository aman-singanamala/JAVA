package com.company.Random_Practice.exams;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner in = new Scanner(System.in);

        for(int i=0;i<10;i++){
            list.add(in.next());
        }

        Collections.swap(list, 1,4);
        for(String str:list){
            System.out.println(str);
        }
    }
}