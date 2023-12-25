package customDataStructures.graph;

public class Edge <T> {

    public Vertex<T> parentVertex;

    public Vertex<T> childVertex;

    public int connectionWeight;

    public Edge(Vertex<T> parentVertex, Vertex<T> childVertex, int connectionWeight) {
        this.parentVertex = parentVertex;
        this.childVertex = childVertex;
        this.connectionWeight = connectionWeight;
    }
}
