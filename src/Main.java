import customDataStructures.TopologicalSort;
import problemImplementations.AktivitätsDiagramm;
import customDataStructures.graph.TestInput;

public class Main {
    public static void main(String[] args) {

        //Winterwege.solve(TestInput.getUndirectedGraph1());
        //SetCover.setCover(TestInput.getUndirectedGraph2());

        AktivitätsDiagramm.solve(TestInput.getDirectedGraph1());
    }
}