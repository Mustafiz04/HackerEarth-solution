import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int N = Integer.parseInt(in[0]);
        int K = Integer.parseInt(in[1]);
        int[] chapter = new int[N];
        for(int i = 0; i<N; i++){
            chapter[i] = Integer.parseInt(br.readLine());
        }
        int read = 0;
        int l = 0;
        int r = N-1;
        while(l < r){
            if( chapter[l] <= K ){
                read++;
                l++;
            }else if( chapter[r] <= K ){
                read++;
                r--;
            }else{
                break;
            }
        }
        System.out.println(N-read);
    }
}
