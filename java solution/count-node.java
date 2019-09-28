import java.util.*;

class List{

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node head;

    public void push(int data){
        Node new_node = new Node(data);

        new_node.next = head;
        head = new_node;
    }

    public int count(){
        Node temp = head;
        int c = 0;
        while(temp != null){
            c++;
            temp = temp.next;
        }
        return c;
    }

    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int T = sc.nextInt();
       
       while(T-- > 0){
            int n = sc.nextInt();
            List l = new List();
            for(int i = 0; i<n; i++){
                l.push(sc.nextInt());                
            }
            System.out.println(l.count());
       }

        
    }


}