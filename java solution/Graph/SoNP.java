import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String ss[] = s.split(" ");
        
        int n,e,k;
        n = Integer.parseInt(ss[0]);
        e = Integer.parseInt(ss[1]);
        k = Integer.parseInt(ss[2]);
        
        ArrayList<Integer>ls[] = new ArrayList[n+1];
        
        for(int i=0 ; i<=n; i++)
            ls[i] = new ArrayList();
            
        Queue<Integer> qs = new LinkedList<>();
        for(int i=0; i<e; i++){
            s = br.readLine();
            ss = s.split(" ") ;
            ls[Integer.parseInt(ss[0])].add(Integer.parseInt(ss[1]));
            ls[Integer.parseInt(ss[1])].add(Integer.parseInt(ss[0]));
        }   

        int count = 0;
        int vis[] = new int[n+1];
        for(int i=1; i<=n; i++){
            qs.add(i);
            if(vis[i] == 0){
                count++;
            }
            while( !qs.isEmpty() ){
                int x = qs.poll();
                vis[x] = 1;
                for(int j=0; j<ls[x].size(); j++){ 
                    int temp = ls[x].get(j);
                    if(vis[temp] == 0){
                        qs.add(temp);
                    // vis[temp]=1;
                    }
                }
            }
        }
        if( count <= k )
            System.out.println( (e-n)+k );
        else
            System.out.println(-1);
    
        }
    }