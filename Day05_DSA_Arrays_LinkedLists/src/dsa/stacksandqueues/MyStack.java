package dsa.stacksandqueues;

// Re-use your Node class or create it here.
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MyStack {
    private Node head; // Renamed from 'head' to 'top' for clarity

    public MyStack() {
        this.head = null;
    }

    // Push: Adds an element to the top of the stack (like insertAtHead)
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Pushed " + data + " onto the stack.");
    }

    // Pop: Removes the top element and returns its value (like deleteAtHead)
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Or throw an exception
        }
        int poppedValue = head.data;
        head = head.next;
        System.out.println("Popped " + poppedValue + " from the stack.");
        return poppedValue;
    }

    // Peek: Returns the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No element to peek.");
            return -1; // Or throw an exception
        }
        return head.data;
    }

    // isEmpty: Checks if the stack is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Optional: Print the stack for verification
    public void displayStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        Node current = head;
        System.out.print("Stack (Top to Bottom): ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}