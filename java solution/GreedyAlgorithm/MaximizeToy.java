import java.util.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
            String[] in = br.readLine().split(" ");
            int n = Integer.parseInt(in[0]);
            int k = Integer.parseInt(in[1]);
            String[] val = br.readLine().split(" ");
            int[] cost = new int[n];
            for(int i = 0; i< n; i++){
                cost[i] = Integer.parseInt(val[i]);
            }
            Arrays.sort(cost);
            int total = 0;
            int rem = 0;
            for(int i = 0 ; i<n; i++){
                if( cost[i] <= k && cost[i] + rem <= k ){
                    total++;
                    rem += cost[i];
                }
            }
            System.out.println(total);
		}
	}
}