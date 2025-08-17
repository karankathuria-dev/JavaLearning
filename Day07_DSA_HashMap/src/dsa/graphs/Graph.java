package dsa.graphs;

import java.util.*;

public class Graph {
    // The adjacency list representation of the graph
    private Map<Integer, List<Integer>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    /**
     * Adds a new node (vertex) to the graph.
     *
     * @param node The integer value of the node.
     */
    public void addNode(int node) {
        adjList.putIfAbsent(node, new LinkedList<>());
    }

    /**
     * Adds an undirected edge between two nodes.
     *
     * @param from The starting node.
     * @param to The ending node.
     */
    public void addEdge(int from, int to) {
        // First, ensure both nodes exist in the graph
        addNode(from);
        addNode(to);

        // Add the edge for an undirected graph (connection in both directions)
        adjList.get(from).add(to);
        adjList.get(to).add(from);
    }

    /**
     * Prints the adjacency list representation of the graph.
     */
    public void printGraph() {
        System.out.println("Graph Adjacency List:");
        for (Integer node : adjList.keySet()) {
            System.out.print("Node " + node + " -> ");
            System.out.println(adjList.get(node));
        }
    }

    // --- Graph Traversal Methods ---

    /**
     * Implements Breadth-First Search (BFS) starting from a given node.
     *
     * @param startNode The node to start the traversal from.
     */
    public void bfs(int startNode) {
        if (!adjList.containsKey(startNode)) {
            System.out.println("Node not found.");
            return;
        }

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(startNode);
        visited.add(startNode);

        System.out.print("\nBFS Traversal (starting from " + startNode + "): ");

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");

            for (int neighbor : adjList.get(currentNode)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    /**
     * Implements Depth-First Search (DFS) starting from a given node.
     *
     * @param startNode The node to start the traversal from.
     */
    public void dfs(int startNode) {
        if (!adjList.containsKey(startNode)) {
            System.out.println("Node not found.");
            return;
        }

        System.out.print("\nDFS Traversal (starting from " + startNode + "): ");
        Set<Integer> visited = new HashSet<>();
        dfsRecursive(startNode, visited);
        System.out.println();
    }

    // Private recursive helper for DFS
    private void dfsRecursive(int currentNode, Set<Integer> visited) {
        visited.add(currentNode);
        System.out.print(currentNode + " ");

        for (int neighbor : adjList.get(currentNode)) {
            if (!visited.contains(neighbor)) {
                dfsRecursive(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();

        // Build a sample graph
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 6);
        graph.addEdge(3, 7);
        graph.addEdge(4, 8);

        graph.printGraph();

        graph.bfs(1);
        graph.dfs(1);
    }
}