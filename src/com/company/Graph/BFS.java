package com.company.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class G{
    private int n;
    ArrayList<ArrayList<Integer>> adjlist;
    public G(int n){
        this.n= n;
        this.adjlist= new ArrayList<>(n);

        for(int i=0;i<n;i++){
            adjlist.add(new ArrayList<>());

        }
    }

    public void addEdge(int u, int v){
        if(u>=0 && v<n && v>=0 && u<n){
            adjlist.get(u).add(v);
            adjlist.get(v).add(u);
        }
    }

    public void bfs(int startVertex){
        boolean[] visited= new boolean[n];
        Queue<Integer> queue= new LinkedList<>();

        visited[startVertex]=true;
        queue.offer(startVertex);
        while(!queue.isEmpty()){
            int currentVertex= queue.poll();
            System.out.print(currentVertex+" ");
            ArrayList<Integer> neighbors= adjlist.get(currentVertex);
            for(int neighbor : neighbors){
                if(!visited[neighbor]){
                    queue.offer(neighbor);
                    visited[neighbor]=true;
                }
            }
        }
    }





}

public class BFS {
    public static void main(String[] args) {
        G graph = new G(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);

        graph.bfs(1);
    }
}
