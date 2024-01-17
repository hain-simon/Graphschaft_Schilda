package problemImplementations;
import customDataStructures.FordFulkerson;
import customDataStructures.FordFulkerson.maxFlowSolution;
import customDataStructures.graph.Graph;

import java.util.*;

public class ProjektAufgaben {
    private static List<Integer> mitarbeiter = new ArrayList<>();
    private static List<Integer> projekte = new ArrayList<>();
    private static int[][] zuordnung;

    public static int[][] projekteZuteilen(int[][] array){
        Graph<Integer> graph = new Graph<>(array);
        int[][] flowArray = FordFulkerson.getMaxFlow(graph, graph.vertices.get(0), graph.vertices.get(array.length-1)).flowGraph;
        for (int i = 0; i < flowArray[0].length; i++){
            if(flowArray[0][i] > 0){
                mitarbeiter.add(i);
            }
        }
        for (int i = 0; i < flowArray.length; i++ ){
            if(flowArray[i][flowArray.length-1] > 0){
                projekte.add(i);
            }
        }

        System.out.println("Anzahl Mitarbeiter: "+mitarbeiter.size());
        System.out.println("Anzahl Projekte: "+projekte.size());

        zuordnung = new int[mitarbeiter.size()][projekte.size()];

        for(int i=0; i<mitarbeiter.size(); i++){
            for (int a=0; a<projekte.size(); a++){
                if (flowArray[mitarbeiter.get(i)][projekte.get(a)] >0){
                    zuordnung[i][a] = 1;
                }
            }
        }

        printZuordnung(zuordnung);
        return zuordnung;
    }

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