public class SearchPractice {
    public static void main(String[] args) {
        AdjacencyMatrix adjacencyMatrix = new AdjacencyMatrix(8);

        adjacencyMatrix.connect(0, 1);
        adjacencyMatrix.connect(0, 2);
        adjacencyMatrix.connect(0, 3);
        adjacencyMatrix.connect(1, 4);
        adjacencyMatrix.connect(3, 5);
        adjacencyMatrix.connect(4, 5);
        adjacencyMatrix.connect(5, 6);
        adjacencyMatrix.connect(5, 7);

        adjacencyMatrix.print();
        adjacencyMatrix.dfs(0);
        adjacencyMatrix.clearVisited();
        adjacencyMatrix.bfs(0);
    }
}
