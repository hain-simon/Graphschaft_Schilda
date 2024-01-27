package customDataStructures;

import customDataStructures.graph.Edge;
import customDataStructures.graph.Graph;
import customDataStructures.graph.Vertex;


public class Dijkstra {

    public static CustomArrayList<Vertex<Integer>> getDistances(Graph<Integer> graph, Vertex<Integer> startVertex){
        CustomArrayList<Vertex<Integer>> vertices = graph.vertices;

        int vertexCount = vertices.size();
        int[] ans = new int[vertexCount];

        //Set every distance to max value
        for(Vertex<Integer> vertex : vertices){
            vertex.value = Integer.MAX_VALUE;
        }

        CustomArrayList<Vertex<Integer>> visitedVertices = new CustomArrayList<>();

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

        return visitedVertices;
    }

    public static int[] solve(Graph<Integer> graph){

        CustomArrayList<Vertex<Integer>> visitedVertices = getDistances(graph, graph.vertices.get(0));
        int vertexCount = graph.vertices.size();
        int[] ans = new int[vertexCount];
        //Set correct order
        for(int i = 0; i < visitedVertices.size(); i++){
            ans[i] = Integer.parseInt(visitedVertices.get(i).name);
        }
        return ans;

    }

    private static Vertex<Integer> getShortestDistanceVertex(CustomArrayList<Vertex<Integer>> visitedVertices) {
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
