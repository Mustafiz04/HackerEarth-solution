import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
	    while(n-- > 0){
	        char[] draw = br.readLine().toCharArray();
	        char A = draw[0];
	        char B = draw[1];
	        if( Character.compare(A,B) == 0 ){
	            System.out.println("DRAW");
	        }else if( (A == 'R' && B == 'S') || (A == 'S' && B == 'P') || (A == 'P' && B =='R') ){
	            System.out.println("A");
	        }else{
	            System.out.println("B");
	        }
	       
	    }
	}
}