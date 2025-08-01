package dsa.linkedlists;

public class LinkedListTester {
    public static void main(String[] args) {
        System.out.println("--- Singly Linked List Operations ---");
        SinglyLinkedList list = new SinglyLinkedList();

        list.displayList(); // Should say "List is empty."

        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtTail(5);
        list.insertAtTail(30);
        list.displayList(); // Expected: 20 -> 10 -> 5 -> 30 -> null
//system.out.println is used for output in our screen with new line.
        System.out.println("List length: " + list.getLength()); // Expected: 4

        list.insertAtIndex(15, 2); // Insert 15 at index 2 (after 10)
        list.displayList(); // Expected: 20 -> 10 -> 15 -> 5 -> 30 -> null
        System.out.println("List length: " + list.getLength()); // Expected: 5

        list.search(15);
        list.search(100);

        list.deleteAtHead();
        list.displayList(); // Expected: 10 -> 15 -> 5 -> 30 -> null

        list.deleteAtTail();
        list.displayList(); // Expected: 10 -> 15 -> 5 -> null

        list.insertAtTail(40); // Add something back for next delete test
        list.displayList(); // Expected: 10 -> 15 -> 5 -> 40 -> null

        list.deleteAtIndex(1); // Delete 15 (at index 1)
        list.displayList(); // Expected: 10 -> 5 -> 40 -> null

        list.deleteAtIndex(0); // Delete 10 (at index 0)
        list.displayList(); // Expected: 5 -> 40 -> null

        list.deleteAtIndex(99); // Test out of bounds
        list.displayList();

        list.deleteAtHead(); // Delete 5
        list.deleteAtHead(); // Delete 40
        list.displayList(); // Should be empty

        list.deleteAtHead(); // Try deleting from empty list
    }
}
