package com.company.Graph;

import java.util.*;

class Graph {
    // adjacency list representation of the graph
    private List<List<Integer>> adjList;

    // number of vertices in the graph
    private int numVertices;

    // constructor
    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjList = new ArrayList<>(numVertices);

        // initialize adjacency list for each vertex
        for (int i = 0; i < numVertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // add an edge to the graph
    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
    }

    // perform breadth-first search starting from node 's'
    public void breadthFirstSearch(int s) {
        // create a queue for BFS
        Queue<Integer> queue = new LinkedList<>();

        // mark all vertices as not visited
        boolean[] visited = new boolean[numVertices];

        // mark the current node as visited and enqueue it
        visited[s] = true;
        queue.offer(s);

        // print the current node
        System.out.print(s + " ");

        // process the queue
        while (!queue.isEmpty()) {
            // dequeue the next node
            int curr = queue.poll();

            // get all neighbors of the current node
            List<Integer> neighbors = adjList.get(curr);
            for (int neighbor : neighbors) {
                // if neighbor has not been visited, mark it as visited and enqueue it
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);

                    // print the current node
                    System.out.print(neighbor + " ");
                }
            }
        }
    }
}

public class BFSExample {
    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("Breadth-first search starting from vertex 2:");
        graph.breadthFirstSearch(2);
    }
}
