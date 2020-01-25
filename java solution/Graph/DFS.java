import java.io.*;
import java.util.*;

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
    void DFSutil(int v, boolean visited[]){
        visited[v] = true;
        System.out.print(v + " ");
        Iterator<Integer> i = adj[v].listIterator();
        while( i.hasNext() ){
            int n = i.next();
            if(!visited[n]){
                DFSutil(n, visited);
            }
        }
    }
    void DFS(int v){
        boolean visited[] = new boolean[V];
        DFSutil(v, visited);
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
        System.out.println("Following is DFS stating grom vertex (Starting from vetex 1)");
        g.DFS(1);
    }
}