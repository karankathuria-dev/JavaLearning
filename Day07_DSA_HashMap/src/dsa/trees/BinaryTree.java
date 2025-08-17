package dsa.trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();

            if (currentNode.left == null) {
                currentNode.left = newNode;
                return;
            } else {
                queue.add(currentNode.left);
            }

            if (currentNode.right == null) {
                currentNode.right = newNode;
                return;
            } else {
                queue.add(currentNode.right);
            }
        }
    }

    // --- Traversal Methods ---

    // 1. Inorder Traversal (Left -> Root -> Right)
    public void inorderTraversal() {
        System.out.print("Inorder Traversal: ");
        inorderRecursive(root);
        System.out.println();
    }

    private void inorderRecursive(Node node) {
        if (node != null) {
            inorderRecursive(node.left);
            System.out.print(node.data + " ");
            inorderRecursive(node.right);
        }
    }

    // 2. Preorder Traversal (Root -> Left -> Right)
    public void preorderTraversal() {
        System.out.print("Preorder Traversal: ");
        preorderRecursive(root);
        System.out.println();
    }

    private void preorderRecursive(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderRecursive(node.left);
            preorderRecursive(node.right);
        }
    }

    // 3. Postorder Traversal (Left -> Right -> Root)
    public void postorderTraversal() {
        System.out.print("Postorder Traversal: ");
        postorderRecursive(root);
        System.out.println();
    }

    private void postorderRecursive(Node node) {
        if (node != null) {
            postorderRecursive(node.left);
            postorderRecursive(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Build a sample tree
        //         10
        //        /  \
        //      20    30
        //     /  \
        //   40    50
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);

        System.out.println("Tree built successfully. Now let's traverse it.\n");

        tree.inorderTraversal();
        tree.preorderTraversal();
        tree.postorderTraversal();
    }
}