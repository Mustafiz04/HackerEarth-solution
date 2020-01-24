import java.util.*;
import java.io.*;

class Graph{
    private int V; 
    private LinkedList<Integer> adj[];
    Graph(int v){
        V = v;
        adj = new LinkedList[v];
        for(int i = 0; i<v; i++){
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w){
        adj[v].add(w);
    }

    void BFS(int s){
        boolean[] visited = new boolean[V];  
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);
        while( queue.size() != 0 ){
            s = queue.poll();
            System.out.print(s + " ");
            Iterator<Integer> i = adj[s].listIterator();
            while( i.hasNext() ){
                int n = i.next();
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of graph : ");
        int n = sc.nextInt();
        Graph g = new Graph(n+1);
        System.out.print("Enter the size relation in the graph : ");
        int t = sc.nextInt();
        while(t-- > 0){
            g.addEdge(sc.nextInt(), sc.nextInt());
        }
        System.out.println("Following is BFS stating grom vertex (Starting from vetex 1)");
        g.BFS(1);
    }
}