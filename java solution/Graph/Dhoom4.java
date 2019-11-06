import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] val = br.readLine().split(" ");
        long skey = Long.parseLong(val[0]);
        long lock = Long.parseLong(val[1]);
        
        int n = Integer.parseInt(br.readLine());
        
        String[] okey = br.readLine().split(" ");
        long[] otherKey = new long[n];
        for(int i = 0; i<n; i++){
            otherKey[i] = Long.parseLong(okey[i]);
        }
        
        int[] cnt = new int[100001];
        Queue<Long> q = new LinkedList<Long>();
        
        q.add(skey);
        int ans = -1;
        while( !q.isEmpty() ){
            long x = (long)q.poll();
            if(x == lock ){
                ans = cnt[(int)x];
                break;
            }
            for(int i = 0; i<n; i++){
                long p = (otherKey[i]*x)%100000;
                if( cnt[(int)p] > 0 )
                    continue;
                cnt[(int)p] = cnt[(int)x] +1;
                q.add(p);
            }
        }
        System.out.println(ans);
    }
}
