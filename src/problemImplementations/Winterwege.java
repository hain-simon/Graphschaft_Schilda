package problemImplementations;

import customDataStructures.graph.Graph;
import customDataStructures.graph.Vertex;

import java.util.List;
import java.util.ArrayList;

public class Winterwege {

    public int[][] solve(int[][] input) {

        /*
        Graph<Integer> graph = new Graph<>();

        //Get Nodes with weight
        List<Vertex<Integer>> vertices = graph.getNodes(input);

        //Answer array, if there is 1 at answer[i][j], then there should be a heated path between nodei and nodej
        int[][] answer = new int[input.length][input.length];

        for(int i = 0; i < answer.length; i++){
            for(int j = 0; j < answer[0].length; j++){
                answer[i][j] = 0;
            }
        }

        Vertex<Integer> startVertex = vertices.get(0);

        //List of visited Nodes
        List<Vertex<Integer>> visitedVertices = new ArrayList<>();
        visitedVertices.add(startVertex);

        //While we haven't visited all vertices continue going
        while(visitedVertices.size() < vertices.size()){
            //From each visited  parentVertex, check connected Nodes for minimum Distance
            int smallestDistance = Integer.MAX_VALUE;
            Vertex<Integer> nextVertex = null;
            Vertex<Integer> parent = null;
            int i = -1;
            int j = -1;
            for(Vertex<Integer> parentVertex : visitedVertices){
                for(Vertex<Integer> childVertex : parentVertex.connectedVertices){
                    int distance = parentVertex.connectionWeights.get(childVertex);
                    //Set the smallest distance
                    if(!visitedVertices.contains(childVertex) && distance <= smallestDistance){
                        smallestDistance = distance;
                        nextVertex = childVertex;
                        parent = parentVertex;

                    }
                }
            }
            //Now we have to Vertex with the smallest distance, we add it
            if(nextVertex != null && parent != null) {
                String childName = nextVertex.name;
                String parentName = parent.name;

                int childNum = Integer.parseInt(childName.substring(4));
                int parentNum = Integer.parseInt(parentName.substring(4));

                answer[parentNum][childNum] = 1;

            }
        }

        return answer;

         */
        return new int[][]{};
    }
}
