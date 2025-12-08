public class stackarr {
        int top,size,a[];
        stackarr(int size){
            this.size = size;
            a = new int[size];
            top=-1;
        }

        void push(int data)
        {
            if(top == size-1)
                System.out.print("Stack overflow");
            else{
                top++;
                a[top]=data;
            }
        }
        
        void pop(){
            if(top == -1)
                System.out.println("stack empty");
            else{
                int x=a[top];
                top--;
                System.out.println("Data removed"+x);
            }
        }
        void peek(){
            if(top == -1)
                System.out.println("stack empty");
            else{
                int x=a[top];
                System.out.println("Data at Top"+x);
        }}
        void display(){
            if(top == -1)
                System.out.println("stack empty");
            else{
                for(int i=top ; i>=0;i--){
                    System.out.println(a[i]);
                }
            }
        }
    public static void main(String[] args) {
        stackarr s = new stackarr(10);
        s.push(10);
        s.push(30);
        s.push(20);
        s.display();
        s.peek();
        s.pop();
        
    }
}
