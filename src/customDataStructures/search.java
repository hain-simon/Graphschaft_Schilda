package customDataStructures;

import customDataStructures.graph.Edge;
import customDataStructures.graph.Graph;
import customDataStructures.graph.Vertex;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

public class search {

    // Get Vertex with shortest distance from visited Vertices
    public static <T> Vertex<T> BFS(List<Vertex<T>> visited){
        return getShortestEdge(visited).childVertex;
    }

    //Returns true if there is a path from currentVertex to goalVertex
    public static <T> boolean BFS(Vertex<T> current, Vertex<T> goal){
        List<Vertex<T>> visited = new ArrayList<>();
        visited.add(current);
        while(!visited.contains(goal)){
            Vertex<T> nextVertex = getShortestEdge(visited).childVertex;
            if(nextVertex == null) return false;
            visited.add(nextVertex);
        }
        return true;
    }

    private static <T> Edge<T> getShortestEdge(List<Vertex<T>> visited){
        Edge<T> minEdge = null;
        for(Vertex<T> vertex : visited){
            for(Edge<T> edge : vertex.edgesOut){
                if(!visited.contains(edge.childVertex)){
                    if(minEdge == null || minEdge.connectionWeight >= edge.connectionWeight) {
                        minEdge = edge; //Get the shortest Edge
                    }
                }
            }
        }
        return minEdge;
    }

}
