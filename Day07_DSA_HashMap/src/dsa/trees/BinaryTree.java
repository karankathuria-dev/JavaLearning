package dsa.trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * A simple implementation of a Binary Tree.
 * For this exercise, we will use a level-order (breadth-first)
 * insertion to build the tree.
 */
public class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    /**
     * Inserts a new node into the tree in a level-order fashion.
     *
     * @param data The data to be inserted.
     */
    public void insert(int data) {
        Node newNode = new Node(data);

        // If the tree is empty, the new node becomes the root
        if (root == null) {
            root = newNode;
            return;
        }

        // Use a Queue to find the first available spot
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();

            // Insert into the left child if it's empty
            if (currentNode.left == null) {
                currentNode.left = newNode;
                return;
            } else {
                queue.add(currentNode.left);
            }

            // Insert into the right child if it's empty
            if (currentNode.right == null) {
                currentNode.right = newNode;
                return;
            } else {
                queue.add(currentNode.right);
            }
        }
    }

    // A simple method to check if the tree has nodes
    public boolean isEmpty() {
        return root == null;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        System.out.println("Is the tree empty? " + tree.isEmpty()); // Expected: true

        // Insert some nodes
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);

        System.out.println("Is the tree empty? " + tree.isEmpty()); // Expected: false

        System.out.println("Binary Tree successfully created!");
        System.out.println("Root is: " + tree.root.data);
        System.out.println("Root's left child is: " + tree.root.left.data);
        System.out.println("Root's right child is: " + tree.root.right.data);
    }
}