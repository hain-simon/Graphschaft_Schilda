package problemImplementations;

import customDataStructures.FordFulkerson;
import customDataStructures.FordFulkerson.maxFlowSolution;
import customDataStructures.graph.Edge;
import customDataStructures.graph.Graph;
import customDataStructures.graph.Vertex;

public class BierLieferung {

    //Returns true if capacity is enough, otherwise return false
    public static boolean solve(int[][] input){
        Graph<Integer> graph = new Graph<>(input);
        int size = graph.vertices.size();
        Vertex<Integer> endVertex = graph.vertices.get(size-1);
        int sum = FordFulkerson.getMaxFlow(graph, graph.vertices.get(0), endVertex).maxFlow;

        //Calculate the needed flow
        int target = 0;
        for(Edge<Integer> edge : endVertex.edgesIn){
            target += edge.connectionWeight;
        }

        return  sum == target;
    }

}
