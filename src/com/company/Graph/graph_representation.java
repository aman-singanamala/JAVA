package com.company.Graph;

import java.util.ArrayList;

public class graph_representation {
    public static void main(String[] args) {
        int n=3,e=3;
        int adj1[][] = new int[n+1][n+1];

        //edj 1---2
        adj1[1][2]=1;
        adj1[2][1]=1;

        //edj 2---3
        adj1[2][3]=1;
        adj1[3][2]=1;

        //edj 1---3
        adj1[1][3]=1;
        adj1[3][1]=1;


        ArrayList<ArrayList<Integer>> adj2= new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <=n; i++) {
            adj2.add(new ArrayList<Integer>());
        }
        // edj 1--2
        adj2.get(1).add(2);
        adj2.get(2).add(1);

        // edj 2--3
        adj2.get(2).add(3);
        adj2.get(3).add(2);

        // edj 1--3
        adj2.get(1).add(3);
        adj2.get(3).add(1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < adj2.get(i).size(); j++) {
                System.out.print(adj2.get(i).get(j));
            }
            System.out.println();
        }

    }
}
