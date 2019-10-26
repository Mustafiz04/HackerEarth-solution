import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String s = b.readLine();
        String str = "";
        int len = s.length();
        for(int i = 0; i < len; i++){
            char c = s.charAt(i);
            if(c>=65 && c<=90)
                str = str + (char)(c+32);
            else
                str = str + (char)(c-32);
        }
        System.out.println(str);
    }
}
