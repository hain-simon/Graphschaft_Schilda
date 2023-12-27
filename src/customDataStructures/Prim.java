package customDataStructures;

import customDataStructures.graph.Graph;
import customDataStructures.graph.Vertex;
import customDataStructures.graph.Edge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prim {
    Graph<Integer> graph;

    public static int[][] solve(Graph<Integer> graph){

        /*
            Steps:
            -Set one Vertex as "visited"

            -Repeat until every Node has been visited:
                -Search through every visited Vertex and set the vertex with minimal weight to get there as visited
                -remember this edge
         */

        List<Vertex<Integer>> vertices = graph.vertices;
        int vertexCount = vertices.size();

        int[][] ans = new int[vertexCount][vertexCount];

        List<Vertex<Integer>> visitedVertices = new ArrayList<>();

        //Start at vertex 0
        visitedVertices.add(vertices.get(0));

        while(visitedVertices.size() < vertexCount){
            Edge<Integer> shortestEdge = getShortestEdge(visitedVertices);
            //shortestEdge can't be null, this would mean we have to edge to go to anymore
            if(shortestEdge == null) {
                System.out.println("No valid connection to every Location");
                break;
            }
            //Now set the connection in ans and add parentVertex of edge to visitedVertices
            Vertex<Integer> parentVertex = shortestEdge.parentVertex;
            Vertex<Integer> childVertex = shortestEdge.childVertex;
            int parentIndex = Integer.parseInt(parentVertex.name);
            int childIndex = Integer.parseInt(childVertex.name);

            ans[parentIndex][childIndex] = 1;
            visitedVertices.add(parentVertex);

        }

        return ans;
    }

    private static Edge<Integer> getShortestEdge(List<Vertex<Integer>> visitedVertices) {
        Edge<Integer> shortestEdge = null;
        //For each vertex
        for(Vertex<Integer> vertex : visitedVertices){
            //For each edge of vertex
            for(Edge<Integer> edge : vertex.edgesOut){
                //If shortestEdge hasn't been set or if weight of current edge is smaller
                //Set current edge as shortestEdge
                if(shortestEdge == null || edge.connectionWeight <= shortestEdge.connectionWeight){
                    shortestEdge = edge;
                }
            }//end inner for
        }//end outer for
        return shortestEdge;
    }

}
