public class DirectedGraph {
    public static void main(String[] args){
        int nodes = 4;
        int[][] unWeightedEdges = {{0,1},{0,2},{1,3},{1,2}};
        int[][] weightedEdges = {{0,1, 10},{0,2, 20},{1,3, 30},{1,2, 40}};
    
        AdjcListUnWeighted adjcListUnWeighted = new AdjcListUnWeighted(nodes);
        AdjcListWeighted adjcListWeighted = new AdjcListWeighted(nodes);
        AdjcMatrixUnWeighted adjcMatrixUnWeighted = new AdjcMatrixUnWeighted(nodes);
        AdjcMatrixWeighted adjcMatrixWeighted = new AdjcMatrixWeighted(nodes);

        // AdjacencyListGraph UnDirected Unweighted
        System.out.println("AdjacencyListGraph UnDirected Unweighted Graph");
        adjcListUnWeighted.addEdges(unWeightedEdges, true);
        adjcListUnWeighted.displayMatrix();
        System.out.println("\nAdjacencyMatrixGraph UnDirected Unweighted Graph");
        adjcMatrixUnWeighted.addEdges(unWeightedEdges, true);
        adjcMatrixUnWeighted.displayMatrix();


        // AdjacencyListGraph UnDirected weighted
        System.out.println("\nAdjacencyListGraph UnDirected Weighted Graph");
        adjcListWeighted.addEdges(weightedEdges, true);
        adjcListWeighted.displayGraph();
        System.out.println("\nAdjacencyMatrixGraph UnDirected Weighted Graph");
        adjcMatrixWeighted.addEdges(weightedEdges, true);
        adjcMatrixWeighted.displayMatrix();


        // Degree of Graph
        adjcListUnWeighted.displayDegree();
    }
}
