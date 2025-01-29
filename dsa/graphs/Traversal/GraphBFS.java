import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphBFS {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        int[][] edges = {{0,1}, {0,2}, {1,2}, {2,3}, {3,4}, {3,1}};

        graph.addEdges(edges, true);
        graph.printGraph();
        graph.traverse();
    }
}

class Graph{
    private final ArrayList<ArrayList<Integer>> ADJ_LIST;

    public Graph(int nodes){
        ADJ_LIST = new ArrayList<>();
        for(int i = 0; i < nodes; i++){
            ADJ_LIST.add(new ArrayList<>());
        }
    }

    public void addEdges(int[][] edges, boolean isDirected){
        for(int[] node: edges){
            int n = node[0];
            int m = node[1];

            ADJ_LIST.get(n).add(m);

            if(!isDirected){
                ADJ_LIST.get(m).add(n);
            }
        }
    }

    public void printGraph(){
        for(int i = 0; i < ADJ_LIST.size(); i++){
            System.out.print("Node = " + i + " -> ");
            for(int j : ADJ_LIST.get(i)){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    public void traverse(){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] isVisited = new boolean[ADJ_LIST.size()];

        System.out.println("Graph Traversal:");
        for(int i = 0; i < ADJ_LIST.size(); i++){
            if(!isVisited[i]){
                bfs(i, queue, isVisited);
            }
        }
    }

    public void bfs(int i, Queue<Integer> queue, boolean[] isVisited){
        queue.add(i);
        isVisited[i] = true;

        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.print(node + " ");
            for(int j : ADJ_LIST.get(node)){
                if(!isVisited[j]){
                    queue.offer(j);
                    isVisited[j] = true;
                }
            }
        }
    }
}
