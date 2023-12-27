package problemImplementations;

import customDataStructures.graph.Graph;
import customDataStructures.graph.Vertex;
import customDataStructures.Prim;

import java.util.List;
import java.util.ArrayList;

public class Winterwege {

    public static int[][] solve(Graph<Integer> graph) {
        int[][] ans = Prim.solve(graph);
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
