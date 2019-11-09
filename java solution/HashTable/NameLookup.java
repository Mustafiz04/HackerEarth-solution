import java.io.*;
import java.util.*;


class testClass{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Hashtable<Integer, String> h = new Hashtable<Integer, String>();
        while(n-- > 0){
            String[] in = br.readLine().split(" ");
            int key = Integer.parseInt(in[0]);
            String value = in[1];
            h.put(key, value);
        }
        int q = Integer.parseInt(br.readLine());
        while(q-- > 0){
            int k = Integer.parseInt(br.readLine());
            System.out.println(h.get(k));
        }
    }
}