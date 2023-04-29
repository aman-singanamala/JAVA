package com.company.Random_Practice.exams;

import java.util.*;

public class Q14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Set<Integer> set1= new HashSet<>();
        Set<Integer> set2= new HashSet<>();

        for(int i=0;i<5;i++){
            set1.add(in.nextInt());
        }
        for(int i=0;i<5;i++){
            set2.add(in.nextInt());
        }

        Set<Integer> nonCommonElements = new HashSet<>(set1);
        nonCommonElements.addAll(set2);
        Set<Integer> commonElements= new HashSet<>(set1);
        commonElements.retainAll(set2);
        nonCommonElements.removeAll(commonElements);


        if(nonCommonElements.isEmpty()){
            System.out.println(-1);
        }
        else{
            for(int num:nonCommonElements){
                System.out.print(num+" ");
            }
        }

    }
}