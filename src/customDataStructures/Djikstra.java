package customDataStructures;

import customDataStructures.graph.Edge;
import customDataStructures.graph.Graph;
import customDataStructures.graph.Vertex;

import java.util.ArrayList;
import java.util.List;

public class Djikstra {

    public static int[] solve(Graph<Integer> graph){

        List<Vertex<Integer>> vertices = graph.vertices;

        int vertexCount = vertices.size();
        int[] ans = new int[vertexCount];

        //Set every distance to max value
        for(Vertex<Integer> vertex : vertices){
            vertex.value = Integer.MAX_VALUE;
        }

        //First vertex is start
        Vertex<Integer> startVertex = vertices.get(0);

        List<Vertex<Integer>> visitedVertices = new ArrayList<>();

        //Set distance of start to 0 and add to visitedVertices
        startVertex.value = 0;
        visitedVertices.add(startVertex);

        while(visitedVertices.size() < vertexCount){

            Vertex<Integer> shortestDistanceVertex = getShortestDistanceVertex(visitedVertices);

            if(shortestDistanceVertex == null) {
                break;
            }

            visitedVertices.add(shortestDistanceVertex);

        }


        //Set correct order
        for(int i = 0; i < visitedVertices.size(); i++){
            ans[i] = Integer.parseInt(visitedVertices.get(i).name);
        }

        return ans;

    }

    private static Vertex<Integer> getShortestDistanceVertex(List<Vertex<Integer>> visitedVertices) {
        Vertex<Integer> shortestVertex = null;
        int shortestDistance = Integer.MAX_VALUE;
        //For each vertex
        for(Vertex<Integer> vertex : visitedVertices){
            //For each edge of vertex
            for(Edge<Integer> edge : vertex.edgesOut){
                //If shortestVertex hasn't been set or if weight of current edge is smaller
                //Set current Vertex as shortestVertex
                if(shortestVertex == null || edge.connectionWeight + vertex.value <= shortestDistance){
                    //childVertex of edge cant be in visitedVertices already
                    if(!visitedVertices.contains(edge.childVertex)) {
                        shortestVertex = edge.childVertex;
                        shortestDistance = vertex.value + edge.connectionWeight;
                    }
                }
            }//end inner for
        }//end outer for
        if(shortestVertex != null) {
            shortestVertex.value = shortestDistance;
            return shortestVertex;
        }
        return null;
    }
}
