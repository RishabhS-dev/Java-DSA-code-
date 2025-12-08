public class qarr {
    int front, rear, size, a[];

    // Constructor to initialize the queue
    qarr(int size) {
        this.size = size;
        a = new int[size];
        front = rear = -1; // Initialize front and rear to -1 for an empty queue
    }

    // Method to add an element to the queue
    void enqueue(int data) {
        if (rear == size - 1) { // Check if the queue is full
            System.out.println("queue full");
        } else {
            rear++; // Increment rear and add the element
            a[rear] = data;
        }
    }

    // Method to remove an element from the queue
    void dequeue() {
        if (front == rear) { // Check if the queue is empty
            System.out.println("queue is empty");
        } else {
            front++; // Increment front to remove the element
            System.out.println("value dequeued is =: " + a[front]);
        }
    }

    // Method to display the elements in the queue
    void display() {
        if (front == rear) { // Check if the queue is empty
            System.out.println("queue is empty");
        } else {
            // Iterate from front+1 to rear to display elements
            for (int i = front + 1; i <= rear; i++) { // Corrected loop condition
                System.out.println("value displayed is =: " + a[i]);
            }
        }
    }

    public static void main(String[] args) {
        // Main method is currently empty, but can be used to test the queue operations
        // Example usage:
        qarr myQueue = new qarr(5);
        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.display();
        myQueue.dequeue();
        myQueue.display();
    }
}