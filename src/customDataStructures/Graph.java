package customDataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph <T>{
    //List of Nodes that are in graph
    List<Node<T>> nodes = new ArrayList<>();

    public int dijkstra(Node<T> startNode, Node<T> endNode){
        //Map every Node to their distance
        Map<Node<T>, Integer> distance = new HashMap<>();
        //Set every distance to maximum value
        for(Node<T> node : nodes){
            distance.put(node, Integer.MAX_VALUE);
        }
        //Set distance of startNode to 0
        distance.put(startNode, 0);

        //List of visited Nodes
        List<Node<T>> visitedNodes = new ArrayList<>();
        visitedNodes.add(startNode);

        //While we haven't visited endNode continue going
        while(!visitedNodes.contains(endNode)){
            //From each visited  parentNode, check connected Nodes for minimum Distance
            int smallestDistance = Integer.MAX_VALUE;
            Node<T> nextNode = null;
            for(Node<T> parentNode : visitedNodes){
                for(Node<T> childNode : parentNode.connectedNodes){
                    int totalDistance = distance.get(parentNode) + parentNode.connectionWeights.get(childNode);
                    //Set the smallest distance
                    if(!visitedNodes.contains(childNode) && totalDistance <= smallestDistance){
                        smallestDistance = totalDistance;
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

        return distance.get(endNode);
    }

}
