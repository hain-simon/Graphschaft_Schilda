package problemImplementations;

import customDataStructures.Graph;
import customDataStructures.Node;

import java.util.HashMap;
import java.util.Map;

public class Winterwege {

    public int[][] solve(String[][] input){
        /*
            Input:
                            Connected Nodes
                    node1:  [node2,  node5],
                    node2:  [node1, node4, node5],
                    node3:  [node5],
                    node4:  [node2, node5],
                    node5:  [node1, node2, node4]
         */

        Map<String, Node<Integer>> map = new HashMap<>();

        //First we get all the Nodes
        for(int i = 0; i < input.length; i++){
            String name = "node" + i;
            Node<Integer> node = new Node<>(name);
            map.put(name, node);
        }

        // Now we set connected Nodes
        for(int i = 0; i < input.length; i++){
            String name = "node" + i;
            Node<Integer> node = map.get(name);
            //For each connected node, get reference from map and put it in connected nodes
            for(int j = 0; j < input[i].length; j++){
                node.connectedNodes.add(map.get(input[i][j]));
            }
        }

        return new int[input.length][input.length];
    }
}
