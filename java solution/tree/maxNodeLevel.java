import java.util.*;

class Node
{
    int data;
    Node left, right;
    
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class MaximumNodes
{
        public static void insert(Node root,int a,int a1,char lr){
        if(root==null){
            return;
        }
        if(root.data==a){
            switch(lr){
                case 'L':root.left=new Node(a1);
                break;
                case 'R':root.right=new Node(a1);
                break;
            }
            return;
        }
        insert(root.left,a,a1,lr);
        insert(root.right,a,a1,lr);
    }
    
    public static void main (String[] args) 
    {
            Scanner sc=new Scanner(System.in);
            int t = sc.nextInt();
            
            while(t-->0){
            int n = sc.nextInt();
            if(n==0)
            {
                System.out.println(0);
                continue;
            }
            Node root = null;
            for(int i=0;i<n;i++){
                
                int a=sc.nextInt();
                int a1=sc.nextInt();
                
                char lr=sc.next().charAt(0);
                
                if(i==0){
                    
                    root=new Node(a);
                    
                    switch(lr)
                    {
                        
                        case 'L':root.left=new Node(a1);
                        break;
                        case 'R':root.right=new Node(a1);
                        break;
                    }
                }
                else{
                    insert(root,a,a1,lr);
                }
            }
            
            GfG g=new GfG();
            System.out.println(g.maxNodeLevel(root));
            
        }
    }
}

class GfG{
    public static int maxNodeLevel(Node root){
        if (root == null){  
            return -1;  
        }
        Queue<Node> q = new LinkedList<Node> ();  
        q.add(root);  
        int level = 0; 
        int max = Integer.MIN_VALUE; 
        int level_no = 0;  
        while (true)  { 
            int NodeCount = q.size();  
            if (NodeCount == 0)  
                break;  
            if (NodeCount > max)  {  
                max = NodeCount;  
                level_no = level;  
            } 
            while (NodeCount-- > 0)  {  
                Node Node = q.peek();  
                q.remove();  
                if (Node.left != null)  
                    q.add(Node.left);  
                if (Node.right != null)  
                    q.add(Node.right);  
 
            }
            level++;  
        }  
        return level_no;      
    }
}