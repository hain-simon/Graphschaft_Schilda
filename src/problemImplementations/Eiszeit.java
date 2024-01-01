package problemImplementations;
import customDataStructures.graph.*;

import java.util.*;

public class Eiszeit {
    public static List<Set<Integer>> setCover(int[][] input) {
        Graph<Integer> graph = new Graph<>(input);
        List<Set<Integer>> result = new ArrayList<>();
        Set<Integer> remainingVertices = new HashSet<>();

        for (int i = 0; i < graph.getVertices(); i++) {
            remainingVertices.add(i);
        }

        while (!remainingVertices.isEmpty()) {
            Set<Integer> bestSet = null;
            Set<Integer> coveredVertices = new HashSet<>();

            for (Set<Integer> set : graph.getEdges()) {
                Set<Integer> intersection = new HashSet<>(set);
                intersection.retainAll(remainingVertices);

                if (intersection.size() > coveredVertices.size()) {
                    coveredVertices = intersection;
                    bestSet = set;

                }
            }
            if (bestSet != null) {
                result.add(bestSet);
                remainingVertices.removeAll(bestSet);
            } else {
                break;
            }
        }

        print(input,result);
        return result;
    }
    public static void print(int[][] input, List<Set<Integer>> result) {
        System.out.println("Input Matrix:");
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Man benötigt "+result.size()+ " Kreuzungen, um Schildas Grundrecht bezüglich der Eisstände effizient durchzusetzen.");
        System.out.println();
        System.out.println("Hier sind die Kreuzungen mit ihren jeweiligen verbundenen Kreuzungen:");
        for (int i = 0; i < result.size(); i++) {
            //System.out.println((i + 1) +". Knoten mit folgenden Kanten zu Knoten: " + selectedSets.get(i));
            System.out.println("Kreuzung "+ (i+1) + ": deckt folgenden Kreuzungen ab: " + result.get(i));
        }
    }
}

