import customDataStructures.CustomArrayList;
import customDataStructures.graph.TestInput;
import customDataStructures.graph.Vertex;
import problemImplementations.HistorischeFunde;
import problemImplementations.*;

public class Main {
    public static void main(String[] args) {

        //Winterwege.solve(TestInput.Winterwege_TestGraph());
        //Eiszeit2.solve(TestInput.Eiszeit_TestGraph());
        //AktivitätsDiagramm.solve(TestInput.Aktivitaetsdiagramm_TestGraph());
        //ProjektAufgaben.projekteZuteilen(TestInput.ProjektAufgaben_TestGraph());
        Empfehlungssystem.solve(TestInput.Empfehlungssystem_TestGraph(), 0, "Offen für Neues");

        //BierLieferung.solve(TestInput.Bierlieferung_TestGraph());

        //HistorischeFunde.solve(TestInput.HistorischeFunde_TestGraph());

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