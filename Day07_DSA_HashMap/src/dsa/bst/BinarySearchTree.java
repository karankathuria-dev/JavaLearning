package dsa.bst;

// Assuming the Node.java file is in the same package


public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    // Public insert method that calls the private recursive helper
    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    // Private recursive helper method for insertion
    private Node insertRecursive(Node current, int data) {
        // Base case: if the current node is null, create a new node and return it
        if (current == null) {
            return new Node(data);
        }

        // Recursive step: go left if the data is smaller
        if (data < current.data) {
            current.left = insertRecursive(current.left, data);
        }
        // Recursive step: go right if the data is larger
        else if (data > current.data) {
            current.right = insertRecursive(current.right, data);
        }
        // Data already exists, do nothing (or handle as needed)

        return current;
    }

    // Public search method that calls the private recursive helper
    public boolean search(int data) {
        return searchRecursive(root, data);
    }

    // Private recursive helper method for searching
    private boolean searchRecursive(Node current, int data) {
        // Base case 1: if the current node is null, the value is not in the tree
        if (current == null) {
            return false;
        }

        // Base case 2: if the current node's data matches the target, the value is found
        if (data == current.data) {
            return true;
        }

        // Recursive step: go left if the data is smaller
        if (data < current.data) {
            return searchRecursive(current.left, data);
        }
        // Recursive step: go right if the data is larger
        else {
            return searchRecursive(current.right, data);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Insert a series of numbers to build the BST
        System.out.println("Inserting elements: 8, 3, 10, 1, 6, 14, 4, 7, 13");
        bst.insert(8);
        bst.insert(3);
        bst.insert(10);
        bst.insert(1);
        bst.insert(6);
        bst.insert(14);
        bst.insert(4);
        bst.insert(7);
        bst.insert(13);

        System.out.println("--------------------");

        // Test search for a value that exists
        int target1 = 6;
        if (bst.search(target1)) {
            System.out.println("Search for " + target1 + ": Found!");
        } else {
            System.out.println("Search for " + target1 + ": Not found.");
        }

        // Test search for a value that does not exist
        int target2 = 9;
        if (bst.search(target2)) {
            System.out.println("Search for " + target2 + ": Found!");
        } else {
            System.out.println("Search for " + target2 + ": Not found.");
        }
    }
}