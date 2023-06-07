package random;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Graph {
    int N;
    ArrayList<ArrayList<Integer>> adj;

    public Graph(int N) {
        this.N = N;
        this.adj = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        if (u >= 0 && v < N && v >= 0 && u < N) {
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
    }

    public ArrayList<Integer> bfs(int start) {
        boolean[] visited = new boolean[N];
        visited[start] = true;

        ArrayList<Integer> bfs = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            bfs.add(curr);
            ArrayList<Integer> neighbors = adj.get(curr);
            for (int neighbor : neighbors) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }

        return bfs;
    }

    public void dfs(int startVertex) {
        boolean[] visited = new boolean[N];
        dfs(startVertex, visited);
    }

    public void dfs(int curr, boolean[] visited) {
        visited[curr] = true;
        System.out.print(curr + " ");
        ArrayList<Integer> neighbors = adj.get(curr);
        for (int neighbor : neighbors) {
            if (!visited[neighbor]) {
                visited[neighbor] = true;
                dfs(neighbor, visited);
            }
        }
    }

    public void dfss(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        visited[node] = true;
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                visited[neighbor] = true;
                dfss(neighbor, adj, visited);
            }
        }
    }

    public int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean[] visited = new boolean[V];
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (i != j && adj.get(i).get(j) == 1) {
                    adjList.get(i).add(j);
                    adjList.get(j).add(i);
                }
            }
        }

        int count = 0;
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                count++;
                dfss(i, adjList, visited);

            }
        }
        return count;
    }

    public int numIsLands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfsnumIsLands(grid, i, j);
                }
            }
        }
        return count;
    }

    public void dfsnumIsLands(char[][] grid, int row, int col) {
        int total_rows = grid.length;
        int total_cols = grid[0].length;
        if (row < 0 || row >= total_rows || col < 0 || col >= total_cols) {
            return;
        }

        grid[row][col] = '0';
        // Explore down (row + 1)
        dfsnumIsLands(grid, row + 1, col);

        // Explore up (row - 1)
        dfsnumIsLands(grid, row - 1, col);

        // Explore right (col + 1)
        dfsnumIsLands(grid, row, col + 1);

        // Explore left (col - 1)
        dfsnumIsLands(grid, row, col - 1);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int[][] output = new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                output[i][j] = image[i][j];
            }
        }

        int oldColor = output[sr][sc];
        if (oldColor == newColor) {
            return output;
        }

        dfs(output, sr, sc, oldColor, newColor);

        return output;
    }

    private void dfs(int[][] output, int row, int col, int oldColor, int newColor) {
        if (row < 0 || row >= output.length || col < 0 || col >= output[0].length || output[row][col] != oldColor) {
            return;
        }

        output[row][col] = newColor;

        dfs(output, row + 1, col, oldColor, newColor); // Down
        dfs(output, row - 1, col, oldColor, newColor); // Up
        dfs(output, row, col + 1, oldColor, newColor); // Right
        dfs(output, row, col - 1, oldColor, newColor); // Left
    }




}

public class question {
    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);

        ArrayList<Integer> bfs = graph.bfs(0);
        System.out.println(bfs);

        graph.dfs(0);
    }

}
