<<<<<<< HEAD
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;
class Node{
    int data;
    Node left,right;
    
    Node(int d){
        data = d;
        left = right = null;		
    }
}
class BinarySearchTree{
    static Node insert(Node node, int data){
        if (node == null){
            return (new Node(data));
        } else {
            if (data <= node.data){
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }
            return node;
        }
    }
    
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            Node root = null;
            
            while(n-- > 0){
                int data = sc.nextInt();
                root = insert(root, data);
            }
            
                BST gfg = new BST();
                
                System.out.println(gfg.minValue(root));
        }
    }
}

    
    
class BST{
    int min;
    int minValue(Node node){
        if(node == null){
            return -1;
        }else{
            if(node != null){
                if(node.left == null){
                    min = node.data; 
                }else{
                    min = minValue(node.left);
                }
            }
        }
        return min;
    }
}
=======
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;
class Node{
    int data;
    Node left,right;
    
    Node(int d){
        data = d;
        left = right = null;		
    }
}
class BinarySearchTree{
    static Node insert(Node node, int data){
        if (node == null){
            return (new Node(data));
        } else {
            if (data <= node.data){
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }
            return node;
        }
    }
    
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            Node root = null;
            
            while(n-- > 0){
                int data = sc.nextInt();
                root = insert(root, data);
            }
            
                BST gfg = new BST();
                
                System.out.println(gfg.minValue(root));
        }
    }
}

    
    
class BST{
    int min;
    int minValue(Node node){
        if(node == null){
            return -1;
        }else{
            if(node != null){
                if(node.left == null){
                    min = node.data; 
                }else{
                    min = minValue(node.left);
                }
            }
        }
        return min;
    }
}
>>>>>>> 366dafd5b5dc1ecafc996d94ea1eeb0ac45229e6
