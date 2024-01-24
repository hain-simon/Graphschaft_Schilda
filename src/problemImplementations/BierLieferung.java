package problemImplementations;

import customDataStructures.FordFulkerson;
import customDataStructures.FordFulkerson.maxFlowSolution;
import customDataStructures.graph.Edge;
import customDataStructures.graph.Graph;
import customDataStructures.graph.Vertex;

public class BierLieferung {

    //Returns true if capacity is enough, otherwise return false
    public static int[][] solve(int[][] input){
        Graph<Integer> graph = new Graph<>(input);
        int size = graph.vertices.size();
        Vertex<Integer> endVertex = graph.vertices.get(size-1);
        FordFulkerson.maxFlowSolution flowSol= FordFulkerson.getMaxFlow(graph, graph.vertices.get(0), endVertex);
        int sum = flowSol.maxFlow;

        //Calculate the needed flow
        int target = 0;
        for(Edge<Integer> edge : endVertex.edgesIn){
            target += edge.connectionWeight;
        }
        printGraph(flowSol);
        System.out.println("Flow is: " + sum + ", target was: " + target);
        return flowSol.flowGraph;
    }

    public static void printGraph(FordFulkerson.maxFlowSolution solution){
        int[][] graph = solution.flowGraph;

        for(int i = 0; i < graph.length; i++){
            for(int j = 0; j < graph[i].length; j++){
                System.out.printf("%d ", graph[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
