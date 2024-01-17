package problemImplementations;

import customDataStructures.FordFulkerson;
import customDataStructures.FordFulkerson.maxFlowSolution;
import customDataStructures.graph.Edge;
import customDataStructures.graph.Graph;
import customDataStructures.graph.Vertex;

public class BierLieferung {

    public static boolean solve(int[][] input){
        Graph<Integer> graph = new Graph<>(input);
        int size = graph.vertices.size();
        Vertex<Integer> endVertex = graph.vertices.get(size-1)
        maxFlowSolution maxFlow = FordFulkerson.getMaxFlow(graph, graph.vertices.get(0), endVertex);

        int sum = 0;
        int target = 0;

        for(Edge<Integer> edge : endVertex.edgesIn){
            target += edge.connectionWeight;
        }

        return  sum == target;
    }

}
