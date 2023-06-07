package Graphs;

import java.util.ArrayList;

class B {
    private int n;
    ArrayList<ArrayList<Integer>> adjList;

    public B(int n) {
        this.n = n;
        this.adjList = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdges(int u, int v) {
        if (u >= 0 && v < n && v >= 0 && u < n) {
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
    }

    public void dfs(int node, ArrayList<ArrayList<Integer>> adjlist, boolean[] visited) {
        visited[node] = true;
        for (int neighbor : adjlist.get(node)) {
            if (!visited[neighbor]) {
                dfs(node, adjlist, visited);
            }
        }
    }

    public int findProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        ArrayList<ArrayList<Integer>> adjlist = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < V; i++) {
            adjlist.add(new ArrayList<Integer>());
        }


        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (adj.get(i).get(j) == 1 && i != j) { // i!=j used to avoid self loops
                    adjlist.get(i).add(j);
                    adjlist.get(j).add(i);
                }
            }
        }
        boolean[] visited = new boolean[V];
        int count = 0;
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                count++;
                dfs(i, adjlist, visited);
            }
        }
        return count;
    }
}

public class Number_of_provinces {
}
