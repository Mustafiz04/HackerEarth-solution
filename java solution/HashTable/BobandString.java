import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while(n-- > 0){
            String s = br.readLine();
            String t = br.readLine();
            int[] sc = new int[26];
            int[] tc = new int[26];
            for(int i = 0; i<s.length(); i++ ){
                sc[ s.charAt(i) - 'a' ]++;
            }
            for(int i = 0; i<t.length(); i++ ){
                tc[ t.charAt(i) - 'a' ]++;
            }
            
            int diff = 0;
            for(int i = 0; i<26; i++){
                diff += Math.abs( sc[i] - tc[i] );
            }
            System.out.println(diff);
        }
    }
}
