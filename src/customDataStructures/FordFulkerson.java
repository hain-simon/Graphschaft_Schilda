package customDataStructures;

import customDataStructures.graph.Graph;
import customDataStructures.graph.Vertex;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FordFulkerson {

    public static int getMaxFlow(Graph<Integer> graph, Vertex<Integer> start, Vertex<Integer> end){
        int[][] graphArr = graph.graphArr;
        int size = graphArr.length;
        int startNum = graph.vertices.indexOf(start);
        int endNum = graph.vertices.indexOf(end);

        int[][] residual = new int[size][size];

        //Copy arr
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                residual[i][j] = graphArr[i][j];
            }
        }

        int maxFlow = 0;

        int[] parent = new int[size];
        while(bfs(residual, startNum, endNum, parent)){
            int pathFlow = Integer.MAX_VALUE;
            //Go path backwards
            for(int i = endNum; i != startNum; i = parent[i]){
                //Set flow to the minimum flow between start and end
                pathFlow = Math.min(pathFlow, residual[parent[i]][i]);
            }

            //Update Residuals in reverse order
            for(int i = endNum; i != startNum; i = parent[i]){
                //Take away in correct direction and add to reverse direction
                residual[parent[i]][i] -= pathFlow;
                residual[i][parent[i]] += pathFlow;
            }
            maxFlow += pathFlow;
        }
        return maxFlow;
    }

    private static boolean bfs(int[][] residual, int start, int end, int[] parent){
        //Visited arr, mark everything as non-visited
        int size = residual.length;
        boolean[] visited = new boolean[size];
        Arrays.fill(visited, false);

        // TODO: Implement customLinkedList.poll(), update Class used here
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(start);
        visited[start] = true;
        parent[start] = -1; // start has no parent

        while(!queue.isEmpty()){
            int next = queue.poll();

            for(int i = 0; i < size ; i++){
                if(!visited[i] && residual[next][i] > 0) { // If vertex has not been visited, and graph has connection

                    //If there is a connection to end
                    if(i == end){
                        parent[i] = next;
                        return true;
                    }

                    queue.add(i);
                    parent[i] = next;
                    visited[i] = true;

                }
            }
        }

        //end has not been reached
        return false;
    }
}
