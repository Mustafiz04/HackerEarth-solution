import java.util.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
		    String[] in = br.readLine().split(" ");
		    int sod = Integer.parseInt(in[0]);
		    int nod = Integer.parseInt(in[1]);
		    if( sod == 0 ){
		        System.out.println(nod == 1 ? 0 : -1);
		    }else if( 9*nod < sod ){
		        System.out.println(-1);
		    }else{
		        int[] res = new int[nod];
    		    sod -= 1;
    		    for(int i = nod-1; i>0; i-- ){
    		        if( sod > 9 ){
    		            res[i] = 9;
    		            sod -= 9;
    		        }else{
    		            res[i] = sod;
    		            sod = 0;
        	        }
    		    }
    		    res[0] = sod + 1;
    		    for(int i = 0; i<nod; i++){
    		        System.out.print(res[i]);
    		    }
    		    System.out.println();
		    }
    	}
	}
}