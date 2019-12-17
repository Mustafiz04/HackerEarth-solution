/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
		    int n = Integer.parseInt(br.readLine());
		    String[] a1 = br.readLine().split(" ");
		    String[] a2 = br.readLine().split(" ");
		    long[] num1 = new long[n];
		    long[] num2 = new long[n];
		    for(int i = 0; i<n; i++){
		        num1[i] = Long.parseLong(a1[i]);
		        num2[i] = Long.parseLong(a2[i]);
		    }
		    Arrays.sort(num1);
		    Arrays.sort(num2);
		    long minsum = 0;
		    for(int i = 0; i<n; i++){
		        long m = num1[i]*num2[n-1-i];
		        minsum += m;
		    }
		    System.out.println(minsum);
		}
	}
}