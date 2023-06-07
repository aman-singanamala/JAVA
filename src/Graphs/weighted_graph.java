package Graphs;

import java.util.*;





class G {
    private int numVertices;
    private List<List<Edge>> adjacencyList;

    public G(int numVertices) {
        this.numVertices = numVertices;
        this.adjacencyList = new ArrayList<>(numVertices);

        for (int i = 0; i < numVertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination, int weight) {
        if (source >= 0 && source < numVertices && destination >= 0 && destination < numVertices) {
            adjacencyList.get(source).add(new Edge(destination, weight));
            adjacencyList.get(destination).add(new Edge(source, weight)); // For undirected graph
        }
    }

    public void printAdjacencyList() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + i + " is adjacent to: ");
            for (Edge edge : adjacencyList.get(i)) {
                System.out.print("(" + edge.destination + ", " + edge.weight + ") ");
            }
            System.out.println();
        }
    }

    static class Edge {
        int destination;
        int weight;

        public Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }


}


public class weighted_graph {
    public static void main(String[] args) {
        int numVertices = 4;
        G graph = new G(numVertices);

        // Add edges with weights to the graph
        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 2, 1);
        graph.addEdge(2, 3, 4);

        // Print the adjacency list with weights
        graph.printAdjacencyList();
    }
}
