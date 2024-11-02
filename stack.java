class Stack {
    int max = 100; // Maximum size of the stack
    int[] a = new int[max]; // Array to store stack elements
    int top;

    // Constructor to initialize the top of the stack
    Stack() {
        top = -1;
    }

    /**
     * Checks if the stack is empty.
     * @return true if stack is empty, false otherwise
     */
    boolean is_empty() {
        return (top < 0);
    }

    /**
     * Pushes an element onto the stack.
     * @param x the element to push
     * @return true if the element is pushed successfully, false if overflow
     */
    boolean push(int x) {
        if (top >= max - 1) { // Check for stack overflow
            System.out.println("Overflow");
            return false;
        } else {
            a[++top] = x; // Increment top and add element
            System.out.println(x + " is pushed into the stack");
            return true;
        }
    }

    /**
     * Removes the top element from the stack.
     * @return the popped element, or 0 if the stack is empty
     */
    int pop() {
        if (top < 0) { // Check for stack underflow
            System.out.println("Underflow");
            return 0;
        } else {
            return a[top--]; // Return the top element and decrement top
        }
    }

    /**
     * Retrieves the top element without removing it.
     * @return the top element, or 0 if the stack is empty
     */
    int peek() {
        if (top < 0) { // Check if the stack is empty
            System.out.println("Stack is empty");
            return 0;
        } else {
            return a[top];
        }
    }

    // Main method to test the stack functionality
    public static void main(String[] args) {
        Stack stk = new Stack(); // Create a new stack
        stk.push(20); // Push element onto the stack
        System.out.println("Top element is: " + stk.peek()); // Peek at the top element

        stk.push(40); // Push another element
        stk.push(60); // Push another element
        System.out.println("Is stack empty? " + stk.is_empty()); // Check if the stack is empty
        System.out.println("Element popped out: " + stk.pop()); // Pop an element
    }
}
