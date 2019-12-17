import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String t = br.readLine();
        int max = 0;
        for(int i = 0; i<n; i++){
            int diff = (int)(t.charAt(i)) - (int)(s.charAt(i));
            if( diff < 0 ){
                diff += 26;
            }
            if( diff >= 13 ){
                diff = diff%13 + diff/13;
            }
            max += diff;
        }
        System.out.println(max);
    }
}
