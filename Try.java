
import java.util.LinkedList;
import java.util.Queue;

public class Try{
    public static void main(String[] args) {
        int[][] edges = {{0,1}, {0,2}, {1,2}, {2,3}};

        Graph g = new Graph(5);
        g.addEdges(false, edges);

        g.displayGraph();
        g.bfs();
    }
}

class Graph{
    private final int[][] adjMatrix;

    public Graph(int nodes){
        adjMatrix = new int[nodes][nodes];
    }

    public void addEdges(boolean isDirected, int[]... edges){
        for(int[] arr: edges){
            int n = arr[0];
            int m = arr[1];

            adjMatrix[n][m] = 1;
            if(!isDirected) adjMatrix[m][n] = 1;
        }
    }

    public void displayGraph(){
        for(int[] arr: adjMatrix){
            for(int num : arr){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public void bfs(){
        boolean[] isVisited = new boolean[adjMatrix.length];
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < adjMatrix.length; i++){
            if(!isVisited[i]){
                queue.add(i);
                isVisited[i] = true;

                while(!queue.isEmpty()){
                    int node = queue.poll();
                    System.out.print(node + " ");
                    for(int arr: adjMatrix[node]){
                        if(!isVisited[arr]){
                            queue.add(arr);
                            isVisited[arr]= true;
                        }
                    }
                }
            }
        }
    }
} 