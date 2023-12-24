package problemImplementations.Eiszeit;
import customDataStructures.GraphScanner;

import java.util.*;

public class Eiszeit {
    public static void main(String[] args) {
        // Beispielgraph
        undirectedGraph graph;
        GraphScanner scanner = new GraphScanner();
        graph = scanner.scanGraph();


        System.out.println();
        // Ausgabe als Adjazenzmatrix
        graph.printAdjacencyMatrix();

        // Ausgabe als Adjazenzliste
        graph.printAdjacencyList();

        List<Set<Integer>> solution = SetCover.setCover(graph);

        System.out.println("Lösungs Sets: " + solution);
        System.out.println();
        printNodesForEachSet(solution);

    }

    public static void printNodesForEachSet(List<Set<Integer>> selectedSets) {
        System.out.println("Man benöitgt "+selectedSets.size()+ " Knoten, um alle Kanten abzudecken.");
        System.out.println();
        System.out.println("Hier sind die Knoten mit ihren jeweiligen Kanten, um alle Kanten abzudecken:");

        for (int i = 0; i < selectedSets.size(); i++) {
            System.out.println("Knoten "+(i + 1) + " mit folgenden Kanten: " + selectedSets.get(i));
        }
        System.out.println();

    }

}
