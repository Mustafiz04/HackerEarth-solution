import java.io.*;
import java.util.*;

class Mustafiz{
    public static void main(String args[]) throws Exception {
        Stack<String> st = new Stack<String>();
        st.push("Mustafiz");
        st.push("Kaifee");
        st.push("Mishal");
        st.push("Faheem");
        ListIterator l = st.listIterator();
        while(l.hasNext()){
            System.out.println(l.next());
        }
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.empty());
        System.err.println(st.search("Faheem"));
    }    
}
