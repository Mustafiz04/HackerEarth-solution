import java.util.*;
 
class TestClass {
    int V;
    LinkedList<Integer> graph[] ;
    
    public TestClass(int nodes){
        this.V = nodes;
        graph = new LinkedList[V+1];
        
        for(int i=0;i<V+1; i++)
            graph[i] = new LinkedList<>();
    }
    
    public void addEdge(int a, int b){
        graph[a].add(b);
        graph[b].add(a);
    }
    
    void findNearestNeighbourUsingBfs(int start, boolean [] isGfThere){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        int level[] = new int[V+1];
        boolean visited[] = new  boolean[V+1];
        visited[start]=true;
        level[start]=1;
        
        while(!queue.isEmpty()){
            int currRoot = queue.poll();
            
            for(int i=0;i<graph[currRoot].size();i++){
                int tmp= graph[currRoot].get(i);
                
                if(!visited[tmp]){
                    level[tmp]=level[currRoot]+1;
                    queue.add(tmp);
                    visited[tmp]=true;
                }
            }
        }
        
        Arrays.sort(level);
        int gf = Integer.MAX_VALUE;
        for(int i=0;i<=V;i++){
            if(isGfThere[i] && gf > level[i]){
            gf=i; break;
            }
 
        }
        
        System.out.println(gf);
    }
    public static void main(String args[] ) throws Exception {
 
        Scanner sc = new Scanner(System.in);
        int nodes = sc.nextInt();
        
        TestClass graph = new TestClass(nodes);
        for(int i=1;i<nodes;i++)
        graph.addEdge(sc.nextInt(), sc.nextInt());
        
        boolean isGfThere[] = new boolean[nodes+1];
        
        int q=sc.nextInt();
        while(q-->0)
        isGfThere[sc.nextInt()]=true;
        
        
        graph.findNearestNeighbourUsingBfs(1, isGfThere);
 
    }
}