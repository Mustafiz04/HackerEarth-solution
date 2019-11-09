import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Hashtable<Integer, Integer> h = new Hashtable<>();
        
        for(int i = 0; i<str.length(); i++ ){
            int j = str.charAt(i);
            if( h.containsKey(j) ){
                int val = h.get(j);
                val++;
                h.put(j,val);
            }else{
                h.put(j,1);
            }
        }
        
        int value = Collections.max(h.values());
        List<Integer> listofkey = new ArrayList<>();
        
        for( Map.Entry<Integer, Integer> entry : h.entrySet() ){
            if(entry.getValue().equals(value) ){
                listofkey.add(entry.getKey());
            }
        }
        int a = Collections.min(listofkey);
        char sym = (char)(a);
        System.out.println(sym + " " + value);
    }
}
