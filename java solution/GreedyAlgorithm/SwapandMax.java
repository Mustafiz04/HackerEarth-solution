import java.util.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
		    int n = Integer.parseInt(br.readLine());
		    String[] in = br.readLine().split(" ");
		    int[] num = new int[n];
		    for(int i = 0; i<n; i++){
		        num[i] = Integer.parseInt(in[i]);
		    }
		    int sum = 0;
		    Arrays.sort(num);
		    for(int i = 0; i<n/2; i++){
		        sum -= 2*num[i];
		        sum += 2*num[n-i-1];
		    }
		    System.out.println(sum);
		}
	}
}