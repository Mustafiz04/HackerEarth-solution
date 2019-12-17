import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while(n-- > 0){
            Stack<Character> st = new Stack<>();
            String ch = br.readLine();
            // int l = ch.length;
            boolean empty = false;
            boolean inbal = false;
            for(char c: ch.toCharArray() ){
                if( c == '(' || c == '{' || c == '[' ){
                    st.push(c);
                }else if( c == ')' || c == '}' || c == ']' ){
                    if( !st.isEmpty()){
                        Character brac = st.pop();
                        if( c == ')' && brac != '(' || c == '}' && brac != '{' || c == ']' && brac != '[' ){
                            inbal = true;
                            break;
                        }
                    }else{
                        empty = true;
                    } 
                }
            }
            if( st.isEmpty() && !empty && !inbal ){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
