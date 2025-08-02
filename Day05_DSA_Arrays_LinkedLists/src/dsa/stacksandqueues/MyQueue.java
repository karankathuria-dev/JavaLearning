package dsa.stacksandqueues;

// Re-use your Node class
// ... (Node class defined above)

public class MyQueue {
    private Node head; // The front of the queue
    private Node tail; // The end of the queue

    public MyQueue() {
        this.head = null;
        this.tail = null;
    }

    // Enqueue: Adds an element to the end of the queue (like insertAtTail)
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println("Enqueued " + data + " to the queue.");
    }

    // Dequeue: Removes the front element and returns its value (like deleteAtHead)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Or throw an exception
        }
        int dequeuedValue = head.data;
        head = head.next;
        if (head == null) { // If the queue becomes empty
            tail = null;
        }
        System.out.println("Dequeued " + dequeuedValue + " from the queue.");
        return dequeuedValue;
    }

    // Peek: Returns the front element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No element to peek.");
            return -1; // Or throw an exception
        }
        return head.data;
    }

    // isEmpty: Checks if the queue is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Optional: Print the queue for verification
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        Node current = head;
        System.out.print("Queue (Front to Back): ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}