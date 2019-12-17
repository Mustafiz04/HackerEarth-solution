import java.util.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
		    int n = Integer.parseInt(br.readLine());
		    String[] ch = br.readLine().split(" ");
		    int[] choc = new int[n];
		    for(int i = 0; i<n; i++){
		        choc[i] = Integer.parseInt(ch[i]);
		    }
		    int l = 0, r = n-1;
		    while(l != r){
		        if( choc[l] >= choc[r] ){
		            l++;
		        }else{
		            r--;
		        }
		    }
		    System.out.println( choc[l] );
		}
	}
}