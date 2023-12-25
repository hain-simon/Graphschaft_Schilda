package customDataStructures.graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex<T>{
    public String name;
    T value;

    public List<Edge<T>> edges = new ArrayList<>();

    public void setConnection(Vertex<T> childVertex, int weight){
        Edge<T> edge = new Edge<>(this, childVertex, weight);
        edges.add(edge);
    }

    public Vertex(String name) {
        this.name = name;
    }

    public Vertex(String name, T value) {
        this.name = name;
        this.value = value;
    }
}
