import java.util.ArrayList;
import java.util.List;

public class AdjcListUnWeighted {
    // Graphs can be stored in memory using 2 methods
    // 1. Adjacency Matrix
    // 2. Adjanceny List

    // Adjacency List
    final private List<List<Integer>> adjList;

    final private int[] degree;
    final private int[] inDegree;
    final private int[] outDegree;

    private boolean isDirected;

    public AdjcListUnWeighted(int nodes) {
        // initialize Adjacency List
        adjList = new ArrayList<>();
        for(int i = 0; i < nodes; i++){
            adjList.add(new ArrayList<>());
        }

        degree = new int[nodes];
        inDegree = new int[nodes];
        outDegree = new int[nodes];
    }

    public void addEdges(int[][] edges, boolean isDirected){
        this.isDirected = isDirected;
        // add Edges to AdjacencyList
        for(int[] edge: edges){
            int n = edge[0];
            int m = edge[1];

            adjList.get(n).add(m);

            if(!isDirected){
                adjList.get(m).add(n);
                degree[m]++;
                degree[n]++;
            }
            else{
                inDegree[m]++;
                outDegree[n]++;
            }
        }
    }

    public void displayDegree(){
        if(isDirected){
            for(int i = 0; i < adjList.size(); i++){
                System.out.println("Node " + i + " -> " + "InDegree = " + inDegree[i] + " -> " + "OutDegree = " + outDegree[i] );
            }
        }
        else{
            for(int i = 0; i < adjList.size(); i++){
                System.out.println("Node " + i + " -> " + "Degree = " + degree[i] );
            }
        }
    }

    public void displayMatrix(){
        
        for(int i = 0; i < adjList.size(); i++){
            System.out.print(i + "->" + "[ ");
            for(int j = 0; j < adjList.get(i).size(); j++){
                System.out.print(adjList.get(i).get(j));
                if(j < adjList.get(i).size() - 1) System.out.print(" , ");
            }
            System.out.print(" ]\n");
        }
    }

}
