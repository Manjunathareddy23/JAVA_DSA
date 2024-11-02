class Queue {
    int max = 100;
    int front;
    int rear;
    int[] a = new int[max];

    // Constructor to initialize front and rear
    Queue() {
        front = -1;
        rear = -1;
    }

    // Checks if the queue is empty
    boolean is_empty() {
        return front == -1 && rear == -1;
    }

    // Inserts an element in the queue
    boolean enqueue(int x) {
        if (rear == max - 1) { // Check for queue overflow
            System.out.println("Overflow");
            return false;
        } else {
            if (is_empty()) {
                front = 0; // Initialize front if the queue was empty
            }
            a[++rear] = x; // Increment rear and add the element
            System.out.println(x + " is inserted at position " + rear);
            return true;
        }
    }

    // Removes an element from the queue
    int dequeue() {
        if (is_empty()) { // Check for queue underflow
            System.out.println("Underflow");
            return 0;
        } else {
            int result = a[front];
            if (front == rear) {
                // Queue is now empty after dequeue
                front = -1;
                rear = -1;
            } else {
                front++; // Move front to the next element
            }
            System.out.println(result + " is removed from the queue");
            return result;
        }
    }

    // Main method to test the queue functionality
    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println("Is queue empty? " + q.is_empty());
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        System.out.println("Is queue empty? " + q.is_empty());
    }
}
