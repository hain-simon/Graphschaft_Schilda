package customDataStructures.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph <T>{

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

        //First we create a Vertex for each row in input
        for(int i = 0; i < input.length; i++){
            String vertexName = "V" + i;
            Vertex<T> vertex = new Vertex<>(vertexName);
            vertices.add(vertex);
        }

        //Now we iterate through input to set all Connections
        for(int row = 0; row < input.length; row++){
            for(int col = 0; col < input[0].length; col++){

                //If weight is not 0, then set connection
                if(input[row][col] != 0){
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
