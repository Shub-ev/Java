public class AdjcMatrixWeighted {
    final private int[][] adjcMatrix;

    public AdjcMatrixWeighted(int nodes){
        adjcMatrix = new int[nodes][nodes];
    }

    public void addEdges(int[][] edges, boolean isDirected){
        for(int[] edge: edges){
            int n = edge[0];
            int m = edge[1];
            int w = edge[2];

            adjcMatrix[n][m] = w;

            if(!isDirected) adjcMatrix[m][n] = w;
        }
    }

    public void displayMatrix(){
        System.out.println("AdjacencyMatrix");
        for(int[] arr: adjcMatrix){
            System.out.print("Row -> ");
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
    }
}
