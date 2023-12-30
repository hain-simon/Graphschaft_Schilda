package problemImplementations;
import java.util.*;

public class ProjektAufgaben {

    public static int[][] matchMitarbeiterProjekte(int[][] kompetenzenMatrix, int[] mitarbeiterProProjekt) {
        /*
        Eingabe:
            kompetenzenMatrix: Jede Zeile ist ein Mitarbeiter; jede Spalte ein Projekt --> wenn mitarbeiter und projekt selbe kompetenzen haben, ist in diesem feld eine 1. Falls die Kompetenzen nicht übereinstimmen ist in diesem Feld eine 0
            mitarbeiterProProjekt: Für jedes Projekt wird eine gewünschte Anzahl an Arbeitern festgelegt. Jedes Projekt hat mind. 1 Arbeiter, außer es stimmen überhaupt keine Kompetenzen überein
         */
        int anzahlMitarbeiter = kompetenzenMatrix.length;
        int anzahlProjekte = kompetenzenMatrix[0].length;

        int[][] zuordnung = new int[anzahlMitarbeiter][anzahlProjekte];

        for (int projekt = 0; projekt < anzahlProjekte; projekt++) {
            // Liste der Mitarbeiter mit den erforderlichen Kompetenzen für dieses Projekt
            List<Integer> mitarbeiterMitKompetenzen = new ArrayList<>();
            for (int mitarbeiter = 0; mitarbeiter < anzahlMitarbeiter; mitarbeiter++) {
                if (kompetenzenMatrix[mitarbeiter][projekt] == 1) {
                    mitarbeiterMitKompetenzen.add(mitarbeiter);
                }
            }

            // Überprüfen, ob Mitarbeiter mit den erforderlichen Kompetenzen vorhanden sind
            if (!mitarbeiterMitKompetenzen.isEmpty()) {
                // Projekte mischen, um Zufälligkeit zu gewährleisten
                Collections.shuffle(mitarbeiterMitKompetenzen);

                // Anzahl der Projekte, die diesem Mitarbeiter zugeordnet werden sollen (maximal 3)
                int projekteZuordnen = Math.min(mitarbeiterMitKompetenzen.size(), Math.min(mitarbeiterProProjekt[projekt], 3));
                for (int i = 0; i < projekteZuordnen; i++) {
                    int zugeordneterMitarbeiter = mitarbeiterMitKompetenzen.get(i);
                    zuordnung[zugeordneterMitarbeiter][projekt] = 1;
                }
            }
        }
        printZuordnung(zuordnung);
        return zuordnung;
    }

    private static void printZuordnung(int[][] zuordnung) {
        System.out.println("Zuordnung von Mitarbeitern zu Projekten:");
        // Beschriftung der Projektnummern
        System.out.print("          ");
        for (int projekt = 0; projekt < zuordnung[0].length; projekt++) {
            System.out.print("     Projekt " + projekt + " ");
        }
        System.out.println();

        for (int mitarbeiter = 0; mitarbeiter < zuordnung.length; mitarbeiter++) {
            // Beschriftung der Mitarbeiter
            System.out.print("Mitarbeiter " + mitarbeiter + ":   ");
            for (int projekt = 0; projekt < zuordnung[0].length; projekt++) {
                System.out.print(zuordnung[mitarbeiter][projekt] + "              ");
            }
            System.out.println();
        }
    }

}


