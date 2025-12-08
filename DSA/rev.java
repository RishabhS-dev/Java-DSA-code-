public class rev {

    Node head; 
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void reverse() {
        if (head == null || head.next == null) { 
            System.out.println("List is empty or has only one node, no reversal needed.");
            return;
        }

        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; 
            current.next = prev; 
            prev = current;      
            current = next;      
        }
        head = prev;
    }

public class LinkedListReverser {
    
    // Assumed Node class definition within or accessible to the main class
    private static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    private Node head; // The head of the list

    // Main method to initiate the recursive reversal
    public void reverseRecursively() {
        head = reverseHelper(head);
    }

    // The actual recursive helper function
    private Node reverseHelper(Node currentHead) {
        // Base Case 1: If the list is empty (null), return null.
        if (currentHead == null) {
            return null;
        }

        // Base Case 2: If we are at the last node, this node becomes the new head of the reversed list.
        if (currentHead.next == null) {
            return currentHead;
        }

        // Recursive Step: Call the helper on the rest of the list (everything after the current node)
        // 'newHead' will eventually be the very last node of the original list.
        Node newHead = reverseHelper(currentHead.next);

        // Reversal Logic:
        // 'currentHead.next' points to the *next* node in the original list.
        // We make that 'next' node point *back* to the 'currentHead'.
        currentHead.next.next = currentHead;

        // Break the original forward link of the current node. This must be null 
        // to ensure the original head (which becomes the new tail) ends the list.
        currentHead.next = null;

        // Return the new head of the now-reversed sublist (which is the same newHead 
        // returned all the way up the stack frames).
        return newHead;
    }

    // ... (Add methods for add, print, etc., for a complete example) ...
}


    public static void main(String[] args) {
        rev list = new rev();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.print("Original list: ");
        list.printList();

        list.reverse();

        System.out.print("Reversed list: ");
        list.printList();

    }
}