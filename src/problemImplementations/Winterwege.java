package problemImplementations;

import customDataStructures.graph.Graph;
import customDataStructures.graph.Vertex;
import customDataStructures.Prim;

import java.util.List;
import java.util.ArrayList;

public class Winterwege {

    public int[][] solve(Graph<Integer> graph) {
        return Prim.solve(graph);
    }

}
