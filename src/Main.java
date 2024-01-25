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
        //Empfehlungssystem.solve(TestInput.Empfehlungssystem_TestGraph(), 0, "Offen für Neues");

        //BierLieferung.solve(TestInput.Bierlieferung_TestGraph());

        //HistorischeFunde.solve(TestInput.HistorischeFunde_TestGraph());

        Parkhaus parking = new Parkhaus(10);
        parking.showSpaces();
        parking.reserve();
        parking.reserve();
        parking.reserve();
        parking.reserve();
        parking.reserve(9);
        parking.reserve();
        parking.reserve();
        parking.reserve();
        parking.reserve();
        parking.reserve();
        parking.reserve();
        parking.showSpaces();
        parking.reserve();
        parking.showSpaces();

    }
}