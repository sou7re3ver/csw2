import java.util.*;

class Graph {
    private int[][] adjacencyMatrix;
    private List<List<Integer>> adjacencyList;

    Graph(int vertices) {
        adjacencyMatrix = new int[vertices][vertices];
        adjacencyList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v) {
        adjacencyMatrix[u][v] = 1;
        adjacencyMatrix[v][u] = 1;
        adjacencyList.get(u).add(v);
        adjacencyList.get(v).add(u);
    }

    void displayAdjacencyMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int[] row : adjacencyMatrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    void displayAdjacencyList() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < adjacencyList.size(); i++) {
            System.out.print(i + ": ");
            for (int j : adjacencyList.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

public class Q8 {
    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.displayAdjacencyMatrix();
        graph.displayAdjacencyList();
    }
}
