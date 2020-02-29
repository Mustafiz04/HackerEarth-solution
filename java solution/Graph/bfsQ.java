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
            int edg = sc.nextInt();
            
            for(int i = 0; i < nov; i++)
                list.add(i, new ArrayList<Integer>());
                
            for(int i = 1; i <= edg; i++){
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            boolean vis[] = new boolean[nov];
            for(int i = 0; i < nov; i++)
                vis[i] = false;
            bfs(0, list, vis, nov);
            System.out.println();
        }
    }

    static void bfs(int s, ArrayList<ArrayList<Integer>> list, boolean vis[], int nov){
        LinkedList<Integer> queue = new LinkedList<Integer>();
        vis[s] = true;
        queue.add(s);
        while(queue.size() != 0){
            s = queue.poll();
            System.out.print(s + " ");
            Iterator<Integer> i = list.get(s).iterator();
            
            while(i.hasNext()){
                int n = i.next();
                if( !vis[n]){
                    vis[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}

// class Traversal{
//     static void bfs(int s, ArrayList<ArrayList<Integer>> list, boolean vis[], int nov){
//         LinkedList<Integer> queue = new LinkedList<Integer>();
//         vis[s] = true;
//         queue.add(s);
//         while(queue.size() != 0){
//             s = queue.poll();
//             System.out.print(s + " ");
//             Iterator<Integer> i = list.get(s).iterator();
            
//             while(i.hasNext()){
//                 int n = i.next();
//                 if( !vis[n]){
//                     vis[n] = true;
//                     queue.add(n);
//                 }
//             }
//         }
//     }
// }