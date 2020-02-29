/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int sum = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i = 0; i<n; i++){
		        arr[i] = sc.nextInt();
		    }
		    int c = count(arr, n, sum);
		    System.out.println(c);
		}
	}
	
	public static int count(int[] arr, int n, int sum ){
	    HashMap<Integer, Integer> hm = new HashMap<>();
	    for(int i = 0; i<n; i++){
	        if( !hm.containsKey(arr[i] )){
	            hm.put(arr[i], 0);
	        }
	        hm.put(arr[i], hm.get(arr[i])+1 );
	    }
	    int dou = 0;
	    for(int i = 0; i<n; i++){
	        if( hm.get(sum-arr[i]) != null ){
	            dou += hm.get(sum-arr[i]);
	        }
	        if( sum-arr[i] == arr[i] ){
	            dou--;
	        }
	    }
	    return dou/2;
	}
}