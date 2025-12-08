class node {
    int data;
    node left;
    node right;

    public node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class binarysearchtree {
    node root;

    binarysearchtree() {
        root = null;
    }

    void insert(int data) {
        node newNode = new node(data);
        if (root == null) {
            root = newNode;
        } else {
            node current = root; 
            node parent = null;
            while (current != null) {
                parent = current;
                if (data < current.data) {
                    current = current.left;
                } else { // Handles data >= current.data, including duplicates
                    current = current.right;
                }
            }
            // After the loop, current is null, and parent is the node where newNode should be attached
            if (data < parent.data) {
                parent.left = newNode;
            } else {
                parent.right = newNode;
            }
        }
    }

    void preorder(node current) { 
        if (current != null) {
            System.out.println(current.data); 
            preorder(current.left); 
            preorder(current.right);
        }
    }

    public static void main(String[] args) { 
        binarysearchtree b = new binarysearchtree(); 
        b.insert(10);
        b.insert(20);
        b.insert(30);
        b.insert(40);
        b.insert(50);
        b.insert(60);
        b.insert(70);
        b.preorder(b.root);
    }
}