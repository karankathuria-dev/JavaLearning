package dsa.graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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

    public static void main(String[] args) {
        Graph graph = new Graph();

        // Add nodes
        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        graph.addNode(4);

        // Add edges to create connections
        // (1, 2)
        // (1, 3)
        // (2, 3)
        // (4, 1)
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(4, 1);

        // Print the final graph structure
        graph.printGraph();
    }
}