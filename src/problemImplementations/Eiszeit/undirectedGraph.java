package problemImplementations.Eiszeit;
import java.util.*;

public class undirectedGraph {
    private int vertices; //Knoten
    private List<Set<Integer>> edges; //Kanten in Form einer Liste

    //Konstruktor, um undirectedGraph Objekte zu initialisieren. Bekommt Anzahl geüwnschter Knoten übergeben
    public undirectedGraph(int vertices) {
        this.vertices = vertices;
        this.edges = new ArrayList<>(vertices); //Kanten werden initialisiert durch eine Liste aus Knoten
        //durchläuft alle Knoten im Graphen und fügt für jeden Knoten ein leeres HashSet zur Liste der Kanten hinzu.
        //Jedes HashSet repräsentiert die Menge der benachbarten Knoten für einen bestimmten Knoten
        for (int i = 0; i < vertices; i++) {
            edges.add(new HashSet<>());
        }
    }



    //Methode addEdge fügt eine Kante zwischen zwei Knoten hinzu. Diese Verbindung wird dann im HashSet der jeweiligen Knoten zu sehen sein
    public void addEdge(int vertex1, int vertex2) {
        edges.get(vertex1).add(vertex2);    //Hinzufügen einer Kante zwischen Knoten1 (vertex1) und Knoten2 (vertex2)
        edges.get(vertex2).add(vertex1);    //Hinzufügen der Kante in die andere Richtung, da es sich um einen ungerichteten Graphen handelt
        edges.get(vertex1).add(vertex1);    //Eintrag Kante zu sich selbst wird hinzugefügt, da der Algorithmus dies berücksichtigt
        edges.get(vertex2).add(vertex2);    //Eintrag Kante zu sich selbst wird hinzugefügt, da der Algorithmus dies berücksichtigt
    }

    //Methode getVertices gibt die ANzahl aller Knoten im Graph zurück
    public int getVertices() {
        return vertices;
    }

    //Methode getEdges gibt die Liste edges des Typs Set<Integer> zurück
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
