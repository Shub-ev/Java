import java.util.ArrayList;
import java.util.List;

public class GraphDFS {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        int[][] edges = { { 0, 1 }, { 1, 2 }, { 0, 2 }, { 2, 3 }, { 3, 1 }, { 3, 4 } };
        graph.addEdges(edges, false);
        graph.displayGraph();

        // Graph Traversal using DFS
        graph.graphTraverse();
    }
}

class Graph {
    private final List<List<Integer>> adjList;

    public Graph(int nodes) {
        adjList = new ArrayList<>();

        for (int i = 0; i < nodes; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdges(int[][] edges, boolean isDirected) {
        for (int[] edge : edges) {
            int n = edge[0];
            int m = edge[1];

            adjList.get(n).add(m);

            if (!isDirected) {
                adjList.get(m).add(n);
            }
        }
    }

    public void displayGraph() {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print("Node = " + i + " -> ");
            for (int j : adjList.get(i)) {
                System.out.print(j + " , ");
            }
            System.out.println("");
        }
    }

    public void graphTraverse() {
        boolean[] isVisited = new boolean[adjList.size()];
        for (int i = 0; i < adjList.size(); i++) {
            if (!isVisited[i]) {
                traverse(i, isVisited);
            }
        }
    }

    private void traverse(int i, boolean[] isVisited) {
        System.out.print(i + " ");
        isVisited[i] = true;
        for(int j : adjList.get(i)){
            if(!isVisited[j]){
                traverse(j, isVisited);
            }
        }
    }
}