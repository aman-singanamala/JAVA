package com.company.Random_Practice;
import java.util.*;
import java.lang.*;
import java.io.*;
public class aa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input;
        input = in.nextInt();
        int count = 0;
        while (input >= 0) {

            if (input % 6 == 0) {
                count++;
            }
            input = in.nextInt();
        }
        System.out.println(count);
    }
}

