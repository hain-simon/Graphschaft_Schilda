package problemImplementations;
import customDataStructures.TopologicalSort;
import customDataStructures.graph.Graph;
import customDataStructures.TopologicalSort;

public class AktivitätsDiagramm {
    public static int[] solve(int[][] input) {
        Graph<Integer> graph = new Graph<>(input);
        TopologicalSort sorter = new TopologicalSort();
        int[] ans = sorter.solve(graph);
        System.out.println("Connections: ");
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + ", ");
        }

        return ans;
    }
}
