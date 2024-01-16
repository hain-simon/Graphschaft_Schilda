package customDataStructures;

import customDataStructures.graph.Edge;
import customDataStructures.graph.Graph;
import customDataStructures.graph.Vertex;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

public class search {

    // Get Vertex with shortest distance from visited Vertices
    public static <T> Vertex<T> BFS(Graph<T> graph, List<Vertex<T>> visited){

        Edge<T> minEdge = new Edge<T>(Integer.MAX_VALUE);
        for(Vertex<T> vertex : visited){
            for(Edge<T> edge : vertex.edgesOut){
                if(minEdge.connectionWeight >= edge.connectionWeight){
                    minEdge = edge; //Get the shortest Edge
                }
            }
        }

        return minEdge.childVertex;

    }

}
