import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            String[] in = br.readLine().split(" ");
            long[] m = new long[n];
            long[] p = new long[n];
            for(int i = 0;i < n; i++){
                m[i] = Long.parseLong(in[i]);
                p[i] = 2*Long.parseLong(in[i]);
            }
            long motu = 0, patlu = 0;
            int l = 0, r = n-1, sum1 = 0, sum2 = 0;
            while(l<=r ){
                if( sum1 > sum2 ){
                    sum2 += p[r];
                    r--;
                    patlu++;
                }else{
                    sum1 += m[l];
                    l++;
                    motu++;
                }
            }
            System.out.println(motu + " " + patlu);
            if( motu > patlu ){
                System.out.println("Motu");
            }else if( patlu > motu ){
                System.out.println("Patlu");
            }else{
                System.out.println("Tie");
            }
        }
    }
}
