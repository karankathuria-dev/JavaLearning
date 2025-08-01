package dsa.linkedlists;

public class SinglyLinkedList {
    private Node head; // The first node in the list

    public SinglyLinkedList() {
        this.head = null; // Empty list initially
    }

    // 1. Insert at Head
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // New node points to current head
        head = newNode;      // Head becomes the new node
        System.out.println("Inserted " + data + " at head.");
    }

    // 2. Insert at Tail
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If list is empty, new node is the head
            return;
        }
        Node current = head;
        while (current.next != null) { // Traverse to the last node
            current = current.next;
        }
        current.next = newNode; // Last node points to the new node
        System.out.println("Inserted " + data + " at tail.");
    }

    // 3. Display List
    public void displayList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null"); // Indicate end of list
    }

    // 4. Insert at Specific Index (New for today)
    public void insertAtIndex(int data, int index) {
        if (index < 0) {
            System.out.println("Invalid index. Cannot insert at negative index.");
            return;
        }
        if (index == 0) {
            insertAtHead(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        int count = 0;
        while (current != null && count < index - 1) { // Traverse to the node *before* the insertion point
            current = current.next;
            count++;
        }
        if (current == null) { // Index out of bounds
            System.out.println("Index " + index + " is out of bounds. Cannot insert.");
            return;
        }
        newNode.next = current.next; // New node points to where current was pointing
        current.next = newNode;      // Current points to new node
        System.out.println("Inserted " + data + " at index " + index + ".");
    }

    // 5. Delete at Head (New for today)
    public void deleteAtHead() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete from head.");
            return;
        }
        System.out.println("Deleting " + head.data + " from head.");
        head = head.next; // Head moves to the next node
    }

    // 6. Delete at Tail (New for today)
    public void deleteAtTail() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete from tail.");
            return;
        }
        if (head.next == null) { // Only one node in the list
            System.out.println("Deleting " + head.data + " from tail (only node).");
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) { // Traverse to the second-to-last node
            current = current.next;
        }
        System.out.println("Deleting " + current.next.data + " from tail.");
        current.next = null; // Second-to-last node's 'next' becomes null
    }

    // 7. Delete at Specific Index (New for today)
    public void deleteAtIndex(int index) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        if (index < 0) {
            System.out.println("Invalid index. Cannot delete from negative index.");
            return;
        }
        if (index == 0) {
            deleteAtHead();
            return;
        }
        Node current = head;
        int count = 0;
        while (current != null && count < index - 1) { // Traverse to the node *before* the deletion point
            current = current.next;
            count++;
        }
        if (current == null || current.next == null) { // Index out of bounds or trying to delete non-existent node
            System.out.println("Index " + index + " is out of bounds or node does not exist. Cannot delete.");
            return;
        }
        System.out.println("Deleting " + current.next.data + " at index " + index + ".");
        current.next = current.next.next; // Skip the node to be deleted
    }

    // 8. Search for a value (New for today)
    public boolean search(int target) {
        Node current = head;
        while (current != null) {
            if (current.data == target) {
                System.out.println(target + " found in list.");
                return true;
            }
            current = current.next;
        }
        System.out.println(target + " not found in list.");
        return false;
    }

    // 9. Get Length (New for today)
    public int getLength() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}