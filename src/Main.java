import customDataStructures.TopologicalSort;
import problemImplementations.AktivitätsDiagramm;
import customDataStructures.graph.TestInput;
import problemImplementations.ProjektAufgaben;
import problemImplementations.HistorischeFunde;

public class Main {
    public static void main(String[] args) {

        //Winterwege.solve(TestInput.getUndirectedGraph1());
        //SetCover.setCover(TestInput.getUndirectedGraph2());

        //AktivitätsDiagramm.solve(TestInput.getDirectedGraph1());
        //ProjektAufgaben.matchMitarbeiterProjekte(TestInput.getKompetenzenmatrix(), TestInput.getmitarbeiterProProjekt());

        HistorischeFunde.solve(TestInput.getUndirectedGraph2());
    }
}