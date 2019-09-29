
import java.util.*;
import java.util.HashMap;
class Node{
    int data;
    Node left,right;
    Node(int d) {data = d; left =right= null; }
}
        
public class nonLeaf{
    public static void inorder(Node root){
        if(root==null)
        return;
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t-->0){
        int n = sc.nextInt();
        nonLeaf llist=new nonLeaf();
        Node root=null,parent=null;
        HashMap<Integer, Node> m = new HashMap<>();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            char c=sc.next().charAt(0);
            if(m.containsKey(a)==false){
                parent=new Node(a);
                m.put(a,parent);
                if(root==null)
                root=parent;
            }
            else
                parent=m.get(a);
            Node child=new Node(b);
            if(c=='L')
            parent.left=child;
            else
            parent.right=child;
            m.put(b,child);
        }
        GFG obj = new GFG();
        int p=obj.countNonLeafNodes(root);
        System.out.println(p);
        }
    }
}

class GFG{
    int countNonLeafNodes(Node root){
        if(root == null || (root.left == null && root.right == null)){
            return 0;
        }else{
            return 1 + countNonLeafNodes(root.left) + countNonLeafNodes(root.right);
        }
    }
}