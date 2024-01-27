package problemImplementations;

import customDataStructures.Dijkstra;
import customDataStructures.graph.Graph;

public class HistorischeFunde {


    public static int[] solve(int[][] input) {
        Graph<Integer> graph = new Graph<>(input);
        int[] ans = Dijkstra.solve(graph);
        System.out.println("Order: ");
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + ", ");
        }
        return ans;
    }

}
