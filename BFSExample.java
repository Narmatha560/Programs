import java.util.*;

class Graph
 {
    private Map<Integer, List<Integer>> adjList;

    public Graph(){
        adjList = new HashMap<>();
    }

    public void addVertex(int vertex){
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(int start, int end){
        adjList.get(start).add(end);
        adjList.get(end).add(start);
    }

    public void bfs(int start){
        Set<Integer> visited = new HashSet<>();
        LinkedList<Integer> queue=new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (!visited.contains(current)) {
                visited.add(current);
                System.out.print(current + " ");

                for (int neighbor : adjList.get(current)) {
                    if (!visited.contains(neighbor)) {
                        queue.add(neighbor);
                    }
                }
            }
        }
    }
}

public class BFSExample {
    public static void main (String[] args) {
        Graph graph = new Graph();

        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);

        graph.addEdge(0, 1);
        graph.addEdge(3, 2);
        graph.addEdge(3, 1);
        graph.addEdge(1, 2);

        System.out.println("BFS starting from vertex 0:");
        graph.bfs(0);
    }
}


