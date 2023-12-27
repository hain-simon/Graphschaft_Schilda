package customDataStructures.graph;

import java.util.ArrayList;
import java.util.List;

public class Graph <T>{

    int[][] input;

    //List of all Vertices
    public List<Vertex<T>> vertices = new ArrayList<>();

    //Initialize Graph with input
    public Graph(int[][] input, boolean isDirected){
        initializeNodes(input, isDirected);
    }

    //If no info is given for isDirected, the default value is set (notDirected)
    public Graph(int[][] input){

        initializeNodes(input, false);
    }

    private void initializeNodes(int[][] input, boolean isDirected){

        this.input = input;

        //First a vertex is created for each row in input
        for(int i = 0; i < input.length; i++){
            String vertexName = Integer.toString(i);
            Vertex<T> vertex = new Vertex<>(vertexName);
            vertices.add(vertex);
        }

        //Set connections for each vertex
        for(int row = 0; row < input.length; row++){
            for(int col = 0; col < input[0].length; col++){

                //If weight is not 0, then set connection
                if(input[row][col] != 0 && row != col){
                    Vertex<T> parentVertex = vertices.get(row);
                    Vertex<T> childVertex = vertices.get(col);
                    int weight = input[row][col];
                    parentVertex.setConnection(childVertex, weight);
                    //If the graph is notDirected (undirected) set edge with swapped vertices
                    if(!isDirected){
                        childVertex.setConnection(parentVertex, weight);
                    }
                }
            }
        }

    }

}
