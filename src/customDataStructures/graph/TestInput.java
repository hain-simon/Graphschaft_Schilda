package customDataStructures.graph;

public class TestInput {

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






    public static int[][] getKompetenzenmatrix(){
        int[][] kompetenzenMatrix = {
                {1, 0, 1, 1, 0, 1},
                {0, 1, 1, 0, 1, 1},
                {1, 1, 1, 0, 1 , 1},
                {0, 1, 0, 1, 0 , 1},
                {0, 0, 1, 0, 1 , 0},
                {1, 0, 1, 1, 0, 1}
        };
        return kompetenzenMatrix;
    }


    public static int[] getMitarbeiterProProjekt(){
        int[] array = {2, 1, 4, 1, 2, 2};
        return array;
    }

    public static int[][] getKompetenzenmatrix2(){
        int[][] kompetenzMatrix = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 0, 0, 0}
        };
        return  kompetenzMatrix;
    }
    public static int[] getMitarbeiterProProjekt2(){
        int[] array = {3, 3, 3, 1};
        return array;
    }
}

/*
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}

       public static int[][] getUndirectedGraoh5(){
        int[][] kompetenzenMatrix = {
                {0,0,1,1,1,0,1}.
                {0,0,1,1,0,0,1},
                {
        };
        return kompetenzenMatrix;
    }
 */
