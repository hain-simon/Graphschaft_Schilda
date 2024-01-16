package customDataStructures.graph;

import java.util.ArrayList;
import java.util.*;

public class Graph <T> {

    public int[][] graphArr;

    //List of all Vertices
    public List<Vertex<T>> vertices = new ArrayList<>();
    private List<Set<Integer>> kanten;

    //Initialize Graph with input
    public Graph(int[][] graphArr) {

        initializeVertices(graphArr);
        erstelleKantenListe(graphArr);
    }

    private void initializeVertices(int[][] input) {

        this.graphArr = input;

        //First a vertex is created for each row in input
        for (int i = 0; i < input.length; i++) {
            String vertexName = Integer.toString(i);
            Vertex<T> vertex = new Vertex<>(vertexName);
            vertices.add(vertex);
        }

        //Set connections for each vertex
        for (int row = 0; row < input.length; row++) {
            for (int col = 0; col < input[0].length; col++) {

                //If weight is not 0, then set connection
                if (input[row][col] != 0 && row != col) {
                    Vertex<T> parentVertex = vertices.get(row);
                    Vertex<T> childVertex = vertices.get(col);
                    int weight = input[row][col];
                    parentVertex.setConnection(childVertex, weight);
                }
            }
        }


    }


    public Set<Integer> getNeighbors(int vertex) {
        return kanten.get(vertex);
    }

    public int getVertices() {
        return graphArr.length;
    }


    public List<Set<Integer>> getEdges() {
        return kanten;
    }

    public void erstelleKantenListe(int[][] input) {
        this.kanten = new ArrayList<>(input.length);

        for (int i = 0; i < input.length; i++) {
            kanten.add(new HashSet<>());
        }

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j] != 0 && i != j) {
                    kanten.get(i).add(j);
                }
            }
        }

    }
}