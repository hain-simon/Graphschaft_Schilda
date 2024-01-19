package problemImplementations;
import customDataStructures.CustomArrayList;
import customDataStructures.CustomLinkedList;
import customDataStructures.FordFulkerson;
import customDataStructures.FordFulkerson.maxFlowSolution;
import customDataStructures.graph.Graph;

import java.util.*;

public class ProjektAufgaben {
    //Deklarieren der Liste Mitarbeiter, der Liste projekte und des Arrays zuordnung
    private static CustomArrayList<Integer> mitarbeiter = new CustomArrayList<>();
    private static CustomArrayList<Integer> projekte = new CustomArrayList<>();
    //zuordnung Array ist das Array, in welchem am Ende das Ergebnis gespeichert ist
    private static int[][] zuordnung;

    //Methode, um die Mitarbeiter den projekten zuzordnen
    public static int[][] projekteZuteilen(int[][] array){

        Graph<Integer> graph = new Graph<>(array); //aus dem Array, welches der Methode übergeben wird, wird ein Graph erstellt
        int[][] flowArray = FordFulkerson.getMaxFlow(graph, graph.vertices.get(0), graph.vertices.get(array.length-1)).flowGraph;//der Flowgraph, der entsteht, wenn man den Ford Fulkerson Alg. aufruft  wird im zweidimensionalen Array flowArray gespeichert

        //Zuordnung, welcher Knoten Mitarbeiter ist. Speichern in Liste Mitarbeiter
        for (int i = 0; i < flowArray[0].length; i++){
            if(flowArray[0][i] > 0){
                mitarbeiter.add(i);
            }
        }
        //Zuordnung, welcher Knoten Projekt ist. Speichern in Liste Projekte
        for (int i = 0; i < flowArray.length; i++ ){
            if(flowArray[i][flowArray.length-1] > 0){
                projekte.add(i);
            }
        }

        System.out.println("Anzahl Mitarbeiter: "+mitarbeiter.size());
        System.out.println("Anzahl Projekte: "+projekte.size());

        //initialisieren Array zuordnung --> Spalten = Projekte; Zeilen = Mitarbeiter
        zuordnung = new int[mitarbeiter.size()][projekte.size()];

        //Auslesen aus flowArray, welcher Mitarbeiter welches Projekt bearbeitet und speicher in zuordnung
        for(int i=0; i<mitarbeiter.size(); i++){
            for (int a=0; a<projekte.size(); a++){
                if (flowArray[mitarbeiter.get(i+1)][projekte.get(a+1)] >0){
                    zuordnung[i][a] = 1;
                }
            }
        }

        //Ausgeben des Arrays Zuordnung
        printZuordnung(zuordnung);
        return zuordnung;
    }

    //Ausgeben eines zweidimensionalen Arrays
    private static void printZuordnung(int [][] array ){
        System.out.print("                ");
        for (int a = 0; a< array[0].length; a++){
            System.out.print("Projekt "+(a+1)+ "  ");
        }
        System.out.println();
        for (int i = 0; i< array.length; i++){
            System.out.print("Mitarbeiter "+(i+1)+": ");
            for (int a = 0; a< array[i].length; a++){
                System.out.print("    "+array[i][a]+"      ");
            }
            System.out.println();
        }
    }
}