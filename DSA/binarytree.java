class node{
    int data;
    node left;
    node right;
    node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

public class binarytree {
    void inorder(node root){
        if(root!=null){
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }

    void preorder(node root){
        if(root!=null){
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }
    void postorder(node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }
    }

    void levelorder(node root){
        if(root!=null){
            System.out.println(root.data);
            levelorder(root.left);
            levelorder(root.right);
        }
    }

    public static void main(String[] args) {
        binarytree bt = new binarytree();
        node root = new node(10);
        root.left = new node(20);
        root.right = new node(30);
        root.left.left = new node(40);
        root.left.right = new node(50);
        root.right.left = new node(60);
        root.right.right = new node(70);
        System.out.println("Inorder traversal");
        bt.inorder(root);
        System.out.println("Preorder traversal");
        bt.preorder(root);
        System.out.println("Postorder traversal");
        bt.postorder(root);
        System.out.println("Level Order");
        bt.levelorder(root);
    }
}



