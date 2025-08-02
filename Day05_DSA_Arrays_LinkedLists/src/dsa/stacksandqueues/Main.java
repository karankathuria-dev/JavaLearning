package dsa.stacksandqueues;

public class Main {
    public static void main(String[] args) {
        // --- Testing MyStack ---
        System.out.println("--- Testing MyStack (LIFO) ---");
        MyStack stack = new MyStack();

        // 1. Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // Expected: true

        // 2. Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.displayStack(); // Expected: 30 -> 20 -> 10 -> null

        // 3. Peek at the top element
        System.out.println("Top element is: " + stack.peek()); // Expected: 30
        stack.displayStack(); // Stack should not be changed. Expected: 30 -> 20 -> 10 -> null

        // 4. Pop elements from the stack
        System.out.println("Popped element: " + stack.pop()); // Expected: 30
        System.out.println("Popped element: " + stack.pop()); // Expected: 20
        stack.displayStack(); // Expected: 10 -> null

        // 5. Check if stack is empty again
        System.out.println("Is stack empty? " + stack.isEmpty()); // Expected: false

        // 6. Pop the last element and check for empty
        System.out.println("Popped element: " + stack.pop()); // Expected: 10
        System.out.println("Is stack empty? " + stack.isEmpty()); // Expected: true

        // 7. Test edge case: popping from an empty stack
        stack.pop(); // Expected: "Stack is empty..." message
        stack.peek(); // Expected: "Stack is empty..." message

        System.out.println("\n");

        // --- Testing MyQueue ---
        System.out.println("--- Testing MyQueue (FIFO) ---");
        MyQueue queue = new MyQueue();

        // 1. Check if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty()); // Expected: true

        // 2. Enqueue elements
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);
        queue.displayQueue(); // Expected: 100 -> 200 -> 300 -> null

        // 3. Peek at the front element
        System.out.println("Front element is: " + queue.peek()); // Expected: 100
        queue.displayQueue(); // Queue should not be changed. Expected: 100 -> 200 -> 300 -> null

        // 4. Dequeue elements
        System.out.println("Dequeued element: " + queue.dequeue()); // Expected: 100
        System.out.println("Dequeued element: " + queue.dequeue()); // Expected: 200
        queue.displayQueue(); // Expected: 300 -> null

        // 5. Check if queue is empty again
        System.out.println("Is queue empty? " + queue.isEmpty()); // Expected: false

        // 6. Dequeue the last element and check for empty
        System.out.println("Dequeued element: " + queue.dequeue()); // Expected: 300
        System.out.println("Is queue empty? " + queue.isEmpty()); // Expected: true

        // 7. Test edge case: dequeuing from an empty queue
        queue.dequeue(); // Expected: "Queue is empty..." message
        queue.peek(); // Expected: "Queue is empty..." message
    }
}