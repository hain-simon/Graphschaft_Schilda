package problemImplementations;

import customDataStructures.Graph;
import customDataStructures.Node;
import java.util.List;
import java.util.ArrayList;


import java.util.HashMap;
import java.util.Map;

public class Winterwege {

    public int[][] solve(int[][] input) {

        Graph<Integer> graph = new Graph<>();

        //Get Nodes with weight
        List<Node<Integer>> nodes = graph.getNodes(input);

        //Answer array, if there is 1 at answer[i][j], then there should be a heated path between nodei and nodej
        int[][] answer = new int[input.length][input.length];

        Node<Integer> startNode = nodes.get(0);

        //List of visited Nodes
        List<Node<Integer>> visitedNodes = new ArrayList<>();
        visitedNodes.add(startNode);

        //While we haven't visited all nodes continue going
        while(visitedNodes.size() < nodes.size()){
            //From each visited  parentNode, check connected Nodes for minimum Distance
            int smallestDistance = Integer.MAX_VALUE;
            Node<Integer> nextNode = null;
            int i = -1;
            int j = -1;
            for(Node<Integer> parentNode : visitedNodes){
                for(Node<Integer> childNode : parentNode.connectedNodes){
                    int distance = parentNode.connectionWeights.get(childNode);
                    //Set the smallest distance
                    if(!visitedNodes.contains(childNode) && distance <= smallestDistance){
                        smallestDistance = distance;
                        nextNode = childNode;

                    }
                }
            }
            //Now we have to Node with the smallest distance, we add it
            if(nextNode != null) {
                distance.put(nextNode, smallestDistance);
                visitedNodes.add(nextNode);
            }
        }


    }
}
