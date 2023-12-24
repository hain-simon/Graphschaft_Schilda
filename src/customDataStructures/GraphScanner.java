package customDataStructures;
import problemImplementations.Eiszeit.undirectedGraph;

import java.util.*;

public class GraphScanner
{
    public static undirectedGraph scanGraph() {
        //Ein neues Objekt der Klasse Scanner wird erstellt
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie die Anzahl der Knoten ein: ");
        int numNodes = scanner.nextInt(); //Eine int Zahl wird eingelesen und wird in der Variable numNodes gespeichert. Sagt aus wie viele Knoten der Graph hat

        undirectedGraph graph = new undirectedGraph(numNodes);//ein ungerichteter Graph wird erstellt mit der Anzahl numNodes, die gerade eingelesen wurde

        //for - Schleife, um für jeden Knoten zu fragen, wie viele Kanten er haben soll, diese Kanten abzufragen und im Graphen zu speichern
        for (int i = 0; i < numNodes; i++) {
            //für den aktuell ausgewählten Knoten die Anzahl seiner Kanten abfragen und dann in numEdges speichern
            System.out.print("Für Knoten " + i + ": Geben Sie die Anzahl der Kanten ein: ");
            int numEdges = scanner.nextInt();
            System.out.println();

            //Hier wird jede Kante, die der Knoten hat abgefragt, zu welchem Nachbarknoten führt. Diese Kante wird dann im Graphen gespeichert
            for (int j = 0; j < numEdges; j++) {

                System.out.print("	Geben Sie die Kante " + (j + 1) + " ein: ");
                int neighbor = scanner.nextInt(); //Nummer des künftigen Nachbarknoten wird eingelesen
                graph.addEdge(i, neighbor); //Im Graph wird diese Kante gespeichert
            }
            System.out.println();
        }
        scanner.close();

        return graph; //Der oben erstellte Graph wird zurückgegeben
    }

}
