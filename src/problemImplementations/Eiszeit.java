package problemImplementations;

import customDataStructures.CustomArrayList;
import customDataStructures.graph.Graph;
import customDataStructures.SetCover;
import customDataStructures.graph.Vertex;

public class Eiszeit {
    public static CustomArrayList<Vertex<Integer>> solve(int[][] input){
        Graph<Integer> graph = new Graph<>(input);
        CustomArrayList<Vertex<Integer>> setCover = SetCover.solve(graph);
        if(setCover == null) return setCover;

        System.out.print("Vertices needed: ");
        for(Vertex<Integer> vertex : setCover){
            System.out.print("Knoten " +vertex.name + "; ");
        }
        return setCover;
    }
}
