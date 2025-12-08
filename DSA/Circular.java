//Circular Linked list
class Node{
    int data;
    Node next;
    Node(int data){ //defining a constructor
        this.data = data;
        next=null;
    }
}


public class Circular {
    Node head;

    public Circular() {
        head = null;
    }
    void insert(int data){
        Node n = new Node(data);
        if (head == null){
            head = n;
            head.next =n;
        }
        else{
            Node temp = head;
            while(temp.next!=head)
                temp = temp.next;
            temp.next = n;
            n.next = head;
            head=n;
        }
    }
void delete(int data) {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    Node prev = head;
    Node curr = head;

    // Case 1: deleting head
    if (head.data == data) {

        // Only one node in list
        if (head.next == head) {
            head = null;
            return;
        }

        // Find last node
        while (prev.next != head) {
            prev = prev.next;
        }

        head = head.next;       // Move head forward
        prev.next = head;       
        return;
    }

    do {
        prev = curr;
        curr = curr.next;

        if (curr.data == data) {
            prev.next = curr.next;
            return;
        }
    } while (curr != head);

    System.out.println("Data not found");
}


void search(int data)
{
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    Node temp = head;

    do {
        if (temp.data == data) {
            System.out.println("Data found");
            return;
        }
        temp = temp.next;
    } while (temp != head);

    System.out.println("Data not found");
}

void traverse() {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    Node temp = head;

    do {
        System.out.print(temp.data + " => ");
        temp = temp.next;
    } while (temp != head);

    System.out.println("END");
}

    
    public static void main(String[] args) {
        Circular list = new Circular();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.delete(20);
        list.search(10);
        list.traverse();
    }
}
