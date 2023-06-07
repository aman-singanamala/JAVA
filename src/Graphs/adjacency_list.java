package Graphs;

import java.util.ArrayList;

class Graphs {
    private int numvertices;
    private ArrayList<ArrayList<Integer>> adjcencyList;

    public Graphs(int numvertices) {
        this.numvertices = numvertices;
        this.adjcencyList = new ArrayList<>(numvertices);
        for (int i = 0; i < numvertices; i++) {
            adjcencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        if (u >= 0 && v < numvertices && v >= 0 && v < numvertices) {
            adjcencyList.get(u).add(v);
            adjcencyList.get(v).add(u);
        }
    }

    public void printAdjacencyList() {
        for (int i = 0; i < numvertices; i++) {
            System.out.print("Vertex " + i + " is adjacent to: ");
            for (int neighbour : adjcencyList.get(i)) {
                System.out.print(neighbour + " ");
            }
            System.out.println();
        }
    }


}

public class adjacency_list {
    public static void main(String[] args) {
        Graphs graph = new Graphs(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);


        graph.printAdjacencyList();

    }

}
