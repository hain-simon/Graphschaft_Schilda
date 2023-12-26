package problemImplementations.Eiszeit;

public class GraphBuilder {
    public static undirectedGraph buildGraphFromMatrix(int[][] matrix) {
        int vertices = matrix.length;

        undirectedGraph graph = new undirectedGraph(vertices);

        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    graph.addEdge(i, j);
                }
            }
        }

        return graph;
    }
}
