import java.util.*;
import java.lang.*;
import java.io.*;

class Driverclass{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-- > 0){
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int nov = sc.nextInt();
            int edg  =sc.nextInt();
            for(int i = 0; i < nov; i++)
                list.add(i, new ArrayList<Integer>());
                
            for(int i = 1; i <= edg; i++){
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
                list.get(v).add(u);
            }
            boolean vis[] = new boolean[nov];
            for(int i = 0; i < nov; i++)
                vis[i] = false;
            dfs(0, list, vis);
            System.out.println();
        }
    }

    static void dfs(int src, ArrayList<ArrayList<Integer>> list, boolean vis[]){
        vis[src] = true;
        System.out.print(src + " ");
        Iterator<Integer> i = list.get(src).iterator();
        while(i.hasNext()){
            int n = i.next();
            if( !vis[n]){
                dfs(n,list, vis);
            }
        }
    }
}


// class Traversal{
//     static void dfs(int src, ArrayList<ArrayList<Integer>> list, boolean vis[]){
//         vis[src] = true;
//         System.out.print(src + " ");
//         Iterator<Integer> i = list.get(src).iterator();
//         while(i.hasNext()){
//             int n = i.next();
//             if( !vis[n]){
//                 dfs(n,list, vis);
//             }
//         }
//     }
// }
