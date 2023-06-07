package Graphs;

import java.util.ArrayList;

class AA{
    private int n;
    ArrayList<ArrayList<Integer>> adj;

    public AA(int n){
        this.n= n;
        this.adj= new ArrayList<>(n);

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u,int v){
        if(u>=0 && v<n && v>=0 && u<n){
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
    }

    public void depthFirstSearch(int startVertex){
        boolean[] visited= new boolean[n];
        dfs(startVertex, visited);

    }

    private void dfs(int currentVertex, boolean[] visited){
        visited[currentVertex]= true;
        System.out.println(currentVertex+" ");


        ArrayList<Integer> neighbors= adj.get(currentVertex);
        for(int neighbor: neighbors){
            if(!visited[neighbor]){
                dfs(neighbor, visited);
            }
        }

    }

}

public class DFS {

}
