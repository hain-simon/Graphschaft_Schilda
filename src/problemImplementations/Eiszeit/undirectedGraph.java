package problemImplementations.Eiszeit;
import java.util.*;

public class undirectedGraph {
    private int vertices;
    private List<Set<Integer>> edges;

    public undirectedGraph(int vertices) {
        this.vertices = vertices;
        this.edges = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            edges.add(new HashSet<>());
        }
    }

    public undirectedGraph() {
        this.vertices = vertices;
        this.edges = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            edges.add(new HashSet<>());
        }
    }

    public void addEdge(int vertex1, int vertex2) {
        edges.get(vertex1).add(vertex2);
        edges.get(vertex2).add(vertex1); // Hinzufügen der Kante in die andere Richtung
        edges.get(vertex1).add(vertex1);
        edges.get(vertex2).add(vertex2);
    }

    public Set<Integer> getNeighbors(int vertex) {
        return edges.get(vertex);
    }

    public int getVertices() {
        return vertices;
    }

    public List<Set<Integer>> getEdges() {
        return edges;
    }

    // Methode zur Ausgabe des Graphen als Adjazenzmatrix für einen ungerichteten Graphen
    public void printAdjacencyMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                if (edges.get(i).contains(j) || edges.get(j).contains(i)) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Methode zur Ausgabe des Graphen als Adjazenzliste
    public void printAdjacencyList() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + ": ");
            for (int neighbor : edges.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
