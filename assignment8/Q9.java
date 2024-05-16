import java.util.*;

class Graph {
    private List<List<Integer>> adjacencyList;

    Graph(int vertices) {
        adjacencyList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v) {
        adjacencyList.get(u).add(v);
        adjacencyList.get(v).add(u);
    }

    void readGraph(Scanner scanner) {
        int vertices = scanner.nextInt();
        int edges = scanner.nextInt();

        for (int i = 0; i < edges; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            addEdge(u, v);
        }
    }

    void DFS(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int neighbor : adjacencyList.get(vertex)) {
            if (!visited[neighbor]) {
                DFS(neighbor, visited);
            }
        }
    }
}

public class Q9   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Graph graph = new Graph(5);
        graph.readGraph(scanner);

        boolean[] visited = new boolean[5];
        graph.DFS(0, visited);

        scanner.close();
    }
}
