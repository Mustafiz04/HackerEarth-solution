import java.util.*;

class Graph{
    public static int path(ArrayList<Integer> arr[], int start, int n){
        int a[] = new int[n+1];
        LinkedList<Integer> q = new LinkedList<>();
        q.add(start);
        a[start] = 0;
        boolean[] v = new boolean[n+1];
        v[start] = true;
        while(q.size() > 0){
            int x = q.poll();
            ArrayList<Integer> arr1 = arr[x];
            for(int i = 0;i<arr1.size(); i++ ){
                int p = arr1.get(i);
                if( !v[p] ){
                    q.add(p);
                    v[p] = true;
                    if( p == n ){
                        return a[x] + 1;
                    }else{
                        a[p] = a[x] + 1;
                    }
                }
            }
        }
        return -1;
    }
    
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while(T-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            ArrayList<Integer> arr[] = new ArrayList[n+1];
            for(int i = 0; i< n+1; i++){
                arr[i] = new ArrayList<>();
            }
            
            for(int i = 0; i<m ;i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                arr[x].add(y);
                arr[y].add(x);
            }
            int r = path(arr,1,n);
            System.out.println(r);
        }
    }
}