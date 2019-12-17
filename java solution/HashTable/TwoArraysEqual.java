import java.util.*;
import java.io.*;

class Codesthaan {
	public static void main (String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    while(t-- > 0){
	        int n = Integer.parseInt(br.readLine());
	        String[] s1 = br.readLine().split(" ");
	        String[] s2 = br.readLine().split(" ");
	        int[] arr1 = new int[n];
	        int[] arr2 = new int[n];
	        for(int i = 0; i< n; i++){
	            arr1[i] = Integer.parseInt(s1[i]);
	            arr2[i] = Integer.parseInt(s2[i]);
	        }
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);
	        boolean flag = true;
	        for(int i = 0; i<n ; i++){
	            if( arr1[i] != arr2[i] ){
	                flag = false;
	                break;
	            }
	        }
	        if(flag){
	            System.out.println(1);
	        }else{
	            System.out.println(0);
	        }
	    }
	}
}