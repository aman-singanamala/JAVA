//package com.company.Random_Practice;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class graph_practice {
//    private int V;
//    private ArrayList<ArrayList<Integer>> adj;
//    public graph_practice(int V){
//        this.V=V;
//        adj= new ArrayList<>(V);
//        for (int i = 0; i <V; i++) {
//            adj.add(new ArrayList<>());
//        }
//    }
//
//    public void addEdge(int u, int v){
//        adj.get(u).add(v);
//    }
//    public ArrayList<Integer> bfs(int s){
//        ArrayList<Integer> bfs= new ArrayList<Integer>();
//
//        Queue<Integer> queue= new LinkedList<>();
//
//        boolean[] visited= new boolean[V];
//        visited[s]=true;
//        queue.offer(s);
//
//        bfs.add(s);
//        while(!queue.isEmpty()){
//            int curr= queue.poll();
//             ArrayList<Integer> neighbours= new ArrayList<>();
//             for(int neighbour: neighbours){
//
//             }
//        }
//    }
//}
