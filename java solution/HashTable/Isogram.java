import java.util.*;
import java.lang.*;
import java.io.*;
class GFG{
    public static void main (String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        while(testCase-- > 0){
            String data = br.readLine();
            System.out.println(isIsogram(data)?"1":"0");
            
        }
    }
    static boolean isIsogram(String data){
        Hashtable<Character, Integer> ht = new Hashtable<>();
        for(int i = 0; i< data.length(); i++ ){
            char x = data.charAt(i);
            if( ht.containsKey(x) ){
                int val = ht.get(x);
                val++;
                ht.put(x,val);
            }else{
                ht.put(x,1);
            }
        }
        int max = Collections.max(ht.values());
        if(max > 1){
            return false;
        }else{
            return true;
        }
    }
}
    