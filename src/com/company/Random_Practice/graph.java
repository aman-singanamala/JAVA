package com.company.Random_Practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class graph {
    private int N;
    private ArrayList<ArrayList<Integer>> adj;

    public graph(int N){
        this.N=N;

        adj=new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            adj.add(new ArrayList<>());
        }
    }
    public void addEdge(int u, int v){
        adj.get(u).add(v);
    }
    public ArrayList<Integer> bfs(int s){
        Queue<Integer> q= new LinkedList<>();
        ArrayList<Integer> bfs= new ArrayList<Integer>();
        boolean[] vis= new boolean[N];
        vis[s]=true;
        q.offer(s);
        bfs.add(s);
        while(!q.isEmpty()){
            int curr= q.poll();
            ArrayList<Integer> neighbours = adj.get(curr);
            for(int neighbour : neighbours){
                if(!vis[neighbour]){
                    vis[neighbour]=true;
                    q.offer(neighbour);
                    bfs.add(neighbour);
                }
            }
        }
        return bfs;
    }
    public static void main(String[] args) {
        graph graph =  new graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        ArrayList<Integer> ans= graph.bfs(2);
        System.out.println(ans.toString());
    }




}
