package problemImplementations;
import customDataStructures.TopologicalSort;
import customDataStructures.graph.Graph;
import customDataStructures.TopologicalSort;

public class AktivitätsDiagramm {
    public static int[][] solve(int[][] input) {
        Graph<Integer> graph = new Graph<>(input);
        int[][] ans = TopologicalSort.solve(graph);
        System.out.println("Connection Grid: ");
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[0].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.print("\n");
        }

        return ans;
    }
}
