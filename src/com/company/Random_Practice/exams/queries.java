package com.company.Random_Practice.exams;

import com.company.HashMap.A;

import java.util.ArrayList;
import java.util.Scanner;

public class queries {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            int ele= sc.nextInt();
            list.add(ele);
        }

        int q= sc.nextInt();
        for (int i = 0; i < q; i++) {
            String query= sc.next();

            if(query.equals("Insert")){
                int x= sc.nextInt();
                int y= sc.nextInt();
                list.add(x,y);
            }
            else if (query.equals("Delete")) {
                int x = sc.nextInt();
                list.remove(x);
            }
        }
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
