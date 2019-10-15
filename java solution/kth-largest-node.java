import java.util.*;

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=null;
        right=null;
    }
}

class K{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n=sc.nextInt();
            Node root=new Node(sc.nextInt());
            for(int i=0;i<n-1;i++)
                insert(root,sc.nextInt());
            int k=sc.nextInt();
            GfG g = new GfG();
            g.kthLargest(root,k);
        }
    }
    public static Node insert(Node root,int n){
        if(root==null)
            return new Node(n);
        if(n<root.data)
            root.left=insert(root.left,n);
        if(n>root.data)
            root.right=insert(root.right,n);
        return root;
    }
}

class GfG{
    int c = 0;
    public void kthLargest(Node root,int k){
        if( root == null || c >= k ){
            return;
        }
        kthLargest(root.right, k);
        c++;
        if(c == k){
            System.out.println(root.data);
        }
        kthLargest(root.left, k); 
    }
}