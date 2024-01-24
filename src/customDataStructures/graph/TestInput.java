package customDataStructures.graph;

public class TestInput {

    public static int[][] HistorischeFunde_TestGraph(){
        int[][] graphArr = new int[][]{
                {0, 4, 2, 1, 0, 0},
                {4, 0, 0, 0, 3, 0},
                {2, 0, 0, 0, 0, 3},
                {1, 0, 0, 0, 2, 0},
                {0, 3, 0, 2, 0, 3},
                {0, 0, 3, 0, 3, 0}
        };
        return graphArr;
    }

    public static int[][] Winterwege_TestGraph(){
        return HistorischeFunde_TestGraph();
    }

    public int[][] Aktivitaetsdiagramm_TestGraph(){
        int[][] graphArr = new int[][]{
                {0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0},
                {0, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 0}
        };
        return graphArr;
    }

    public int[][] Bierlieferung_TestGraph(){
        int[][] graphArr = new int[][]{
                {0, 7, 0, 4, 10, 0},
                {0, 0, 1, 0, 0, 3},
                {0, 0, 0, 0, 0, 2},
                {0, 0, 3, 0, 0, 7},
                {0, 0, 0, 12, 0, 4},
                {0, 0, 0, 0, 0, 0}
        };
        return graphArr;
    }

    public int[][] ProjektAufgaben_TestGraph(){
        int[][] graphArr = new int[][]{
                {0, 3, 3, 3, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        return graphArr;
    }

    public int[][] Eiszeit_TestGraph(){
        int[][] graphArr = new int[][]{
                {0, 1, 1, 0, 0, 1},
                {1, 0, 1, 0, 1, 0},
                {1, 1, 0, 1, 0, 0},
                {0, 0, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1},
                {1, 0, 0, 0, 1, 0}
        };
        return graphArr;
    }

    public int[][] Empfehlungssystem_TestGraph(){
        int[][] graphArr = new int[][]{
                {0, 10, 4, 0, 0, 2},
                {10, 0, 4, 0, 3, 0},
                {4, 4, 0, 11, 0, 0},
                {0, 0, 11, 0, 2, 0},
                {0, 3, 0, 2, 0, 6},
                {2, 0, 0, 0, 6, 0}
        };
        return graphArr;
    }



    public static int[][] getUndirectedGraph1(){
        int[][] graphArr = new int[][]{
                {0, 10, 0, 0, 0, 15},
                {10, 0, 10, 0, 3, 0},
                {0, 10, 0, 20, 0, 0},
                {0, 0, 20, 0, 7, 0},
                {0, 3, 0, 7, 0, 4},
                {15, 0, 0, 0, 4, 0}
        };
        return graphArr;
    }

    public static int[][] getUndirectedGraph2(){
        int[][] graphArr = new int[][]{
                {0, 7, 0, 2, 0, 4}, //Vertex 0 has connection to Vertex 1 with weight 7, Vertex 3 with weight 2 ...
                {7, 0, 1, 0, 0, 0}, //Vertex 1 has connection to Vertex 0 with weight 7 ....
                {0, 1, 0, 5, 0, 0},
                {2, 0, 5, 0, 10, 1},
                {0, 0, 0, 10, 0, 5},
                {4, 0, 0, 1, 5, 0}
        };
        return graphArr;
    }

    public static int[][] getFordFulkersonGraph(){
        int[][] graphArr = new int[][]{
                {0, 3, 3, 3, 0, 0, 3, 0, 0, 0}, //Vertex 0 has connection to Vertex 1 with weight 7, Vertex 3 with weight 2 ...
                {0, 0, 0, 0, 1, 1, 0, 1, 1, 0}, //Vertex 1 has connection to Vertex 0 with weight 7 ....
                {0, 0, 0, 0, 1, 1, 0, 1, 1, 0},
                {0, 0, 0, 0, 1, 1, 0, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 3},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        };
        return graphArr;
    }



    public static int[][] getDirectedGraph1(){
        int[][] graphArr = new int[][]{
                {0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0}
        };
        return graphArr;
    }










    public static int[][] getUndirectedGraph4(){
        int[][] kompetenzenMatrix = {
                {1,0,1,1,1,0,1},
                {0,1,1,1,0,0,1},
                {1,1,0,1,0,1,0},
                {1,1,1,1,0,0,1},
                {1,0,1,0,1,1,0},
                {0,0,1,0,1,1,0},
                {1,1,1,1,0,0,1}
                };
        return kompetenzenMatrix;
    }

    public static int[][] getUndirectedGraph3(){
        int[][] kompetenzenMatrix = {
                {1,1,1,0},
                {1,1,1,1},
                {1,1,1,1},
                {0,1,1,1}
        };
        return kompetenzenMatrix;
}

    public static int[][] getUndirectedGraph5() {
        int[][] kompetenzenMatrix = {
                {0, 1, 0, 0, 1, 0, 0, 0, 0, 0},
                {1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {1, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0}
        };
        return kompetenzenMatrix;
    }

    public static int[][] getDirectedGraph4() {
        int[][] kompetenzenMatrix = {
                {0, 1, 0, 0, 2, 0, 0, 0, 0, 0},
                {0, 0, 3, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 4, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 5, 0, 0},
                {0, 0, 0, 0, 0, 6, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 7, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 8},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 9},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        return kompetenzenMatrix;
    }

    public static int[][] getDirectedGraph3() {
        int[][] kompetenzenMatrix = {
                {0, 1, 0, 0, 2, 0, 0},
                {0, 0, 3, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 4},
                {0, 0, 0, 0, 5, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 6, 0}
        };
        return kompetenzenMatrix;
    }

    public static int[][] directedGewichtet2() {
        int[][] kompetenzenMatrix = {
                {0, 1, 0, 0, 2, 0, 0, 0, 0, 0},
                {1, 0, 3, 0, 0, 0, 0, 0, 0, 0},
                {0, 3, 0, 0, 0, 0, 4, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 5, 0, 0},
                {2, 0, 0, 0, 0, 6, 0, 0, 0, 0},
                {0, 0, 0, 0, 6, 0, 0, 0, 0, 0},
                {0, 0, 4, 0, 0, 0, 0, 0, 7, 0},
                {0, 0, 0, 5, 0, 0, 0, 0, 0, 8},
                {0, 0, 0, 0, 0, 0, 7, 0, 0, 9},
                {0, 0, 0, 0, 0, 0, 0, 8, 9, 0}
        };
        return kompetenzenMatrix;
    }

    public static int[][] directedGewichtet1() {
        int[][] kompetenzenMatrix = {
                {0, 1, 0, 0, 2, 0, 0},
                {0, 0, 3, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 4},
                {0, 0, 0, 0, 5, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 6, 0}
        };
        return kompetenzenMatrix;
    }

    public static int[][] UndirectedGewichtet1() {
        int[][] kompetenzenMatrix = {
                {0, 1, 0, 0, 2, 0, 0},
                {1, 0, 3, 0, 0, 0, 0},
                {0, 3, 0, 0, 0, 0, 4},
                {0, 0, 0, 0, 5, 0, 0},
                {2, 0, 0, 5, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 4, 0, 0, 0, 0}
        };
        return kompetenzenMatrix;
    }

    public static int[][] UndirectedGewichtet2() {
        int[][] kompetenzenMatrix = {
                {0, 1, 0, 0, 2, 0, 0, 0, 0, 0},
                {1, 0, 3, 0, 0, 0, 0, 0, 0, 0},
                {0, 3, 0, 0, 0, 0, 4, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 5, 0, 0},
                {2, 0, 0, 0, 0, 6, 0, 0, 0, 0},
                {0, 0, 0, 0, 6, 0, 0, 0, 0, 0},
                {0, 0, 4, 0, 0, 0, 0, 0, 7, 0},
                {0, 0, 0, 5, 0, 0, 0, 0, 0, 8},
                {0, 0, 0, 0, 0, 0, 7, 0, 0, 9},
                {0, 0, 0, 0, 0, 0, 0, 8, 9, 0}
        };
        return kompetenzenMatrix;
    }
}

/*
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}


    }
 */
