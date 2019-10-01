
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;

class Node{
    int key;
    Node left, right;
    Node(int item){
        key = item;
        left = right = null;
    }
}

class BST_Keys_Range{
    Node root;
    
    void insert(Node root, int key){
        if(key < root.key){ 
            if(root.left != null)
                insert(root.left, key);
            else{
                root.left = new Node(key);
            }
        }
        else if(key >= root.key){
            if(root.right != null)
                insert(root.right, key);
            else{
                root.right = new Node(key);
            }

        }
    }
    

    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0){

            int n = sc.nextInt();
            BST_Keys_Range tree = new BST_Keys_Range();
            int a1 = sc.nextInt();
            Node root = new Node(a1);
            
            for(int i=1;i<n;i++){
                int a = sc.nextInt();
                tree.insert(root,a);
            }
            
            int l = sc.nextInt();
            int h = sc.nextInt();
        
            GfG g = new GfG();
            g.printNearNodes(root, l, h);
            System.out.println();
            
        t--;
        }
    }
}

class GfG{   
    void printNearNodes(Node node, int k1, int k2){
        if (node == null) { 
            return; 
        } 

        if (k1 < node.key) { 
            printNearNodes(node.left, k1, k2); 
        } 

        if (k1 <= node.key && k2 >= node.key) { 
            System.out.print(node.key + " "); 
        } 
    
        if (k2 > node.key) { 
            printNearNodes(node.right, k1, k2); 
        } 
    }    
}