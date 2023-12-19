package customDataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph <T>{

    //List of Nodes that are in graph
    class Node<T>{
        String name;
        T value;

        //Each connected Node
        List<Node<T>> connectedNodes = new ArrayList<>();
        //Mapping connected Nodes to their weight. If graph is unweighted, every weight is 1
        Map<Node<T>, Integer> connectionWeights = new HashMap<>();

    }
}
