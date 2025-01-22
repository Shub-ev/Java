public class AdjcMatrixUnWeighted {
    // Graphs can be stored in memory using 2 methods
    // 1. Adjacency Matrix
    // 2. Adjanceny List

    // Adjacency Matrix
    final private int[][] adjMatrix;

    public AdjcMatrixUnWeighted(int nodes){
        // initialize AdjacencyMatrix
        adjMatrix = new int[nodes][nodes];
    }

    public void addEdges(int[][] edges, boolean isDirected){
        // add Edges to AdjacencyMatrix
        for(int[] edge: edges){
            int n = edge[0];
            int m = edge[1];

            adjMatrix[n][m] = 1;
            
            if(!isDirected) adjMatrix[m][n] = 1;
        }
    }

    public void displayMatrix(){
        System.out.println("AdjacencyMatrix");
        for(int[] arr: adjMatrix){
            System.out.print("Row -> ");
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
    }
}
