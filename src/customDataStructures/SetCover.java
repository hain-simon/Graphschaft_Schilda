package customDataStructures;

import customDataStructures.graph.Edge;
import customDataStructures.graph.Graph;
import customDataStructures.graph.Vertex;

public class SetCover {
    public static CustomArrayList<Vertex<Integer>> solve(Graph<Integer> graph){
        CustomArrayList<Vertex<Integer>> remainingVertices = graph.vertices;
        CustomArrayList<Vertex<Integer>> answer = new CustomArrayList<>();

        while(!remainingVertices.isEmpty()){
            Vertex<Integer> mostConnectionVertex = getVertexWithMostConnections(remainingVertices);
            if(mostConnectionVertex == null) return null;
            answer.add(mostConnectionVertex);
            remainingVertices.remove(mostConnectionVertex);
            for(Edge<Integer> edge : mostConnectionVertex.edgesOut){
                Vertex<Integer> vertex = edge.childVertex;
                remainingVertices.remove(vertex);
            }
        }
        return answer;
    }
    
    private static Vertex<Integer> getVertexWithMostConnections(CustomArrayList<Vertex<Integer>> vertices){
        if(vertices.isEmpty()) return null;
        Vertex<Integer> vertex = vertices.get(0);

        for(Vertex<Integer> currentVertex : vertices){
            int connections = currentVertex.edgesOut.size();
            int currentMax = vertex.edgesOut.size();

            if(connections >= currentMax) vertex = currentVertex;
        }

        return vertex;
    }
}
