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
        Node n = new Node(data);
        if(head == null){
            head = n;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    public int middleNode(){
        Node one = head;
        Node two = head;
        if( head != null){
            while(two != null && two.next != null){
                two = two.next.next;
                one = one.next;
            }
        }
        return one.data;
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
            System.out.println(l.middleNode());
        }
    }
}