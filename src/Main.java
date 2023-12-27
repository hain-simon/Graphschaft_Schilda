import customDataStructures.graph.TestInput;
import problemImplementations.AktivitätsDiagramm;
import problemImplementations.Winterwege;

public class Main {
    public static void main(String[] args) {

        //Winterwege.solve(TestInput.getUndirectedGraph1());

        AktivitätsDiagramm.solve(TestInput.getDirectedGraph1());
    }
}