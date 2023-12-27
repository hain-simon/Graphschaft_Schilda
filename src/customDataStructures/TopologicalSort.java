package customDataStructures;

import customDataStructures.graph.Edge;
import customDataStructures.graph.Graph;
import customDataStructures.graph.Vertex;

import java.util.ArrayList;
import java.util.List;

public class TopologicalSort {
    List<Vertex<Integer>> verticesWithoutPermanentMark = new ArrayList<>();
    List<Vertex<Integer>> verticesWithTemporaryMark = new ArrayList<>();
    List<Vertex<Integer>> order = new ArrayList<>();
    public int[] solve(Graph<Integer> graph){
        List<Vertex<Integer>> vertices = graph.vertices;
        int vertexCount = vertices.size();



        //Add every vertex to verticesWithoutPermanentMark
        verticesWithoutPermanentMark.addAll(vertices);

        while(!verticesWithoutPermanentMark.isEmpty()){
            Vertex<Integer> vertex = verticesWithoutPermanentMark.get(0);
            visit(vertex);
        }
        int[] ans = new int[vertexCount];
        for(int i = 0; i < vertexCount; i++){
            ans[vertexCount - 1 - i] = Integer.parseInt(order.get(i).name);
        }

        return ans;
    }

    private void visit(Vertex<Integer> vertex){
        //If vertex already has permanentMark, return
        if(!verticesWithoutPermanentMark.contains(vertex)){
            return;
        }
        //If vertex has temporaryMark, there is a loop in the graph
        if(verticesWithTemporaryMark.contains(vertex)){
            throw new RuntimeException("ERROR: Graph contains a loop");
        }
        verticesWithTemporaryMark.add(vertex);

        //Add every Vertex which is connected to this one
        for(Edge<Integer> edge : vertex.edgesOut){
            visit(edge.childVertex);
        }

        //Remove temporaryMark, add permanentMark
        verticesWithTemporaryMark.remove(vertex);
        verticesWithoutPermanentMark.remove(vertex);
        order.add(vertex);
    }


}
