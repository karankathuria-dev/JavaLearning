package dsa.trees;

/**
 * The basic building block of a Tree.
 * Each node holds data and references to its children.
 */
public class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}