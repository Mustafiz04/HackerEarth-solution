<<<<<<< HEAD
import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}

class Mirror_Tree{
    void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.data + " ");

        inOrder(node.right);
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Mirror_Tree mt = new Mirror_Tree();
        int t = sc.nextInt();
        while (t > 0)
        {
            HashMap<Integer, Node> m = new HashMap<Integer, Node> ();
            int n = sc.nextInt();
            Node root = null;
            while (n > 0)
            {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                char lr = sc.next().charAt(0);

                Node parent = m.get(n1);
                if (parent == null)
                {
                    parent = new Node(n1);
                    m.put(n1, parent);
                    if (root == null)
                        root = parent;
                }
                Node child = new Node(n2);
                if (lr == 'L')
                    parent.left = child;
                else
                    parent.right = child;
                m.put(n2, child);
                n--;
            }
            Tree g = new Tree();
            g.mirror(root);
            mt.inOrder(root);
            System.out.println();
            t--;
        }
    }
}


// recursion
class Tree{
    Node mirror(Node node){
        if(node == null){
            return node;
        }
        
        Node left = mirror(node.left);
        Node right = mirror(node.right);
        
        node.left = right;
        node.right = left;
        
        return node; 
    }
}


// iteration
class Tree{
    void mirror(Node node){
        if(node == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(node);

        while(q.size() > 0){

            Node c = q.peek();
            q.remove();

            Node temp = c.left;
            c.left = c.right;
            c.right = temp;

            if(c.left != null){
                q.add(c.left);
            }
            if(c.right != null){
                q.add(c.right);
            }

        }


    }
=======
import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}

class Mirror_Tree{
    void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.data + " ");

        inOrder(node.right);
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Mirror_Tree mt = new Mirror_Tree();
        int t = sc.nextInt();
        while (t > 0)
        {
            HashMap<Integer, Node> m = new HashMap<Integer, Node> ();
            int n = sc.nextInt();
            Node root = null;
            while (n > 0)
            {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                char lr = sc.next().charAt(0);

                Node parent = m.get(n1);
                if (parent == null)
                {
                    parent = new Node(n1);
                    m.put(n1, parent);
                    if (root == null)
                        root = parent;
                }
                Node child = new Node(n2);
                if (lr == 'L')
                    parent.left = child;
                else
                    parent.right = child;
                m.put(n2, child);
                n--;
            }
            Tree g = new Tree();
            g.mirror(root);
            mt.inOrder(root);
            System.out.println();
            t--;
        }
    }
}


// recursion
class Tree{
    Node mirror(Node node){
        if(node == null){
            return node;
        }
        
        Node left = mirror(node.left);
        Node right = mirror(node.right);
        
        node.left = right;
        node.right = left;
        
        return node; 
    }
}


// iteration
class Tree{
    void mirror(Node node){
        if(node == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(node);

        while(q.size() > 0){

            Node c = q.peek();
            q.remove();

            Node temp = c.left;
            c.left = c.right;
            c.right = temp;

            if(c.left != null){
                q.add(c.left);
            }
            if(c.right != null){
                q.add(c.right);
            }

        }


    }
>>>>>>> 366dafd5b5dc1ecafc996d94ea1eeb0ac45229e6
}