package com.company.Random_Practice.exams;

import java.util.Scanner;
import java.util.*;
public class uncoupled {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int xor= 0;
        for(int i=0;i<n;i++){
            int num= sc.nextInt();
            xor^=num;
        }

        System.out.println("uncouple values "+ xor );

    }
}
