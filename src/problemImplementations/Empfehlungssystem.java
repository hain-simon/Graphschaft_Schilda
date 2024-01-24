package problemImplementations;

import customDataStructures.CustomArrayList;
import customDataStructures.Djikstra;
import customDataStructures.graph.Graph;
import customDataStructures.graph.Vertex;

import java.util.Random;

public class Empfehlungssystem {

    /**
     * This Method takes in a Graph in the form of an int[][], a nodeNum and a "SearchingFor"-Tag
     *
     * It calculates the distances from the starting Number and returns a random Sightseeing Location within a maximum Distance.
     * @param input
     * @return
     */
    public static int solve(int[][] input, int num, String searchingFor){
        int maxDist = Integer.MAX_VALUE;
        switch (searchingFor){
            case "Offen für Neues":
                maxDist = 10;
                break;
            case "Langzeittrip":
                maxDist = 5;
                break;
            case "Kurzzeittrip":
                maxDist = 3;
                break;
            default:
                System.out.println("Invalid Input");
                return num;
        }

        Graph<Integer> graph = new Graph<>(input);
        CustomArrayList<Vertex<Integer>> list = Djikstra.getDistances(graph, graph.vertices.get(num));

        CustomArrayList<Integer> possibleLocations = new CustomArrayList<>();

        for(Vertex<Integer> vertex : list){
            if(vertex.value <= maxDist) possibleLocations.add(vertex.name);
        }

        int numOfLocations = possibleLocations.size();

        Random random = new Random();
        int locationNum = random.nextInt(numOfLocations);

        System.out.println("You should visit Location Num: " + locationNum);
        return locationNum;


    }
}
