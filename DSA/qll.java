
class node{
    int data;
    node next;

    node(int data){
        this.data=data;
        next=null;
    }
}

public class qll {
    node front,rear;
    qll(){
        front=rear=null;
    }
    void enqueue(int data){
        node n= new node(data);
        if (rear==null){
            front = n;
            rear = n;
        }
        else{
            rear.next=n;
            rear=n;
        }
    }

    void dequeue() {
        if (front == null) { // Check front for empty queue
            System.out.println("empty queue");
        } else {
            front = front.next; // Move front to the next node
            if (front == null) { // If front becomes null, the queue is now empty
                rear = null; // Update rear as well
            }
        }
    }
    void display(){
        if(rear==null){
            System.out.println("queue empty");
        }
        else{
            node temp =front;
            while(temp!=null){
                System.out.println("queue =>" +temp.data);
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        qll queue = new qll();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display(); 
        queue.dequeue();
        queue.display();
    }
}
