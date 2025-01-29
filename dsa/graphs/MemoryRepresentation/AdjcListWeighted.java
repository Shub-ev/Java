import java.util.ArrayList;
import java.util.List;

public class AdjcListWeighted {
    private class Pair{
        int node;
        int weight;

        public Pair(int node, int weight){
            this.node = node;
            this.weight = weight;
        }

        @Override
        public String toString(){
            return "( "+ node + ", " + weight + " )";
        }
    }
    List<List<Pair>> adjcList;

    public AdjcListWeighted(int nodes) {
        adjcList = new ArrayList<>();

        for(int i = 0; i < nodes; i++){
            adjcList.add(new ArrayList<>());
        }
    }

    public void addEdges(int[][] edges, boolean isDirected){
        for(int[] edge: edges){
            int n = edge[0];
            int m = edge[1];
            int w = edge[2];

            adjcList.get(n).add(new Pair(m, w));

            if(!isDirected) adjcList.get(m).add(new Pair(n, w));
        }
    }

    public void displayGraph(){
        for(int i = 0; i < adjcList.size(); i++){
            System.out.print(i + "->" + "[ ");
            for(int j = 0; j < adjcList.get(i).size(); j++){
                System.out.print(adjcList.get(i).get(j));
                if(j < adjcList.get(i).size() - 1) System.out.print(" , ");
            }
            System.out.print(" ]\n");
        }
    }
}
