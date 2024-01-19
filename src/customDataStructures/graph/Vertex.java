package customDataStructures.graph;

import customDataStructures.CustomArrayList;

import java.util.ArrayList;
import java.util.List;

public class Vertex<T>{
    public String name;
    public T value;

    //List of all edges going out of this Vertex
    public List<Edge<T>> edgesOut = new ArrayList<>();

    //List of all edges going into this Vertex -> Ford Fulkerson uses backtracking
    public List<Edge<T>> edgesIn = new ArrayList<>();

    public void setConnection(Vertex<T> childVertex, int weight){
        Edge<T> edge = new Edge<>(this, childVertex, weight);
        this.edgesOut.add(edge);
        childVertex.edgesIn.add(edge);

    }

    public Vertex(String name) {
        this.name = name;
    }

    public Vertex(String name, T value) {
        this.name = name;
        this.value = value;
    }
}
