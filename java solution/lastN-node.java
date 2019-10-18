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

    // add at last
    public void push(int data){
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            } 
            temp.next = node;
        }
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

    public int sumLastN(int n){
        Node temp = head;
        int c = 0;
        int len = count();
        int s = 0;
        while(temp != null){
            if(s >= len - n){
                c += temp.data;
            }
            s++;
            temp = temp.next;
        }

        return c;
    }



    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while(T-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            List l = new List();
            for(int i = 0; i<n; i++){
                l.push(sc.nextInt());                
            }
            System.out.println(l.sumLastN(m));
        }
    }
}