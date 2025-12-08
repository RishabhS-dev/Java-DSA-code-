//import java.util.*; // This import is not strictly necessary for the linked list, but might be needed for other utility classes.

// Node to doubly linked list
class Node {
    int data;
    Node right; // Renamed from 'right' to 'next' for clarity and common convention
    Node left;  // Renamed from 'left' to 'prev' for clarity and common convention

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class prob {
    Node head, tail;

    prob() {
        head = tail = null;
    }

    // Insert a new node at the beginning of the list
    void insertAtFirst(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = tail = n;
        } else {
            n.right = head;
            head.left = n;
            head = n;
        }
    }

    // Insert a new node at the end of the list
    void insertAtLast(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = tail = n;
        } else {
            tail.right = n;
            n.left = tail;
            tail = n;
        }
    }

    // Insert a new node at a specific position
    void insertAtPos(int data, int pos) {
        if (pos < 0) {
            System.out.println("Invalid position. Position cannot be negative.");
            return;
        }
        if (pos == 0) {
            insertAtFirst(data);
            return;
        }
        Node n = new Node(data);
        if (head == null) {
            if (pos == 0) { // If list is empty, insert at first if position is 0
                head = tail = n;
            } else {
                System.out.println("List is empty. Cannot insert at position " + pos);
            }
            return;
        }

        Node curr = head;
        for (int i = 0; i < pos - 1 && curr != null; i++) {
            curr = curr.right;
        }

        if (curr == null && pos > 0) { // If pos is beyond the end of the list
            insertAtLast(data); // Insert at last
            return;
        }
        if (curr == null) { // If curr is null after loop, means pos was too large for a non-empty list
            System.out.println("Position out of bounds.");
            return;
        }

        n.right = curr.right;
        n.left = curr;
        if (curr.right != null) {
            curr.right.left = n;
        } else { // If inserting at the new tail
            tail = n;
        }
        curr.right = n;
    }

    // Delete the first node
    void deleteAtFirst() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            head = head.right;
            if (head != null) { // If list is not empty after deletion
                head.left = null;
            } else { // If list becomes empty after deletion
                tail = null;
            }
            temp.right = null; // Disconnect the old head
        }
    }

    // Delete the last node
    void deleteAtLast() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head == tail) { // Only one node in the list
            head = tail = null;
        } else {
            Node temp = tail;
            tail = tail.left;
            tail.right = null;
            temp.left = null; // Disconnect the old tail
        }
    }

    // Delete a node at a specific position
    void deleteAtPosition(int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (pos < 0) {
            System.out.println("Invalid position. Position cannot be negative.");
            return;
        }
        if (pos == 0) {
            deleteAtFirst();
            return;
        }

        Node curr = head;
        for (int i = 0; i < pos && curr != null; i++) {
            curr = curr.right;
        }

        if (curr == null) { // Position out of bounds
            System.out.println("Position out of bounds.");
            return;
        }

        if (curr == tail) { // Deleting the tail node
            deleteAtLast();
            return;
        }

        curr.left.right = curr.right;
        curr.right.left = curr.left;
        curr.left = null;
        curr.right = null;
    }

    // Search for a specific data value in the list
    void search(int data) {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            int count = 0;
            while (temp != null) { // Corrected loop condition
                if (temp.data == data) {
                    System.out.println("Data found at position: " + count);
                    return; // Exit after finding the data
                }
                temp = temp.right;
                count++;
            }
            System.out.println("Data not found in the list.");
        }
    }

    // Traverse the list from tail to head and print data
    void traverseTtoH() {
        if (head == null) {
            System.out.println("List is empty."); // Corrected message
        } else {
            Node temp = tail; // Corrected variable name
            while (temp != null) { // Corrected loop condition
                System.out.print(temp.data + "<->"); // Changed separator for clarity
                temp = temp.left;
            }
            System.out.println("null"); // Indicate end of list
        }
    }

    // Traverse the list from head to tail and print data
    void traverseHtoT() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "<->");
                temp = temp.right;
            }
            System.out.println("null");
        }
    }


    public static void main(String[] args) { // Corrected main method signature
        prob list = new prob(); // Create an instance of the prob class

        list.insertAtFirst(10);
        list.insertAtLast(20);
        list.insertAtFirst(5);
        list.insertAtPos(15, 2); // Insert 15 at position 2 (0-indexed)
        list.traverseHtoT(); // Expected: 5<->10<->15<->20<->null
        list.traverseTtoH(); // Expected: 20<->15<->10<->5<->null

        list.deleteAtFirst();
        list.traverseHtoT(); // Expected: 10<->15<->20<->null

        list.deleteAtLast();
        list.traverseHtoT(); // Expected: 10<->15<->null

        list.deleteAtPosition(0); // Delete 10 (at position 0)
        list.traverseHtoT(); // Expected: 15<->null

        list.search(15);
        list.search(100);
    }
}

