
class node{
    int data;
    node next;
    node(int data){
    this.data=data;
    next=null;
}
}

public class stackll {
    node top;
    stackll()
    {
        top=null; //means stack is empty
    }
    void push(int data)
    {
        node n = new node(data);
        if(top==null){
            top=n;
        }
        else{
            n.next = top;
            top=n;
        }
    }
    void pop(){
        if(top==null)
            System.out.println("Stack empty");
        else{
            node temp = top;
            top=top.next;
            temp.next=null;
        }
    }
    void peek(){
        if(top==null){
            System.out.println("Empty");
        }
        else{
            System.out.println("top element" + top.data);
        }
    }
    void display(){
                if(top==null){
            System.out.println("Empty");
        }
        else{
            node temp = top;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        stackll s = new stackll();
        s.push(10);
        s.push(30);
        s.push(20);
        s.display();
        s.peek();
        s.pop();
        
    }
}
