import java.io.*;
import java.util.*;

// This class represents a directed graph using adjacency list
// representation
class Graph{
    private int V; // No. of vertices
    static int c=0;
    ArrayList<Integer> al =  new ArrayList();

    // Array of lists for Adjacency List Representation
    private LinkedList<Integer> adj[];
    
    // Constructor
    Graph(int v){
        V = v;
        adj = new LinkedList[v+1];
        for (int i = 1; i <= v; ++i)
            adj[i] = new LinkedList();
    }

    //Function to add an edge into the graph
    void addEdge(int v, int w){
        adj[v].add(w); // Add w to v's list.
    }

    // A function used by DFS
    void DFSUtil(int v, boolean visited[]){
        // Mark the current node as visited and print it
        visited[v] = true;
        //System.out.print(v+" ");
        al.add(v);
        
        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()){
            int n = i.next();
            if (!visited[n])
                DFSUtil(n,visited);
        }
    }

    // The function to do DFS traversal. It uses recursive DFSUtil()
    void DFS(int point, int n){
        // Mark all the vertices as not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[V+1];
        
        // Call the recursive helper function to print DFS traversal
        // starting from all vertices one by one
        
        DFSUtil(point, visited);
        System.out.println(n - al.size());
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Graph g = new Graph(n);
        while(m-- >0){
            int x = in.nextInt();
            int y = in.nextInt();
            g.addEdge(x, y);
            g.addEdge(y,x);
        }
        int point = in.nextInt();
        g.DFS(point,n);
    }
}