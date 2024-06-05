import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Kota {
    int nodes;
    LinkedList<Integer>[] adjacencyList;

    @SuppressWarnings("unchecked")
    public Kota(int vertex) {
        nodes = vertex;
        adjacencyList = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void insertEdge(int sumber, int dikunjungi) {
        adjacencyList[sumber].add(dikunjungi);
        adjacencyList[dikunjungi].add(sumber);
    }

    public void BFS(int sumber) {
        boolean[] visited = new boolean[nodes];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(sumber);
        visited[sumber] = true;

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(city(currentVertex) + " ");
            for (int neighbor : adjacencyList[currentVertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public void DFS(int sumber) {
        boolean[] visited = new boolean[nodes];
        Stack<Integer> stack = new Stack<>();
        stack.push(sumber);

        while (!stack.isEmpty()) {
            int currentVertex = stack.pop();
            if (!visited[currentVertex]) {
                System.out.print(city(currentVertex) + " ");
                visited[currentVertex] = true;
                for (int neighbor : adjacencyList[currentVertex]) {
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }

    public String city(int i) {
        String[] cities = { "Paris", "Brussels", "Zurich", "Amsterdam", "Vienna", "Prague", "Hamburg", "Warsaw", "Budapest" };
        return cities[i];
    }
}
