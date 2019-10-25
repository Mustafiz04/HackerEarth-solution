import java.util.*;
import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int k=0; k<t; k++){
            int cnt=0;
            String s1 = br.readLine();
            String s2 = br.readLine();
            char[] a = s1.toCharArray();
            char[] b = s2.toCharArray();
            int l1 = a.length,l2 = b.length;
            for(int i=0;i<l1;i++){
                for(int j=0;j<l2;j++){
                    if(a[i]==b[j]){
                        ++cnt;
                        b[j]='0';
                        break;
                    }
                }
            }
            System.out.println(l1 + l2 - (2*cnt));
        }
    }
}
