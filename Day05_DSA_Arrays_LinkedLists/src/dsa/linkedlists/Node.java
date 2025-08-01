package dsa.linkedlists;

public class Node {
    public int data; // Data stored in the node
    public Node next; // Reference to the next node in the list

    public Node(int data) {
        this.data = data;
        this.next = null; // Initially, points to nothing
    }
}