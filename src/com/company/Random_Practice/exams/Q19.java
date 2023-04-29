package com.company.Random_Practice.exams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}