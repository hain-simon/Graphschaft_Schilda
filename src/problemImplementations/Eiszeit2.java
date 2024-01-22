package problemImplementations;

import customDataStructures.CustomArrayList;
import customDataStructures.graph.Graph;
import customDataStructures.SetCover;
import customDataStructures.graph.Vertex;

public class Eiszeit2 {
    public static void solve(int[][] input){
        Graph<Integer> graph = new Graph<>(input);
        CustomArrayList<Vertex<Integer>> setCover = SetCover.solve(graph);
        if(setCover == null) return;

        System.out.print("Connections: ");
        for(Vertex<Integer> vertex : setCover){
            System.out.print(vertex.name + " ");
        }
    }
}
