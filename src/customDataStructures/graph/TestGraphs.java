package customDataStructures.graph;

public class TestGraphs {

    public static Graph<Integer> getGraph1(){
        int[][] graphArr = new int[][]{
                {0, 10, 0, 0, 0, 15},
                {10, 0, 10, 0, 3, 0},
                {0, 10, 0, 20, 0, 0},
                {0, 0, 20, 0, 7, 0},
                {0, 3, 0, 7, 0, 4},
                {15, 0, 0, 0, 4, 0}
        };

        return new Graph<>(graphArr);
    }
}
