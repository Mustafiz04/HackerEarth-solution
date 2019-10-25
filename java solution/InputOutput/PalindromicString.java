import java.util.*;
import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String rev = "";
        for(int i = s.length()-1; i>=0; i--){
            rev = rev + s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
