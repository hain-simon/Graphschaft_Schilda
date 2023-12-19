package customDataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Node<T>{
    String name;
    T value;

    //Each connected Node
    public List<Node<T>> connectedNodes = new ArrayList<>();
    //Mapping connected Nodes to their weight. If graph is unweighted, every weight is 1
    public Map<Node<T>, Integer> connectionWeights = new HashMap<>();

    public Node(String name) {
        this.name = name;
    }

    public Node(String name, T value) {
        this.name = name;
        this.value = value;
    }
}
