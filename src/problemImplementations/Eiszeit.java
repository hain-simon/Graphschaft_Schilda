package problemImplementations;
import customDataStructures.CustomArrayList;
import customDataStructures.CustomLinkedList;
import customDataStructures.graph.*;

import java.util.*;

public class Eiszeit {
    public static CustomArrayList<Set<Integer>> setCover(int[][] input) {
        //Deklarieren und Initialisieren eines Graphes, einer Liste result und einem Set remainingVertices
        Graph<Integer> graph = new Graph<>(input);
        //List<Set<Integer>> result = new ArrayList<>();
        CustomArrayList<Set<Integer>> result = new CustomArrayList<>();

        Set<Integer> remainingVertices = new HashSet<>();

        //Initialsierung des Sets remainingVertices; Nach der Inititialisierung befinden sich alle Knoten des Graphen im Set remainingVertices
        for (int i = 0; i < graph.getVertices(); i++) {
            remainingVertices.add(i);
        }

        //Solange die Liste remainingVertices nicht leer ist, wiederhole:
        while (!remainingVertices.isEmpty()) {
            //Hilfsset bestSet und coveredVertices wird deklariert
            Set<Integer> bestSet = null;
            Set<Integer> coveredVertices = new HashSet<>();

            //for Schleife, die alle Knoten im Graph durchläuft, also das komplette Set<Integer> set
            for (Set<Integer> set : graph.getEdges()) {
                //Deklarieren eines neuen Sets Intersection, welches mit dem aktuellen Knoten set befüllt wird
                Set<Integer> intersection = new HashSet<>(set);
                //Berechnet die Schnittmenge zwischen der aktuellen Menge (set)/ Intersection und remainingVertices
                intersection.retainAll(remainingVertices);

                // Überprüfe, ob ein besserer Knoten mit mehr ausgehenden Kanten gefunden wurde und aktualisiere ihn gegebenenfalls
                if (intersection.size() > coveredVertices.size()) {

                    coveredVertices = intersection;

                    bestSet = set;

                }
            }
            //Hinzufügen des bestSet zur Lösung, falls bestSet nicht null ist
            if (bestSet != null) {
                result.add(bestSet); //Der Knoten mit bestSet - Kanten wird zur Liste Ergebnis hinzugefügt
                remainingVertices.removeAll(bestSet); // Entfernt die abgedeckten Knoten aus der Menge  remainingVertices
            } else {
                break;
            }
            System.out.println("coveredVertices " + coveredVertices);
            System.out.println("rem " + remainingVertices);
        }
        //Aufrufen der Methode print, um den Input und den Output auf der Konsole auszugeben
        print(input,result, graph);
        return result;
    }

    //Methode, um die Input Matrix auszugeben, sowie die Lösungsliste
    public static void print(int[][] input, CustomArrayList<Set<Integer>> result, Graph graph) {
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
            System.out.println("Kreuzung "+ i + ": deckt folgenden Kreuzungen ab: " + result.get(i));
        }


    }
}