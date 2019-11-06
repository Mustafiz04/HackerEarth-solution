import java.util.*;
import java.io.*;

class TestClass{
    public static void addedge(int a,int b,LinkedList<Integer>adj[]){
        adj[a].add(b);
        adj[b].add(a);
    }
    public static void level(LinkedList<Integer>adj[],int c, boolean v[], int s, int l[], int x){
        v[s] = true;
        l[s] = 1;
        LinkedList<Integer> q = new LinkedList<>();
        q.add(s);
        while(q.size() != 0){
            s = q.poll();
            Iterator<Integer> it = adj[s].listIterator();
            while(it.hasNext()){
                int y = it.next();
                if(v[y] == false){
                    v[y] = true;
                    l[y] = l[s] + 1;
                    if(l[y] == x)
                        c++;
                        q.add(y);
                }
            }
        }
        System.out.print(c);
    }
    
    public static void main(String args[] ) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer>adj[];
        adj = new LinkedList[n+1];
        for (int i=1; i<=n; i++)
            adj[i] = new LinkedList();
            int x=0;
            for(int i=0;i<n-1;i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                addedge(a,b,adj);
            }
        x = sc.nextInt();
        boolean v[] = new boolean[n+1];
        int l[] = new int[n+1];
        Arrays.fill(l,0);
        level(adj,0,v,1,l,x);
    }   
}