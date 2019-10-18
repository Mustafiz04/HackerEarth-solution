<<<<<<< HEAD

import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;
class Node{
    int data;
    Node left, right;
    
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
class BST{
    public static Node insert(Node node, int data){
        if (node == null){
            return (new Node(data));
        } else {
            if (data < node.data){
                node.left = insert(node.left, data);
            } else if (data > node.data) {
                node.right = insert(node.right, data);
            }
            
            return node;
        }
    
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            
            Node root1 = null;
            Node root2 = null;
            int n1 = sc.nextInt();
            while(n1-- > 0){
            int data = sc.nextInt();
                root1 = insert(root1, data);
            }
            
            int n2 = sc.nextInt();
            while(n2 -- > 0){
                int data = sc.nextInt();
                root2 = insert(root2, data);
            }
            
            int s = sc.nextInt();
            
            GfG gfg = new GfG();
            System.out.println(gfg.countPairs(root1, root2, s));
        }
        
        
    }
}

class GfG
{
    int total = 0;
    public static int countPairs(Node root1, Node root2, int x)
    {
        if (root1 == null || root2 == null) 
            return 0; 
        Stack<Node> st1 = new Stack<>(); 
        Stack<Node> st2 = new Stack<>(); 
        Node top1, top2; 
        
        int count = 0; 

        while (true) { 

            while (root1 != null) { 
                st1.push(root1); 
                root1 = root1.left; 
            } 
            while (root2 != null) { 
                st2.push(root2); 
                root2 = root2.right; 
            } 
        
            if (st1.empty() || st2.empty()) 
                break; 
        
            top1 = st1.peek(); 
            top2 = st2.peek(); 
        
            if ((top1.data + top2.data) == x) { 
                count++; 

                st1.pop(); 
                st2.pop(); 

                root1 = top1.right; 
                root2 = top2.left; 
            } 

            else if ((top1.data + top2.data) < x) { 
                st1.pop(); 
                root1 = top1.right; 
            } 

            else { 
                st2.pop(); 
                root2 = top2.left; 
            } 
        } 

        return count; 
        
    }
}
=======

import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;
class Node{
    int data;
    Node left, right;
    
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
class BST{
    public static Node insert(Node node, int data){
        if (node == null){
            return (new Node(data));
        } else {
            if (data < node.data){
                node.left = insert(node.left, data);
            } else if (data > node.data) {
                node.right = insert(node.right, data);
            }
            
            return node;
        }
    
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            
            Node root1 = null;
            Node root2 = null;
            int n1 = sc.nextInt();
            while(n1-- > 0){
            int data = sc.nextInt();
                root1 = insert(root1, data);
            }
            
            int n2 = sc.nextInt();
            while(n2 -- > 0){
                int data = sc.nextInt();
                root2 = insert(root2, data);
            }
            
            int s = sc.nextInt();
            
            GfG gfg = new GfG();
            System.out.println(gfg.countPairs(root1, root2, s));
        }
        
        
    }
}

class GfG
{
    int total = 0;
    public static int countPairs(Node root1, Node root2, int x)
    {
        if (root1 == null || root2 == null) 
            return 0; 
        Stack<Node> st1 = new Stack<>(); 
        Stack<Node> st2 = new Stack<>(); 
        Node top1, top2; 
        
        int count = 0; 

        while (true) { 

            while (root1 != null) { 
                st1.push(root1); 
                root1 = root1.left; 
            } 
            while (root2 != null) { 
                st2.push(root2); 
                root2 = root2.right; 
            } 
        
            if (st1.empty() || st2.empty()) 
                break; 
        
            top1 = st1.peek(); 
            top2 = st2.peek(); 
        
            if ((top1.data + top2.data) == x) { 
                count++; 

                st1.pop(); 
                st2.pop(); 

                root1 = top1.right; 
                root2 = top2.left; 
            } 

            else if ((top1.data + top2.data) < x) { 
                st1.pop(); 
                root1 = top1.right; 
            } 

            else { 
                st2.pop(); 
                root2 = top2.left; 
            } 
        } 

        return count; 
        
    }
}
>>>>>>> 366dafd5b5dc1ecafc996d94ea1eeb0ac45229e6
