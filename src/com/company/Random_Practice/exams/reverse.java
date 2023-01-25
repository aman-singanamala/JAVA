package com.company.Random_Practice.exams;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Queue<Integer> q= new LinkedList<>();
        Stack<Integer> s= new Stack<>();
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            int x= sc.nextInt();
            q.add(x);
        }
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }


    }
}
