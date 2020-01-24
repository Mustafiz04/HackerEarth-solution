import java.io.*;
import java.util.*;

class TestClass {
    static class Edge{
        int source;
        int des;
        int cost;
        
        public Edge(int source,int des,int cost){
            this.source = source;
            this.des = des;
            this.cost = cost;
        }
    }
    
    static class Graph{
        int vertices;
        LinkedList<Edge> [] adjacencylist;
        
        Graph(int vertices){
            this.vertices = vertices;
            adjacencylist = new LinkedList[vertices];
            for(int i = 0; i<vertices; i++){
                adjacencylist[i] = new LinkedList<>();
            }
        }
        
        public void addEdge(int source,int des, int cost){
            Edge edge = new Edge(source,des,cost);
            adjacencylist[source].addFirst(edge);
        }
        
        public void BFS(int N, int x){
            LinkedList<Integer> d = new LinkedList<Integer>();
            for (int i = 0; i <vertices ; i++) {
                LinkedList<Edge> list = adjacencylist[i];
                for (int j = 0; j <list.size() ; j++) {
                    if( list.get(j).cost <= x ){
                        d.add(list.get(j).des);
                        d.add(list.get(j).source);
                    }
                }
            }
            int cities = d.size();
            int total = comb(cities);
            System.out.println(total);
        }

        public int comb(int n ){
            if(n == 1){
                return 0;
            }else{
                return n + comb(n-1);
            }
        }
    }
    
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Graph g = new Graph(N);
        for(int i = 0; i<N-1; i++){
            String[] in = br.readLine().split(" ");
            int s = Integer.parseInt(in[0]);
            int d = Integer.parseInt(in[1]);
            int c = Integer.parseInt(in[2]);
            g.addEdge(s,d,c);
        }
        int q = Integer.parseInt(br.readLine());
        while(q-- > 0 ){
            int x = Integer.parseInt(br.readLine());
            g.BFS(N, x);
        }
    }
}
