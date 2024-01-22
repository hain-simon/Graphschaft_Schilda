import customDataStructures.CustomArrayList;
import customDataStructures.graph.TestInput;
import customDataStructures.graph.Vertex;
import problemImplementations.HistorischeFunde;
import problemImplementations.*;

public class Main {
    public static void main(String[] args) {

        //Winterwege.solve(TestInput.getUndirectedGraph3());
        Eiszeit2.solve(TestInput.getUndirectedGraph3());
        //AktivitätsDiagramm.solve(TestInput.getDirectedGraph1());
        //ProjektAufgaben.projekteZuteilen(TestInput.getFordFulkersonGraph());

        //HistorischeFunde.solve(TestInput.getUndirectedGraph2());

        /*
        Vertex<String> v1 = new Vertex<>("Vertex1");
        Vertex<String> v2 = new Vertex<>("Vertex2");

        CustomArrayList<Vertex<String>> list = new CustomArrayList<>();
        list.add(v1);
        list.add(v2);

        System.out.println(list.get(2).name);

         */
    }
}