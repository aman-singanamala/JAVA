package Graphs;

class Graph {
    private int[][] adjacencyMatrix;
    private int numVertices;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        this.adjacencyMatrix = new int[numVertices][numVertices];
    }


    public void addEdge(int u, int v) {
        if (u >= 0 && v < numVertices && v >= 0 && v < numVertices) {
            adjacencyMatrix[u][v] = 1;
            adjacencyMatrix[u][v] = 1;
        }
    }

    public void printAdjacencyMatrix(){
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjacencyMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

public class adjacency_matrix{
    public static void main(String[] args) {
        int no_of_vertices=4;
        Graph graph= new Graph(no_of_vertices);

        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        graph.printAdjacencyMatrix();
    }
}
