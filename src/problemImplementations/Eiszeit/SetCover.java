package problemImplementations.Eiszeit;
import customDataStructures.GraphScanner;

import java.util.*;

public class SetCover {
    public static List<Set<Integer>> setCover(undirectedGraph graph) {
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

        return result;
    }


}
