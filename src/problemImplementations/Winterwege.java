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

        for(int i = 0; i < answer.length; i++){
            for(int j = 0; j < answer[0].length; j++){
                answer[i][j] = 0;
            }
        }

        Node<Integer> startNode = nodes.get(0);

        //List of visited Nodes
        List<Node<Integer>> visitedNodes = new ArrayList<>();
        visitedNodes.add(startNode);

        //While we haven't visited all nodes continue going
        while(visitedNodes.size() < nodes.size()){
            //From each visited  parentNode, check connected Nodes for minimum Distance
            int smallestDistance = Integer.MAX_VALUE;
            Node<Integer> nextNode = null;
            Node<Integer> parent = null;
            int i = -1;
            int j = -1;
            for(Node<Integer> parentNode : visitedNodes){
                for(Node<Integer> childNode : parentNode.connectedNodes){
                    int distance = parentNode.connectionWeights.get(childNode);
                    //Set the smallest distance
                    if(!visitedNodes.contains(childNode) && distance <= smallestDistance){
                        smallestDistance = distance;
                        nextNode = childNode;
                        parent = parentNode;

                    }
                }
            }
            //Now we have to Node with the smallest distance, we add it
            if(nextNode != null && parent != null) {
                String childName = nextNode.name;
                String parentName = parent.name;

                int childNum = Integer.parseInt(childName.substring(4));
                int parentNum = Integer.parseInt(parentName.substring(4));

                answer[parentNum][childNum] = 1;

            }
        }

        return answer;
    }
}
