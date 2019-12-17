import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String[] in = br.readLine().split(" ");
            int n = Integer.parseInt(in[0]);
            int q = Integer.parseInt(in[1]);
            String[] l = br.readLine().split(" ");
            int[] lit = new int[n];
            for(int i = 0; i<n; i++){
                lit[i] = Integer.parseInt(l[i]);
            }
            Arrays.sort(lit);
            int c = 0, rem = 0;
            for(int i = 0; i< n; i++){
                if(lit[i] <= q && ( rem + lit[i] <= q ) ){
                    rem += lit[i];
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}

