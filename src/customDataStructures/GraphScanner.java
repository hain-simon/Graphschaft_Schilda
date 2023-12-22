package customDataStructures;
import problemImplementations.Eiszeit.undirectedGraph;

import java.util.*;

public class GraphScanner
{
    public static undirectedGraph scanGraph() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie die Anzahl der Knoten ein: ");
        int numNodes = scanner.nextInt();

        undirectedGraph graph = new undirectedGraph(numNodes);

        for (int i = 0; i < numNodes; i++) {
            System.out.print("Für Knoten " + i + ": Geben Sie die Anzahl der Kanten ein: ");


            int numEdges = scanner.nextInt();
            System.out.println();
            for (int j = 0; j < numEdges; j++) {

                System.out.print("	Geben Sie die Kante " + (j + 1) + " ein: ");
                int neighbor = scanner.nextInt();

                graph.addEdge(i, neighbor);
            }
            System.out.println();
        }

        scanner.close();

        return graph;
    }

}
