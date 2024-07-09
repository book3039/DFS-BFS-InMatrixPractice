import java.util.LinkedList;
import java.util.Queue;

public class AdjacencyMatrix {

    private final int[][] array;
    private final boolean[] visited;
    private final int vertexSize;

    public AdjacencyMatrix(int vertexSize) {
        array = new int[vertexSize][vertexSize];
        visited = new boolean[vertexSize];
        this.vertexSize = vertexSize;
    }

    public void connect(int vertex1, int vertex2) {
        array[vertex1][vertex2] = 1;
        array[vertex2][vertex1] = 1;
    }

    public void print() {
        for(int i = 0; i < vertexSize; i++) {
            for (int j = 0; j < vertexSize; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void dfs(int index) {
        visited[index] = true;
        System.out.println("DFS : [" + index  + "] is visited");

        for (int i = 0; i < vertexSize; i++) {
            if (!visited[i] && array[index][i] == 1) {
                dfs(i);
            }
        }
    }

    public void bfs(int index) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(index);

        while (!queue.isEmpty()) {
            int current = queue.remove();
            visited[current] = true;
            System.out.println("BFS : [" + current  + "] is visited");
            for (int i = 0; i < vertexSize; i++) {
                if (!visited[i] && array[current][i] == 1) {
                    if (!queue.contains(i)) {
                        queue.add(i);
                    }
                }
            }
            System.out.println("Current queue state: " + queue);
        }
    }

    public void clearVisited() {
        for (int i = 0; i < vertexSize; i++) {
            visited[i] = false;
        }
    }
}
